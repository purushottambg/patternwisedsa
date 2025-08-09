package arrays;

public class MergeTwoSortedArrayBruteForce {
    public static void main(String[] args) {
        int[] arr1={2,4,6,7,11,17,34,76,86,89};
        int[] arr2={1,4,7,10,17,23,34,56,76,83,87,95,99,110,112};

        int[] mergedArray = mergeArrays(arr1, arr2);

        for (int i: mergedArray){
            System.out.print(i+" ");
        }

    }

    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int resultArrayLen = (arr1.length+arr2.length);
        int[] resultArray = new int[resultArrayLen];

        int len1 = 0;
        int len2 = 0;
        int resultLen=0;
        while (len1<arr1.length && len2<arr2.length){
            if(arr1[len1]<arr2[len2]){
                resultArray[resultLen]=arr1[len1];
                resultLen+=1;
                len1+=1;
            }else if(arr2[len2]<=arr1[len1]){
                resultArray[resultLen]=arr2[len2];
                resultLen+=1;
                len2+=1;
            }
        }

        while (len1<arr1.length){
            resultArray[resultLen]=arr1[len1];
            resultLen+=1;
            len1+=1;
        }
        while (len2<arr2.length) {
            resultArray[resultLen]=arr2[len2];
            resultLen+=1;
            len2+=1;
        }

        return resultArray;

    }
}
