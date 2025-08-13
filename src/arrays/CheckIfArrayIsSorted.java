package arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,6,7,8,9,12,34,65,89};
        boolean sorted=true;
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i]>numbers[i+1]){
                System.out.print("Not Sorted");
                sorted=false;
                break;
            }
        }
        if (sorted){
            System.out.print("Sorted");
        }

    }
}
