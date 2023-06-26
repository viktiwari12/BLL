import java.util.Arrays;

public class l001 {
    public static void main(String[] args) {
        int cost[] =    {4, 3, 2, 1, 5, 6};
        int wt[] =      {3, 2, 1, 4, 7, 2};
        int cap = 10;
        int maxBill;
        int dp[][] = new int [cost.length +1][cap+1];
        int dp2[][] = new int [cost.length +1][cap+1];
        for(int x[] : dp)   
            Arrays.fill(x, -1);

        
        for(int x[] : dp2)   
            Arrays.fill(x, -1);


        int ans2 = fun_memo(cost, wt, cap, cost.length, dp2);
        int ans = fun_tabu(cost, wt, cap, cost.length, dp);
        dis2(dp2);
        dis2(dp);

        System.out.println(ans);
        System.out.println(ans);

    }
    public static void dis1(int arr[]){
        for(int ele : arr)System.out.print(ele + "  ");

        System.out.println();
    }
    public static void dis2(int arr[][]){
        for(int ele[] : arr)dis1(ele);

        System.out.println();
    }
    
    // ZeroOneKnapSap
    public static int fun_rec(int cost[], int wt[], int cap, int curr){
        // base case 
        if(curr == 0 || cap == 0) return 0;
        
        if(wt[curr -1]<= cap){
            int pick = cost[curr -1] + fun_rec(cost, wt, cap - wt[curr-1], curr -1);
            int notPick = 0 + fun_rec(cost, wt, cap, curr -1);
            return Math.max(pick, notPick);
        }else{
            return fun_rec(cost, wt, cap, curr - 1);
        }
    } 
    public static int fun_memo(int cost[], int wt[], int cap, int curr, int dp[][]){
        // base case 
        if(curr == 0 || cap == 0) return  dp[curr][cap] = 0;
        if(dp[curr][cap] != -1) return dp[curr][cap];
        
        if(wt[curr -1]<= cap){
            int pick = cost[curr -1] + fun_memo(cost, wt, cap - wt[curr-1], curr -1, dp);
            int notPick = 0 + fun_memo(cost, wt, cap, curr -1, dp);
            return  dp[curr][cap] = Math.max(pick, notPick);
        }else{
            return  dp[curr][cap] = fun_memo(cost, wt, cap, curr - 1, dp);
        }
    }
    public static int fun_tabu(int cost[], int wt[], int CAP, int CURR, int dp[][]){

        for(int curr = 0; curr<=CURR; curr++){
            for(int cap = 0; cap<= CAP; cap++){
                if(curr == 0 || cap == 0){
                    dp[curr][cap] = 0;
                    continue;
                }
                if(wt[curr -1]<= cap){
                    //System.out.println(" r  -> " + curr + "   c ->  " + cap) ;
                    int pick = cost[curr -1] + dp[curr-1][cap- (wt[curr-1])];  //fun_memo(cost, wt, cap - wt[curr-1], curr -1, dp);
                    int notPick = 0 + dp[curr-1][cap];//fun_memo(cost, wt, cap, curr -1, dp);

                    //System.out.println("Pick ->  " +  pick + "Not Pick  ->  " + notPick);
                    dp[curr][cap] = Math.max(pick, notPick);
                    continue;
                }else{
                    dp[curr][cap] = dp[curr-1][cap];//fun_memo(cost, wt, cap, curr - 1, dp);
                    //System.out.println("Not Pick  ->  " + dp[curr][cap]);
                }

            }
        }
        // base case 
        
       // if(dp[curr][cap] != -1) return dp[curr][cap];
        return dp[CURR][CAP];
        
    }

}
