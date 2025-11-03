package neetcode75.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

//    public static void main(String[] args){
//        int[] array = {1, 2, 3, 4};
//        if(areAllUnique(array)) System.out.println("All are unique");
//        else System.out.println("All are not unique");
//    }
//
//    private static Boolean areAllUnique(int[] array){
//        Set<Integer> consumed = new HashSet<>();
//        return Arrays.stream(array).allMatch(consumed::add);
//    }

}
