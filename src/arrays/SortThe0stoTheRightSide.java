package arrays;

public class SortThe0stoTheRightSide {
    public static void main(String[] args) {
        int[] numbers = {1,0,2,45,7,7,8,0,87,67,0,45,0,67,0};
        //int[] numbers = {5, 0, 0, 6, 7};
        int placeForZero=numbers.length-1;
        for (int i = 0; i <placeForZero ; i++) {
            if(numbers[i]==0 && numbers[placeForZero]==0) {
                placeForZero--;
                int temp = numbers[i];
                numbers[i] = numbers[placeForZero];
                numbers[placeForZero] = temp;
                placeForZero--;
            }else if (numbers[i]==0){
                int temp = numbers[i];
                numbers[i] = numbers[placeForZero];
                numbers[placeForZero]=temp;
                placeForZero--;
            }
        }
        for (int i: numbers){
            System.out.print(i+" ");
        }
    }
}
