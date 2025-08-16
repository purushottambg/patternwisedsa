package neetcode75.arrays;

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        longestConsecutive(new int[] {100,102,100,101,101,101,4,3,2,3,2,1,1,1,1,2});
    }
    public static int longestConsecutive(int[] nums) {
        int[] arr = Arrays.stream(nums).distinct().sorted().toArray();
        int len=1;
        int initial=0;
        for (int i=arr.length;  i>=0; i--){
            int tempLen=1;

        }
        return len;
    }
}
