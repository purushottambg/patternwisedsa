package neetcode75.arrays;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        System.out.println("Index is:"+returnTheIndex(new int[]{4,5,6,7,0,1,2}, 0));
    }

    public static int returnTheIndex(int[] array, int target){
        int index=-1;
        for (int i = 0; i < array.length; i++) {
             if(array[i]==target)
                 index=i;
        }
        return index;
    }

}
