

public class l002 {
    public static void main(String[] args) {
        
    }
    // all path 

    public static int allPath_Rec(int n){
        if(n== 0) return 1;

        if(n<0) return 0; 

        int j1 = allPath_Rec(n-1);
        int j2 = allPath_Rec(n-2);
        int j3 = allPath_Rec(n-3); 


        int ans = j1 + j2 + j3;

        return ans;


        
    }
    public static int allPath_memo(int n, int dp[]){
        if(n== 0) return dp[n] = 1;

        if(n<0) return 0; 


        // jsut check if previously evaluated 

        if(dp[n]  != -1) return dp[n];
        int j1 = allPath_memo(n-1, dp);
        int j2 = allPath_memo(n-2, dp);
        int j3 = allPath_memo(n-3, dp); 
        int ans = j1 + j2 + j3;
        // before returnning, just store it.
        return dp[n] = ans;  
    }
    public static int allPath_tabu(int N, int dp[]){
        for(int n = 0; n<=N; n++){
            if(n== 0){
                dp[n] = 1;
                continue;
            }
            for(int j = 1; j<= 3; j++){
                if((n-j) >=0) dp[n] += dp[n-j];
            }
        }
        return dp[N];
    }

    public static int minPath_memo(int n, int dp[], int cost[]){
        if(n== 0) return dp[n] = 1;

        if(n<0) return 0; 


        // jsut check if previously evaluated 

        if(dp[n]  != -1) return dp[n];
        int j1 = minPath_memo(n-1, dp, cost);
        int j2 = minPath_memo(n-2, dp, cost);
        int j3 = minPath_memo(n-3, dp, cost); 


        int ans = Math.min(j1, Math.min(j2, j3)) + cost[n];

        // before returnning, just store it.
        return dp[n] = ans;
        
    }
}
