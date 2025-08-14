package arrays;

public class LongestConsecutiveBruteForce {
    public static void main(String[] args) {
        int[] array = {1,5,1,2,4,6,1,1,1,1,5,7,89,45,7,2,1,1,3};
        int j=0,k=0, longest=0;

        while (k<array.length && j<=k){
            if (array[j]==array[k]){
                int sequence=0;
                while (array[j]==array[k]){
                    k++;
                    sequence++;
                }
                if(sequence>longest) longest=sequence;
                j=k;
                k++;
            }else {
                j=k;
                k++;
            }
        }

        System.out.println("Longest repetated is:"+longest);

    }
}
