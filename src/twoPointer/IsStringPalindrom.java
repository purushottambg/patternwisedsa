package twoPointer;

public class IsStringPalindrom {
    public static void main(String[] args) {
        if (isPalindrome("Was it a car or a cat I saw?")) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }

    public static Boolean isPalindrome(String string){

        string = string.replaceAll("[^a-z0-9A-Z]", "").toLowerCase();

        int start=0;
        int end=string.length()-1;
        while (start<string.length() && end>=0){
            if(string.charAt(start)!=string.charAt(end))
                return false;

            end--;
            start++;

        }

        return true;
    }
}
