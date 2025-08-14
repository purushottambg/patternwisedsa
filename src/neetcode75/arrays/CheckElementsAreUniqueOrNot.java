package neetcode75.arrays;

import java.util.HashSet;

public class CheckElementsAreUniqueOrNot {
    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4};
        if (isDuplicate(arrays)) System.out.println("Not Unique");
        else System.out.println("All Unique");
    }
    public static Boolean isDuplicate(int[] array){
        HashSet<Integer> uniqueElements = new HashSet<>();
        for (int i: array){
            if (!uniqueElements.add(i)) return true;
        }

        return false;
    }
}
