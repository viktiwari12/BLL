class l001 {
    public int longestCommonSubsequence(String s1, String s2) {
        
        int dp[][] = new int [s1.length() +1][s2.length() +1];
        //for(int x[] : dp) Arrays.fill(x, -1);
        return fun_tabu(s1, s2, s1.length(), s2.length(), dp);
    }
    public int fun_rec(String s1, String s2, int n, int m){ // Note that n & m are lenght not the Indexes    
        // base case -> will figure out later on 
        if(n == 0 || m == 0) return 0;    

        char ch1 = s1.charAt(n-1);
        char ch2 = s2.charAt(m-1);
        if(ch1 == ch2){
            return 1+ fun_rec(s1, s2, n-1, m-1);
        }else{
            int x = fun_rec(s1, s2, n-1, m);
            int y = fun_rec(s1, s2, n, m-1);
            return Math.max(x, y);
        }
    }
    public int fun_memo(String s1, String s2, int n, int m, int dp[][]){
         if(n == 0 || m == 0) return dp[n][m] =0;    

        // check if the current is precalculated ? 
        if(dp[n][m] != -1) return dp[n][m];
        char ch1 = s1.charAt(n-1);
        char ch2 = s2.charAt(m-1);
        if(ch1 == ch2){
            return dp[n][m] = 1+ fun_memo(s1, s2, n-1, m-1, dp);
        }else{
            int x = fun_memo(s1, s2, n-1, m, dp);
            int y = fun_memo(s1, s2, n, m-1, dp);
            return dp[n][m] = Math.max(x, y);
        }
    }
    public int fun_tabu(String s1, String s2, int N, int M, int dp[][]){

        for(int n = 0; n<=N; n++){
            for(int m = 0; m<=M; m++){
                if(n == 0 || m == 0) {
                    dp[n][m] =0;
                    continue;
                }
                char ch1 = s1.charAt(n-1);
                char ch2 = s2.charAt(m-1);   
                if(ch1 == ch2){
                    dp[n][m] = 1+ dp[n-1][m-1];//fun_memo(s1, s2, n-1, m-1, dp);
                }else{
                    int x = dp[n-1][m];//fun_memo(s1, s2, n-1, m, dp);
                    int y = dp[n][m-1]; //fun_memo(s1, s2, n, m-1, dp);
                    dp[n][m] = Math.max(x, y);
                } 
            }
        }
        return dp[N][M];
        
    }
}