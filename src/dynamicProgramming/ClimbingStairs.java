package dynamicProgramming;

public class ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(maxPossibleWays(3));
    }
    public static int maxPossibleWays(int n){
        if(n==1) return 1;

        int[] ways = new int[n+1];
        ways[1]=1;
        ways[2]=2;

        for (int i = 3; i <= n ; i++) {
            ways[i] = ways[i-1] + ways[i-1];
        }
        return ways[n];
    }
}
