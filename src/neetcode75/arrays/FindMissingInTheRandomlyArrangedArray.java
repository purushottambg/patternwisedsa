package neetcode75.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindMissingInTheRandomlyArrangedArray {
    public static void main(String[] args) {
        int[] numbers = {1,5,6,2};
        Arrays.sort(numbers);  // 1, 2, 5, 6

        int[] sequentialArray = IntStream.range(numbers[0], numbers[numbers.length-1]+1).toArray();

        int streamIterator=0,arrayIterator=0;

        while ( streamIterator<sequentialArray.length && arrayIterator<numbers.length ){
            if(sequentialArray[streamIterator] == numbers[arrayIterator]){
                streamIterator++;
                arrayIterator++;
            }else {
                System.out.print(sequentialArray[streamIterator]);
                streamIterator++;
            }
        }


    }
}
