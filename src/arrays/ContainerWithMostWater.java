package arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println("Brute Force->Highest Storage Capacity is:"+containingCapacity(new int[] {1,2,4,3}));
        System.out.println("Optimal Sol->Highest Storage Capacity is:"+optimalCalculation(new int[] {1,2,4,3}));
    }

    public static int containingCapacity(int[] heightsArray){
        int maxCapacity=0;
        for (int i = 0; i < heightsArray.length; i++) {
            for (int j = i+1; j <heightsArray.length; j++) {
                int smaller = Math.min(heightsArray[i], heightsArray[j]);
                //System.out.println("smaller in "+heightsArray[i]+" & "+heightsArray[j]+":"+smaller+" distance:"+(j-i)+" Total Capacity:"+smaller*(j-i));

                if(smaller*(j-i)>maxCapacity){
                    maxCapacity=smaller*(j-i);
                }
            }
        }
        return maxCapacity;
    }

    public static int optimalCalculation(int[] heightsArray){
        int maxCapacity=0, left=0, right=heightsArray.length-1;

        while (left<right){
            int minHeight = Math.min(heightsArray[left], heightsArray[right]);
            if(minHeight*(right-left)>maxCapacity){
                maxCapacity=minHeight*(right-left);
            }
            if (heightsArray[left]>heightsArray[right])
                right--;
            else left++;

        }
        return maxCapacity;
    }
}
