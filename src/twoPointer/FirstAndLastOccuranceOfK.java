package twoPointer;

public class FirstAndLastOccuranceOfK {
    public static void main(String[] args) {
        int[] occureces = checkOcurrances(new int[] {1,3,5,7,8,4,7,9,34}, 0);
        System.out.println(occureces[0]+" "+occureces[1]);
    }
    public static int[] checkOcurrances(int[] arr, int k){
        int[] index = {-1,-1};
        int left=0,right=arr.length-1;
        while (left<arr.length && index[0]==-1){
             if(arr[left]==k) {
                 index[0] = left;
                 break;
             }
             left++;
        }
        while (right>=0 && index[1]==-1){
            if (arr[right]==k) {
                index[1]=right;
                break;
            }
            right--;
        }
        return index;
    }
}
