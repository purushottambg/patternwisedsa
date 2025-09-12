package slidingWindow;

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("XYYX", 2));
    }

    public static int characterReplacement(String s, int k){
        int longest=0,left=0, right=1,opsCount=0;

        while (left<=right && right<s.length()){
            if(s.charAt(left)==s.charAt(right) && opsCount<=k){
                left=right;
                right++;
                System.out.println("Left:"+left+" Right:"+right+" longest:"+longest);
            }else if(opsCount<k){
                opsCount++;
                right++;
                System.out.println("Left:"+left+" Right:"+right+" longest:"+longest);
            }else longest=Math.max(longest, right);
            left=right;
            right++;

        }

        return longest;
    }

    /**
     public static int characterReplacement(String s, int k) {
        int longest=0;
        int maxSize=0,diffChars=0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length-1; i++) {
            if(chars[i]==chars[i+1]){
                maxSize++;
                System.out.println("Size Increased");
            }
            else if(diffChars<=k) {
                diffChars++;
                maxSize++;
                System.out.println("Operation Performed");
            }
            longest=Math.max(longest, maxSize);
            System.out.println("Longest is:"+longest);
        }

        return longest+1;
    }**/
}
