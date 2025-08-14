package neetcode75.hashing;

import java.util.*;

public class ValidAnagramStrings {
    public static void main(String[] args) {
        if (isAnagram("racecar", "carrace"))
            System.out.println("It's Anagram");
        else System.out.println("Not an Anagram");
    }
    private static Boolean isAnagram(String s, String t){
        if (s.length()!=t.length()) return false;

         HashMap<Character, Integer> map1 = new HashMap<>();
         for (int i=0; i<s.length(); i++){
             map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0)+1);
         }

        for (char c : t.toCharArray()){
            if(!map1.containsKey(c))
                return false;
            map1.put(c, map1.get(c)-1);
            if (map1.get(c)==0)
                map1.remove(c);
        }

        return map1.isEmpty();
    }
}
