package slidingWindow;

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABBB", 2));
        System.out.println(characterWithoutRepeat("ABBB", 2));
    }

    public static int characterWithoutRepeat(String s, int k){
        int[] freqArray = new int[26]; //Frequency Holder
        int start = 0, count = 0, result = 0;  //Pointers

        for(int end = 0; end < s.length(); end++) {   //Iteration Loop
            char c = s.charAt(end);         //Last character in the window
            freqArray[c - 'A']++;           // update the frequency
            count = Math.max(count, freqArray[c - 'A']);  //highest frequency

            if ((end - start + 1) - count > k) {        //check if crossing the operations are needed more than the allowed
                freqArray[s.charAt(start) - 'A']--;     // removing the frequency
                start++;            // eliminate the starting elements
            }

            result = Math.max(result, end - start + 1);  // Correct line for updating the final answer
        }
        return result;
    }

    public static int characterReplacement(String s, int k){
        int longest=0,left=0, right=1;

        while (left<s.length()){
            int longer=0,opsCount=0;
            char c = s.charAt(left);
            for(int i=left;i<s.length();i++){
                if (c==s.charAt(i) && opsCount<=k ) {
                    System.out.println("Character found at:"+i);
                    longer++;
                }else if(opsCount<k){
                    System.out.println("Character adjust at:"+i);
                    opsCount++;
                    longer++;
                }else break;
                System.out.println("longer is:"+longer+" longest:"+longest);
            }
            longest=Math.max(longest, longer);
            left++;
        }

        return longest;
    }
}
