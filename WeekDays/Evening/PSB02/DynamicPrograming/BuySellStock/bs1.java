

public class bs1 {
    public static void main(String[] args) {
        
    }
    public static int fun(int arr[], int curr, boolean buy){
        // base case 
        if(curr == arr.length) return 0;


        if(buy){
            int bought = fun(arr, curr +1, !buy) - arr[curr];
            int notBought = fun(arr, curr+1, buy);
            return Math.max(bought, notBought);
        }else{
            int sell = fun(arr, curr +1, !buy) + arr[curr];
            int notSell = fun(arr, curr +1, buy);
            return Math.max(sell, notSell);
        }
    }
    public static int fun_memo(int arr[], int curr, int buy, int dp[][]){ // 0-> buy 1 -> sell 
        // base case 
        if(curr == arr.length) return dp[buy][curr] = 0;

        if(dp[buy][curr] != -1) return dp[buy][curr];
        if(buy == 0){
            int bought = fun_memo(arr, curr +1, 1, dp) - arr[curr];
            int notBought = fun_memo(arr, curr+1, buy, dp);
            return dp[buy][curr] = Math.max(bought, notBought);
        }else{
            int sell = fun_memo(arr, curr +1, 0, dp) + arr[curr];
            int notSell = fun_memo(arr, curr +1, buy, dp);
            return dp[buy][curr] = Math.max(sell, notSell);
        }
    }

    // Can we do this in pure O(N) ? wiht no extra space 
    public static int fun_opti(int arr[]){
        int min = arr[0]; // telling me the mimimu  stock price untill now 
        int profit = 0;
        for(int curr = 1; curr < arr.length; curr++){
            int currProfit = arr[curr] - min;

            // Update the Profit 
            profit = Math.max(currProfit, profit);

            // at the same time don't forget to update the minmum, 
            min = Math.min(arr[curr], min );
        }
        return profit;
    }
}
