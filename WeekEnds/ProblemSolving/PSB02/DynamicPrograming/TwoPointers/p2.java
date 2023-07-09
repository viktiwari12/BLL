

public class p2 {
    public static void main(String[] args) {
        
    }
    public static int cb_rec(int n){
        // base case -> will figure out later on 
        if(n == 0) return 1; // here it tell us tghat we have found 1 path 
        if(n <0) return 0; // No path possible 

        int j1 = cb_rec(n-1); // recursion tell me total no of paths after taking 1 jump 
        int j2 = cb_rec(n-2); // recursion tell me total no of path after taking  jump of 2 stairs 
        int j3 = cb_rec(n-3); // recursion temll me total no of path after taking jump of 3 staris 

        int ans = j1 + j2 + j3;
    }
    public static int cb_memo(int n, int dp[]){
        // base case -> will figure out later on 
        if(n == 0) return dp[n] = 1; // here it tell us tghat we have found 1 path 
        if(n <0) return 0; // No path possible 

        if(dp[n] != -1) return dp[n];
        int j1 = cb_memo(n-1, dp); // recursion tell me total no of paths after taking 1 jump 
        int j2 = cb_memo(n-2, dp); // recursion tell me total no of path after taking  jump of 2 stairs 
        int j3 = cb_memo(n-3, dp); // recursion temll me total no of path after taking jump of 3 staris 

        return dp[n] = j1 + j2 + j3;
    }
    public static int cb_tabu(int N, int dp[]){

        // base case -> will figure out later on 
        for(int n = 0 ; n<= N; n++){
            if(n == 0){
                dp[n] = 1; 
                continue;
            }// here it tell us tghat we have found 1 path 
            if(n - 3 <0) continue; // No path possible 
            int j1 = dp[n-1];//cb_memo(n-1, dp); // recursion tell me total no of paths after taking 1 jump 
            int j2 = dp[n-2];//cb_memo(n-2, dp); // recursion tell me total no of path after taking  jump of 2 stairs 
            int j3 = dp[n-3];cb_memo(n-3, dp); // recursion temll me total no of path after taking jump of 3 staris 

            dp[n] = j1 + j2 + j3;
        }
        

    

        
    }
     public static int cbNjump_rec(int n){
        // base case -> will figure out later on 
        if(n == 0) return 1; // here it tell us tghat we have found 1 path 
        if(n <0) return 0; // No path possible 

        int ans = 0;
        for(int j = 1; j<=n; j++){
            ans += cbNjump_rec(n -j);
        }
       
        return ans;
    }
    
    /* 
    // Problem No 1 
    // climb Stairs 
    // Given n stairs -> from every stairs yoou can take upto 3 jump 
    /* 
     * j1 -> jump of one stairs 
     * j2 -> jump of two stairs 
     * j3 -> jump of three stairs 
     * 
     * 
     * Figure out the total no of path poosible to reach from 0t stairs to nth stair 
     
        // Problem no 2 

        /* 
         * From nth star u can take utp n jumps 
         * total no of path 
         
     // Prb 3 -> 
    
      * With each stairs there is a cost assioated, which u will have to pay once u jupm fro that stair

        figure out the path in wich u will have to pay the min cost 
      


      

      */

}
