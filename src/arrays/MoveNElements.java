package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveNElements {
    public static void main(String[] args) {
        int[] array =  {1,2,3,4,5,6,7};
        System.out.print("How Much elements you want to shift:");
        Scanner scanner = new Scanner(System.in);
        int groupToBeShifted=scanner.nextInt();
        groupToBeShifted%=array.length;

/**        int[] tempArray = Arrays.copyOfRange(array, 0, groupToBeShifted);

        int iterationForShifting=0;
        for (int i = groupToBeShifted; i <array.length ; i++) {
            array[iterationForShifting]=array[i];
            iterationForShifting++;
        }
        int tempIterator=0;
        for (int i = iterationForShifting; i<array.length;i++){
            array[i]=tempArray[tempIterator];
            tempIterator++;
        }
**/

        int[] temp1 = Arrays.copyOfRange(array, 0, groupToBeShifted);
        int[] temp2 = Arrays.copyOfRange(array, groupToBeShifted, array.length);

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (i<temp2.length){
                array[i]=temp2[i];
            }else {
                array[i]=temp1[i-(temp2.length)];
            }
        }

        for (int i: array){
            System.out.print(i+" ");
        }

    }
}
