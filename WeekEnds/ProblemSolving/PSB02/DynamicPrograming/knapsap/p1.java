import java.util.*;
public class p1 {
    public static void main(String[] args) {
        int wt[] =  {1, 2, 3, 4, 5, 6, 7};
        int cost[] ={3, 4, 5, 3, 8, 9, 4};
        int cap = 12;
        int dp[][] = new int [wt.length+1][cap+1];
        int dp2[][] = new int [wt.length+1][cap+1];
        for(int x[]: dp) Arrays.fill(x, -1);
        for(int x[]: dp2) Arrays.fill(x, -1);

        fun_memo(wt, cost, cap, wt.length, dp);
        display(dp);
        fun_tabu(wt, cost, cap, wt.length, dp2);
        display(dp2);


    }
    public static void display(int arr[][]){
        for(int i = 0; i<arr.length;  i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int fun(int wt[], int cost[], int cap, int curr){
        // base case 
        if(cap ==0 || curr == 0){ // no more space or no  more elements left 
            return 0;
        }

        if(wt[curr -1] <= cap){ //  we have got two options. Pick or don't pick 
            int pck = (cost[curr-1]) + fun(wt, cost,( cap- wt[curr-1]), curr -1);
            int notPick = 0 + fun(wt, cost, cap, curr -1);
            return Math.max(pck, notPick);
        }else{
            return fun(wt, cost, cap, curr -1);
        }
    }
    public static int fun_memo(int wt[], int cost[], int cap, int curr, int dp[][]){
        // base 
        if(cap ==0 || curr == 0){ // no more space or no  more elements left 
            return dp[curr][cap] = 0;
        }

        if(dp[curr][cap] != -1) return dp[curr][cap];
        if(wt[curr -1] <= cap){ //  we have got two options. Pick or don't pick 
            int pck = cost[curr-1] + fun_memo(wt, cost, cap- wt[curr-1], curr -1, dp);
            int notPick = 0 + fun_memo(wt, cost, cap, curr -1, dp);
            return dp[curr][cap] = Math.max(pck, notPick);
        }else{
            return dp[curr][cap] = fun_memo(wt, cost, cap, curr -1, dp);
        }
    }
    public static int fun_tabu(int wt[], int cost[], int CAP, int CURR, int dp[][]){
        // base 
        for(int curr = 0; curr<=CURR; curr++ ){
            for(int cap = 0; cap<= CAP; cap++){
                if(cap ==0 || curr == 0){ // no more space or no  more elements left 
                    dp[curr][cap] = 0;
                    continue;
                }
                if(wt[curr -1] <= cap){ //  we have got two options. Pick or don't pick 
                    int pck = cost[curr-1] + dp[curr-1][cap-wt[curr-1]];//fun_memo(wt, cost, cap- wt[curr-1], curr -1, dp);
                    int notPick = 0 + dp[curr-1][cap]; //fun_memo(wt, cost, cap, curr -1, dp);
                    dp[curr][cap] = Math.max(pck, notPick);
                    continue;
                }else{
                    dp[curr][cap] =dp[curr-1][cap];//fun_memo(wt, cost, cap, curr -1, dp);
                    continue;
                }
            }
        
        }
        return dp[CURR][CAP];
       

        //if(dp[curr][cap] != -1) return dp[curr][cap];
        
    }

    // Subbset sum promen



}
