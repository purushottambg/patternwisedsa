package neetcode75.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        System.out.println("Longest Streak is:"+longestConsecutive(new int[] {100,102,100,101,101,101,4,3,2,3,2,1,1,1,1,2}));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i: nums) set.add(i);

        int longest=1;
        for (int n: set){
            if (!set.contains(n-1)){
                int streak=1;
                int cur=n;
                 while (set.contains(n+1)){
                    n+=1;
                    streak++;
                }
                longest=Math.max(longest, streak);
            }
        }
        return longest;
    }
}
