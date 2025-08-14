package arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] numbers = {0,1,2,4,5,6,7,8};
        for (int i = 1; i < numbers.length; i++) {
            if(i!=numbers[i]){
                System.out.println(i+ " is missing");
                break;
            }
        }
        System.out.println("All are present");
    }
}
