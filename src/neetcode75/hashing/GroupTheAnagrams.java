package neetcode75.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupTheAnagrams {
    public static void main(String[] args) {
        String[] strings =  {"act","pots","tops","cat","stop","hat"};
        List<List<String>> nestedLists = groupAnagrams(strings);

        for (List<String> outerList : nestedLists){
            for (String str : outerList){
                System.out.print(str+" ");
            }
            System.out.println();
        }

    }
    public static List<List<String>> groupAnagrams(String[] strings) {
        List<List<String>> groupedAnagrams = new ArrayList<>();

        for (int i = 0; i < strings.length; i++) {
            String string = strings[i];
            List<String> tempList = new ArrayList<>();
            tempList.add(string);
            for (int j = 0; j < strings.length; j++) {
                if(isAnagram(string, strings[j]) && i!=j){
                    tempList.add(strings[j]);
                }
            }
            groupedAnagrams.add(tempList);
        }

        return groupedAnagrams;
    }

    public static Boolean isAnagram(String firstString, String secondString){

        if(firstString.length()!=secondString.length()) return false;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character c: firstString.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for (Character c: secondString.toCharArray()){
            if (!hashMap.containsKey(c))
                return false;
            hashMap.put(c, hashMap.get(c)-1);
            if (hashMap.get(c)==0){
                hashMap.remove(c);
            }
        }

        return hashMap.isEmpty();
    }
}
