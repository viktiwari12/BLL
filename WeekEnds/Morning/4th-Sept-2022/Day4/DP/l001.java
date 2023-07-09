import java.util.Arrays;
import java.util.Scanner;

class l001 {
    public static void main(String[] args) {
        // fun(3);
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int dp[] = new int[n + 1];

        Arrays.fill(dp, -1);
    }
    
    public static void fun(int n) {
        if (n <= 0)
            return;

        System.out.println("Pre -> " + n);
        fun(n - 1);
        System.out.println("In -> " + n);
        fun(n - 2);
        System.out.println("Post -> " + n);
    }
    // recursive 
    public static int fibr(int n) {
        // base case -> figure out in sometime
        if (n <= 1)
            return n;
        // faith -> someone give me f(n-1) & f(n-2)
       
        int f1 = fibr(n - 1 );
        int f2 = fibr(n - 2);
        // work -> add the both and return the ans ;
        int ans = f1 + f2;
        return  ans;

    }
    // memoisation 
    public static int fib(int n, int[] dp) {
        // base case -> figure out in sometime
        if (n <= 1)
            return dp[n] = n;
        // faith -> someone give me f(n-1) & f(n-2)
        if (dp[n] != -1)
            return dp[n];
        int f1 = fib(n - 1, dp);
        int f2 = fib(n - 2, dp);
        // work -> add the both and return the ans ;
        int ans = f1 + f2;
        return dp[n] = ans;

    }
    // tabulation 
    public static int fib01(int N, int[] dp) {
        // base case -> figure out in sometime
       
        for (int n = 0; n <= N; n++) {
            if (n <= 1){
                dp[n] = n;
                continue;
            }
            // faith -> someone give me f(n-1) & f(n-2)

            int f1 = dp[n - 1];
            int f2 = dp[n - 2];

            // work -> add the both and return the ans ;

            int ans = f1 + f2;
            dp[n] = ans;
        }
        return dp[N];

    }
}