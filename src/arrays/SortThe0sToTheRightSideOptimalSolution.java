package arrays;

import java.util.Arrays;

public class SortThe0sToTheRightSideOptimalSolution {
    public static void main(String[] args) {
        int[] numbers = {1,0,2,45,7,7,8,0,87,67,0,45,0,67,0};

        int nonZeroIndex=0;
        for (int i:numbers) {
            if (i!=0){
                numbers[nonZeroIndex]=i;
                nonZeroIndex++;
            }
        }
        for (int i = nonZeroIndex; i < numbers.length ; i++) {
            numbers[i]=0;
        }

        for (int i: numbers){
            System.out.print(i+" ");
        }
    }
}
