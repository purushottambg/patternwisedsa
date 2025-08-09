package arrays;

public class MergeTwoSortedArrayOptimalSolution1 {
    public static void main(String[] args) {
        int[] arr1 = {11,23,45,28,47};
        int[] arr2 = {7,12,85};

        int[][] sortedArrays = sortArrays(arr1, arr2);

        System.out.println("First Array");
        for (int i: sortedArrays[0]){
            System.out.print(i+" ");
        }

        System.out.println("\nSecond Array");
        for (int i: sortedArrays[1]){
            System.out.print(i+" ");
        }

    }

    public static int[][] sortArrays(int[] arr1, int[] arr2){

        int[][] sortedArrays = new int[2][];

        int ar1Last=arr1.length-1;
        int ar2First=0;

        while (ar1Last>=0 && ar2First<arr2.length){

            if(arr1[ar1Last]>arr2[ar2First]){
                int temp=arr2[ar2First];
                arr2[ar2First]=arr1[ar1Last];
                arr1[ar1Last]=temp;
                ar1Last--;
                ar2First++;
            }else break;



        }
        sortedArrays[0]=arr1;
        sortedArrays[1]=arr2;

        return sortedArrays;

    }
}
