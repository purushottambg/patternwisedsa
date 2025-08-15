package neetcode75.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMostKFrequentNumbers {
    public static void main(String[] args) {
        int[] kMostFrequent = topKFrequentByStream(new int[]{1,2,2,3,3,3}, 2);
        for (int i: kMostFrequent){
            System.out.print(i+" ");
        }
        System.out.println();
        kMostFrequent = topKFrequentByBruteForce(new int[]{1,2,2,3,3,3,4}, 2);
        for (int i: kMostFrequent){
            System.out.print(i+" ");
        }
    }

    private static int[] topKFrequentByBruteForce(int[] nums, int k) {
         int[] results = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i: nums){
            if(!map.containsKey(i)){
                map.put(i, map.getOrDefault(i, 0));
            }
            map.put(i, map.get(i)+1);
        }

         return map.entrySet().stream()
                 .sorted((a,b)->b.getValue().compareTo(a.getValue()))
                 .limit(k)
                 .map(Map.Entry::getValue)
                 .mapToInt(n->(int)n)
                 .toArray();

    }

    private static int[] topKFrequentByStream(int[] nums, int k) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(n->n, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((a,b)->Long.compare(b.getValue(), a.getValue()))
                .limit(k)
                .map(Map.Entry::getKey)
                .mapToInt(n->(int)n)
                .toArray();
    }
}
