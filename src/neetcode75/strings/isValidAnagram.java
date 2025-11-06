package neetcode75.strings;

import java.util.LinkedList;
import java.util.List;

public class isValidAnagram {
    public static void main(String[] args){
        if (isAnagram("One", "eOn")) System.out.println("Anagram");
        else  System.out.println("Not Anagram");
    }
    private static Boolean isAnagram(String s, String t){
        List<Character> firstString = new LinkedList<>();
        for(char c: s.toCharArray())
            firstString.add(c);

        for (Character c: t.toCharArray()){
            if(firstString.contains(c)) firstString.remove(c);
            else return false;
        }
        return firstString.isEmpty();
    }
}
