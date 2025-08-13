package arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1,24,4,23,54,3,2,3,5,2,6,9,8};

        Set<Integer> numSet = new TreeSet<>();
        for (int i: array){
            numSet.add(i);
        }

        for (int i: numSet){
            System.out.print(i+" ");
        }

    }
}
