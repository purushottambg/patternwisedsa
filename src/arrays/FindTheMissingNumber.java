package arrays;

public class FindTheMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,3,4,5,6,8};
        int sum=0;
        for (int i: numbers){
            sum+=i;
        }

        int expectedSum = numbers.length*(numbers.length+1)/2;
        System.out.println("Missing is: "+(expectedSum-sum));

    }
}
