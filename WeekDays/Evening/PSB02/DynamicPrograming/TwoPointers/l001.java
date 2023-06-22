import java.util.*;
public class l001 {
    public static int count = 0;
    public static int count2 = 0;
    public static void main(String[] args) {
        // Some Hard Rules to follow in Recursion 

        //1) Write Recursive Code 
        //2) Draw Recursive Tree 
        //3)Do Ovservation (The Most imp Step) -> Look if there is any Overlapping Subporblems ? 
        //4)Memoise it 
        //5)Convert the memosied code into tabulation 
        //6) Look if it can be Further Optmised? (Space Optmisation )
        int n = 10; 
        int dp[] = new int [n+1];

       // int temp = fib(n);
        //System.out.println(temp);
        //System.out.println("Count2  " + count2);
        Arrays.fill(dp, -1);
        int ans = fib_memo(n, dp);
       //System.out.println(ans);

        //System.out.println("Count ->  " + count);
        display(dp);
    }  
    // recursive code 
    public static int fib(int n){
        // base Case 
        if(n <= 1)return n;

        count2++;
        int f1 = fib(n-1);
        int f2 = fib(n-2);

        int ans = f1 + f2;
        return ans ;
    }

    // Memoisation 
    /* First check,if the current State has already been Evaluated or not?  
     * If yes, don't re ealuate it -> just simpally return the pre-calcuated ans 
     * if not, calculate the ans for the curr state , nad -the most imp- store the ans for the curr state in some Data Structure, and then retun the ans 
     * 
    */

    /* 
     * What 
     * How 
     * Why 
     */
    // public static int fib_memo(int n){
    //     // base Case 
    //     if(n <= 1)return n;

    //     //jsut check if ical 

    //     if(already evaluated ) return preclaculated ans ;

    //     int f1 = fib_memo(n-1);
    //     int f2 = fib_memo(n-2);

    //     int ans = f1 + f2;

    //     sotore it before returnning 
    //     return ans ;
    // }

    public static int fib_memo(int n, int dp[]){
        // base Case 
        if(n <= 1)return dp[n]= n;

        //jsut check if ical 

        if(dp[n] != -1 ){
             return dp[n];
        }
        count++;
        int f1 = fib_memo(n-1, dp);
        int f2 = fib_memo(n-2, dp);

        int ans = f1 + f2;

        dp[n] = ans;
        return ans ;
    }
    public static int fibo_memo01(int n, int dp[]){
        if(n<=1) return dp[n] = n;

        if(dp[n] != -1) return dp[n];
        return fibo_memo01(n-1, dp) + fibo_memo01(n-2, dp);
    }

    public static void display(int arr[]){
        for(int ele : arr){
            System.out.print(ele + "  ");
        }

        System.out.println();
    }

    public static int fibo_tabu(int N, int dp[]){
        // dp[0] = 0
        //dp[1] = 1;
        for(int n = 0; n<=N; n++){
            if(n<=1) {
                 dp[n] = n;
                 continue;
            }

            //if(dp[n] != -1) return dp[n];
            dp[n] = dp[n-1] + dp[n-2];
             
        }
        return dp[N];
    }

}



