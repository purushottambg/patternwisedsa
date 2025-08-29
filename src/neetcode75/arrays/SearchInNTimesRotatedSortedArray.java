package neetcode75.arrays;

import java.util.HashMap;

public class SearchInNTimesRotatedSortedArray {
    public static void main(String[] args) {
        int[] indicesOfTargetedElements = searchInRotatedArray(new int[] {8,9,10,11,12,14,4,5,6,7}, new int[]{4,6,2});
        System.out.println("Indexes are:");
        for (int i: indicesOfTargetedElements)
            System.out.print(i+" ");
    }

    public static int[] searchInRotatedArray(int[] array, int[] targets){
        int[] indexes = new int[targets.length];

        int rotations=1;
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]<array[i+1]) {
                rotations++;
            }else break;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hashMap.put(i, array[i]);
        }

        for (int i = 0; i < targets.length; i++) {
            if(hashMap.containsKey(targets[i])) indexes[i]=hashMap.get(targets[i]);
            else indexes[i]=-1;
        }

        return indexes;
    }
}
