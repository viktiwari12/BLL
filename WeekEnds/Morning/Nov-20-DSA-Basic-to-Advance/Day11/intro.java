import java.util.Arrays;

public class intro {
    public static void main(String[] args) {
        int n = 6;
        int dp[] = new int [n+1];


        Arrays.fill(dp, -1); // A method of array that will fill the entire array with a specific value 

        int ans = fibbo_memo(n, dp);
    }

    public static int fibbo_rec(int n){
        if(n == 0 || n== 1) return  n;


        int f1 = fibbo_rec(n-1);        
        int f2 = fibbo_rec(n-2);

        return (f1 + f2);
    }
    public static int fibbo_memo(int n, int dp[]){
        // base case 
        if(n == 0 || n== 1) return dp[n] = n;

        // before calculating, first check if it has been calculated earlier or not
        if(dp[n] != -1) return dp[n];
        // if not then  calcute fib of n-1 & n -2
       
        
        int f1 = fibbo_memo(n-1, dp);        
        int f2 = fibbo_memo(n-2, dp);

        // now first store and then reutrn 
        dp[n] = (f1+f2);
        return (f1 + f2);

    }

    public static int fibbo_tabu(int N, int dp[]){
        // base case 

        for(int n = 0; n< dp.length; n++){

            if(n == 0 || n== 1){
                 dp[n] = n;  // O(1)
                 continue;
             } // This line here will take a lot of unnecessary extra time -> This one line will increase the complexity by o(N) 
       
        
            int f1 = dp[n-1];       // O(1)  
            int f2 = dp[n-2];       // O(1)
            dp[n] = (f1+f2);        // O(1)
        }
        return dp[N];

    }

    public static int fibbo_tabu01(int N, int dp[]){
        // base case 
        dp[0] = 0; // (O(1))
        dp[1] = 1; // (O(1))

        for(int n = 0; n< dp.length; n++){

            int f1 = dp[n-1];        
            int f2 = dp[n-2];
            dp[n] = (f1+f2);
        }
        return dp[N];

    }
}
