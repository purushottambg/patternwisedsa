package hasing;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Indexes that will add to 9 are:");
        int[] indexes = twoSum(new int[]{2, 7, 11, 15,22}, 33 );

        System.out.println(indexes[0]+" | "+indexes[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int rem = target-num;
            if (map.containsKey(rem)) {
                int index = map.get(rem);
                return new int[]{i, index};
            }
        }
        return new int[]{0,0};
    }
}