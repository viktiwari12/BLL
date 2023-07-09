

public class l001 {
    public static void main(String[] args) {
        
    }
    // recursive
    public static int fib_rec(int n){
        // base case 

        if(n<= 1) return n;

        int f1 = fib_rec(n-1);
        int f2 = fib_rec(n-2);

        return f1 + f2;
    }
    // Memoisation 
    // public static int fib_memo(int n){
    //     // base case 

    //     if(n<= 1) return n;

    //     // First check if the value is previously computed? 

    //     if(alreadyComputed){
    //         //Don't Compute further and return the stored ans;
    //     }
    //     // Alright! If not computed, just simpally Compute it.
    //     int f1 = fib_memo(n-1);
    //     int f2 = fib_memo(n-2);

    //     // Now Very Imp Step.
    //     // It's ok, return ur ur computed ans, but before returning store it somewhere for future references 
    //     return f1 + f2;
    // }

    public static int fib_memo(int n, int arr[]){
        // base case 

        if(n<= 1) return arr[n] = n;

        // First check if the value is previously computed? 

        if(arr[n] != -1){//alreadyComputed
            return arr[n];
            //Don't Compute further and return the stored ans;
        }
        // Alright! If not computed, just simpally Compute it.
        int f1 = fib_memo(n-1, arr);
        int f2 = fib_memo(n-2, arr);

        // Now Very Imp Step.
        // It's ok, return ur ur computed ans, but before returning store it somewhere for future references 
        return arr[n] = f1 + f2;
    }
    // Tabulation or Bottom Up 
    public static int fib_tabu(int n, int[]arr){
        arr[0] = 0; arr[1] = 1;
        for(int i = 2; i<=n; i++){
            arr[i] = arr[i-1]+arr[i-2];
        }
        return arr[n];
    }



    public static int ClimbStairs(int n, int arr[]){
        if( n == 1) return 1; // Here 1 -> One path found 

        if(n <0) return 0; // No Possible path 
        int ans = 0;
        for(int jumps = 1; jumps <= n; jumps++){
            ans += ClimbStairs(n-jumps, arr);
        }
        return ans;
    }// from nth stairs it vcan take upto n jumps

    /*
     * Recursion 
     * Obserbe Recursive Tree 
     * Memoise 
     * Tabulation 
     */
}
