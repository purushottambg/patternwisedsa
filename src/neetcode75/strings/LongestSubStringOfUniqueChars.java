package neetcode75.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringOfUniqueChars {
    public static void main(String[] args) {
        System.out.println("Longest String is:"+longestSubString("zxyzxyz"));
    }
    public static int longestSubString(String s) {
        if(s==null || s.length()==0) return 0;

        int right=0,left=0,maxLen=0;
        Set<Character> set =new HashSet<>();
        int len=0;
        while (right<s.length() && left<s.length()){
            if(set.add(s.charAt(right))){
                len = (right-left)+1;
                right+=1;
            }else{
                set.remove(s.charAt(left));
                left+=1;
                len = (right-left)+1;
            }
            maxLen=maxLen>len?maxLen:len;
            System.out.println("Right at:"+right+" Left:"+left+" MaxLen:"+maxLen);
        }
        return maxLen;
    }
}
