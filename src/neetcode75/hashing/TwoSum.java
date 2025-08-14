package neetcode75.hashing;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int [] results = twoSum(new int[]{4,5,6}, 10);
        System.out.println(results[0]+" "+results[1]);
    }
    public static int[] twoSum(int[] array, int target){
         int[] result = new int[2];
         HashMap<Integer, Integer> map = new HashMap<>();

         for (int i=0;i<array.length;i++){
             int neededNum = target-array[i];
             if (map.containsKey(neededNum)){
                 result[0]= map.get(neededNum);
                 result[1]= i;
                 return result;
             }
             map.put(array[i], i);
         }
         return result;
    }
}
