package other;

import java.util.HashMap;
import java.util.Map;

class GetCount{
    public static int maxCountSameDigitSum(int start, int end) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;

        for (int i = start; i <= end; i++) {
            int sum = 0, num = i;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            maxCount = Math.max(maxCount, map.get(sum));
        }

        return maxCount;
    }
}

public class Solution {
    public static void main(String[] args) {
        System.out.println(GetCount.maxCountSameDigitSum(5, 10));
    }
}
