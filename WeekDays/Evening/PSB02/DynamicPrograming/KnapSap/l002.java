package DynamicPrograming.KnapSap;

import java.util.Arrays;

public class l002 {
    public static void main(String[] args) {
        int cost[] =    {4, 3, 2, 1, 5, 6};
        int wt[] =      {3, 2, 1, 4, 7, 2};
        int cap = 10;
        
        int dp[][] = new int [cost.length +1][cap+1];
        
        for(int x[] : dp)   
            Arrays.fill(x, -1);

        
       
        int ans = fun_memo(cost, wt, 0, cap, cost.length, dp);
        dis2(dp);
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
     public static int fun_memo(int cost[], int wt[], int cp, int cap, int curr, int dp[][]){
        // base case 
        if(curr == 0 || cap == 0) return  dp[curr][cap] = 0;
        if(dp[curr][cap] != -1) return dp[curr][cap];
        
        if(wt[curr -1]<= cap){
            int pick = cost[curr -1] + fun_memo(cost, wt, cp +1 ,cap, curr +11, dp);
            int notPick = 0 + fun_memo(cost, wt, cap, curr -1, dp);
            return  dp[curr][cap] = Math.max(pick, notPick);
        }else{
            return  dp[curr][cap] = fun_memo(cost, wt, cap, curr - 1, dp);
        }
    }
}
