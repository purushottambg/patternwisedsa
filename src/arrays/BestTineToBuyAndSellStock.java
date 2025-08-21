package arrays;

import java.util.Arrays;

public class BestTineToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println("Max Profit is:"+maxProfit(new int[] {2,1,2,1,0,1,2}));
    }
    private static int maxProfit(int[] profit){
        int maxProfit=0,pointer=0,sell=profit[0],buy=profit[0];
        while (pointer<profit.length-1){
            if (profit[pointer]<buy) {
               buy=profit[pointer];
            }
            if (profit[pointer]>sell)
                sell=profit[pointer];
            pointer++;
        }

        return Math.max(sell-buy,0);
    }
}
