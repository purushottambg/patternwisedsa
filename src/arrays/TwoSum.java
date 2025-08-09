package arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Indexes that will add to 9 are:");
        int[] indexes = twoSum(new int[]{2, 7, 11, 15}, 9 );

        System.out.println(indexes[0]+" & "+indexes[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        for (int num: nums){
            indexes[0]=num;
            for (int i = 0; i < nums.length; i++) {
                if(num!=nums[i] && num+nums[i]==target){
                    indexes[1]=nums[i];
                    return indexes;
                }
            }
        }

        return indexes;
    }
}
