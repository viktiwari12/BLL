class l001{
    public static void main(String[] args) {
        
    }
    // one liner 
    public static int fun(int n){
        return n <= 0? n : (fun(n-1) + fun(n-1));
    }

    // recursive code 
    public static int fib_rec(int n){
        if(n<= 1) return n;

        int a = fib_rec(n-1);
        int b = fib_rec(n-2);

        int ans = a+b;
        return ans;
    }
    // memoised 
    public static int fib_memo(int n, int dp[]){
        if(n<= 1) return dp[n] = n;
        // before computing just check if it has been computed ? if yes, return ans and don't compute further

        if(dp[n] != -1) return dp[n];

        int a = fib_memo(n-1,dp);
        int b = fib_memo(n-2, dp);

        // before return the ans, just store it somewhere so that, it can be acesssed in future

     
        int ans = a+b;
          //dp[n] = ans;
        return    dp[n] = ans;
    }
    // tabulation 
    public static int fib_tabu(int N, int dp[]){

        for(int n = 0; n<=N; n++){
            if(n<= 1){
                dp[n] = n;
                continue;
            }
            int a = dp[n-1];//fib_memo(n-1,dp);
            int b = dp[n-2];//fib_memo(n-2, dp)
            int ans = a+b;
            dp[n] = ans;
            //continue;  
        }
        return dp[N];
    }
    // recursion
    public static int mzp(int r, int c){
        if(r == 0 || c == 0 ) return 1;

        int x = mzp(r-1, c);
        int y = mzp(r, c-1);

        int tp = x + y;
        return tp;
    }
    // memoisation
    public static int mzp_memo(int r, int c, int dp[][]){
        if(r == 0 || c == 0 ) return dp[r][c] = 1;

        if(dp[r][c] != -1) return dp[r][c];
        int x = mzp_memo(r-1, c, dp);
        int y = mzp_memo(r, c-1, dp);

        int tp = x + y;
        return dp[r][c] = tp;
    }
    // tabulation 
     public static int mzp(int R, int C, int dp[][]){

        for(int r = 0; r<= R; r++){
            for(int c = 0; c<= C; c++){
                if(r == 0 || c == 0 ){
                     dp[r][c] =  1;
                        continue;
                }
                int x = dp[r-1][c];//mzp(r-1, c);
                int y = dp[r][c-1];//mzp(r, c-1);
                int tp = x + y;
                dp[r][c] = tp;
                continue;
            }
        }
        
       
       
    }



}