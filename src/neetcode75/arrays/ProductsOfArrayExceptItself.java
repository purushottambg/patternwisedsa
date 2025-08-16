package neetcode75.arrays;

public class ProductsOfArrayExceptItself {
    public static void main(String[] args) {
        int[] results = productExceptSelf(new int[]{-1,0,1,2,3});
        for (int result: results){
            System.out.print(result+" ");
        }
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int j=0;
            int result=1;
            while (j<i){
                result*=nums[j];
                j++;
            }
            int k=i+1;
            while (k>i && k<nums.length){
                result*=nums[k];
                k++;
            }
            results[i]=result;
        }

        return results;
    }
}
