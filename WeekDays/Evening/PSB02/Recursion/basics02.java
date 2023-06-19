public class basics02 {
    public static void main(String[] args) {
        
    }
    // Return the nth Fib no 
    public static int fib(int n ){
        // 0 1 1 2 3 5 8 13 ...... 
        if( n== 0) return 0;
        if(n == 1) return 1;

        // if( n<= 1) retunrn n;
        
        int faith1 = fib(n-1);
        int faith2 = fib(n-2);

        int ans = faith1 + faith2;
    }
    public static int ClimbStairs(int n){
        // base Case -> Will Figure out Later
        // When Can we say we have a path? 
        if(n == 0)return 1; // Here this one is representing one path found 

        if(n<0) return 0; // No Valid Path possible with Previous Combinations of Jumps 

        int j1 = ClimbStairs(n-1);
        int j2 = ClimbStairs(n-2);
        int j3 = ClimbStairs(n-3);

        int TotalPath = j1 + j2 + j3;

    }

    // 9717970966 
}
