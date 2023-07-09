
import java.util.*;
public class p1 {
    // 9717970966
    public static int x[] = new int [1];
    public static void main(String[] args) {
        // Golden Rules Of Dynamic Programing 
        /*
         * 1) Always Write the recursion/Recursive function First 
         * 2) Draw Recursive Tree (VVVImp ) -> and then Observe ?  Is there any repeating subproblem 
         * 3) Then Memooise It
         * 4) Convert It into Tabulation 
         * 5) See If we can Fruther Optimise it? (Space Optimisation)
         */
            int n = 25;
            int dp[] = new int [n+1];
            //Arrays.fill(dp, -1);
         int ans = fib_tabu(n, dp);
         System.out.println(ans + "   ->  "+ x[0]);
    }
    // All the effort is being reqired just to write the recursion and draw recursive tree 
    public static int fib_rec(int n){
        if( n<= 1) return n;
        
        
        int f1 = fib_rec(n-1);
        int f2 = fib_rec(n-2);

        return f1 + f2;
    }
    public static int fib_memo(int n, int dp[]){
        if( n<= 1) return dp[n] = n;


        // check id the current problem/ State is already evaluated? 
        
        if(dp[n] != -1 ) return  dp[n];

        int f1 = fib_memo(n-1, dp);
        int f2 = fib_memo(n-2, dp);

        
        return dp[n] = (f1 + f2);
    }
    // convert it into tabulation code 
    public static int fib_tabu(int N, int dp[]){

        for(int n = 0; n<=N; n++){
            if( n<= 1){
                dp[n] = n;
                continue;
            } 
            ++x[0];
            int f1 = dp[n-1]; //fib_memo(n-1, dp);
            int f2 = dp[n-2]; // fib_memo(n-2, dp);

        
            dp[n] = (f1 + f2);
            continue;
        }
        return dp[N];


        // check id the current problem/ State is already evaluated? 
        // if(dp[n] != -1 ) return  dp[n];

       
    }
    

}
