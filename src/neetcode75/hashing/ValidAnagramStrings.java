package neetcode75.hashing;

import java.util.*;

public class ValidAnagramStrings {
    public static void main(String[] args) {
        if (isAnagram("racecar", "carrace"))
            System.out.println("It's Anagram");
        else System.out.println("Not an Anagram");
    }
    private static Boolean isAnagram(String s, String t){

        HashMap<Integer, Character> string1Map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            string1Map.put(i, s.charAt(i));
        }

        HashMap<Integer, Character> string2Map = new HashMap<>();
        for (int i=0;i<t.length();i++){
            string1Map.put(i, t.charAt(i));
        }

        for (Map.Entry<Integer, Character> string1: string1Map.entrySet()){
            if(string2Map.containsValue(string1.getValue())){
                string2Map.remove(string1.getValue());
                string1Map.remove(string1.getValue());
            }
        }

        if(string2Map.size()==0 && string2Map.size()==0)
            return true;


        return false;
    }
}
