package slidingWindow;

public class LongestRepeatingCharReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABBB", 2));
        System.out.println(characterWithoutRepeat("ABBB", 2));
    }

    public static int characterWithoutRepeat(String s, int k){
        int longest=0,start=0,count=0;
        int[] freqArray = new int[26];

        for(int end=0; end<s.length();end++){
            char c = s.charAt(end);
            freqArray[c-'A']++;
            count=Math.max(count, freqArray[c-'A']);

            if ((end - start+1) - count>k){
                freqArray[s.charAt(start)-'A']--;
                start++;
            }
            count=Math.max(count, end-start);
        }
        return count;
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
