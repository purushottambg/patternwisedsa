package neetcode75.hashing;

import java.util.*;

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
        Map<String, List<String>> groupedAnagrams = new HashMap<>();

        for (String s: strings){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedString = Arrays.toString(chars);

            if (!groupedAnagrams.containsKey(sortedString)){
                groupedAnagrams.put(sortedString, new ArrayList<>());
            }
            groupedAnagrams.get(sortedString).add(s);
        }

        return new LinkedList<>(groupedAnagrams.values());
    }
}
