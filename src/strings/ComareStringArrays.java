package strings;

import java.util.Arrays;

public class ComareStringArrays {
    public static void main(String[] args) {

        String[] strings1 = {"One", "Three","Six","Seven"};
        String[] strings2 = {"Three", "One"};

        if (compareStringArrays(strings1, strings2))
            System.out.println("All are present");
        else System.out.println("No matched");

        if (compareStringArrayStream(strings1, strings2))
            System.out.println("Stream: All are present");
        else System.out.println("Stream: No matched");

        if (compareStringArrayStreamEfficient(strings1, strings2))
            System.out.println("Stream eff: All are present");
        else System.out.println("Stream eff: No matched");

    }
    public static boolean compareStringArrays(String[]s1, String[] s2){
        int counter=0;
        for(String str: s1){
           for (String str2: s2){
               if (str.equals(str2)) {
                   counter++;
                   break;
               }
           }
        }
        if(Math.min(s1.length, s2.length)==counter)
            return true;
        return false;
    }

    public static boolean compareStringArrayStream(String[]s1, String[] s2){

        if(s1.length!=s2.length) return false;

        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i < s1.length; i++) {
            if(!s1[i].equals(s2[i]))
                return false;
        }
        return true;
    }

    public static boolean compareStringArrayStreamEfficient(String[]s1, String[] s2){

        boolean first =  Arrays.stream(s1)
                .allMatch(
                        n->Arrays.stream(s2).anyMatch(n::equals)
                );

        boolean second = Arrays.stream(s2)
                .allMatch(ele->Arrays.stream(s1).anyMatch(ele::equals)
                );

        return first && second;

    }
}
