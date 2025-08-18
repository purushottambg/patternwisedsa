package neetcode75.strings;

import java.util.HashSet;

public class LongestSubStringOfUniqueChars {
    public static void main(String[] args) {
        System.out.println("Longest String is:"+longestSubString("ThisIsTheStrongestPartnership"));
    }
    public static String longestSubString(String str){
        StringBuilder result=new StringBuilder();

        HashSet<Character> characters = new HashSet<>();
        for (Character c: str.toCharArray()){
            if (!characters.add(c)) result.append(c);
        }

        return String.valueOf(result);
    }
}
