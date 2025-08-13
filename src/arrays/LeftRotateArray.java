package arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};

        int last=array[array.length-1];

        for (int i = array.length-1; i >=1 ; i--) {
            array[i]=array[i-1];
        }
        array[0]=last;

        for (int i: array){
            System.out.print(i+" ");
        }
    }
}
