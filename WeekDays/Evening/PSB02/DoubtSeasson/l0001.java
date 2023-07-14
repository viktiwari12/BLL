

public class l0001 {
    public static void main(String[] args) {
        
    }
    public static int fib(int n, int dp[]){ // n = 5
        // base Case -> 
        if(n == 0) return dp[n] = 0;
        if(n == 1) return dp[n] = 1;

        if(dp[n] != -1) return dp[n];
        int f1 = fib(n-1, dp);
        int f2 = fib(n-2, dp);

        return dp[n] = f1 + f2;
    }
}
