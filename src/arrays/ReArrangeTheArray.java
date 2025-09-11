package arrays;

import java.util.Arrays;

public class ReArrangeTheArray {
    public static void main(String[] args) {
        int[] numArray = {2,3,4,5};
        System.out.println("Before");
        Arrays.stream(numArray).forEach(System.out::print);
        for (int i = 0; i < numArray.length-1; i++) {
            if(i%2==0 && numArray[i]<numArray[i+1]){
                int temp = numArray[i];
                numArray[i]=numArray[i+1];
                numArray[i+1]=temp;
            }
        }
        System.out.println("\nAfter");
        Arrays.stream(numArray).forEach(System.out::print);
    }
}
