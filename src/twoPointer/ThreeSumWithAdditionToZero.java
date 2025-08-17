package twoPointer;

import java.util.*;

public class ThreeSumWithAdditionToZero {
    public static void main(String[] args) {
        List<List<Integer>> triplets = threeSum(new int[] {-1,0,1,2,-1,-4});

        for (List<Integer> i: triplets){
            for (Integer j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static List<List<Integer>> threeSum(int[] numbers) {
        List<List<Integer>> numberList = new ArrayList<>();
        HashSet<Integer> uniqueElements = new HashSet<>();
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length-2; i++) {
            if (i > 0 && numbers[i] == numbers[i - 1]) continue;
            for (int j=i+1; j<numbers.length-1;j++){
                if (j > i + 1 && numbers[j] == numbers[j - 1]) continue;
                int target = -(numbers[i]+numbers[j]);
                for(int k=j+1; k<numbers.length;k++){
                    if(k!=j && k!=i){
                        uniqueElements.add(numbers[k]);
                    }
                }
                if(uniqueElements.contains(target)){
                    List<Integer> tempList =  new ArrayList<>();
                    tempList.add(numbers[i]);
                    tempList.add(numbers[j]);
                    tempList.add(target);
                    numberList.add(tempList);
                }
                uniqueElements.clear();
            }
        }
        return numberList;
    }
}
