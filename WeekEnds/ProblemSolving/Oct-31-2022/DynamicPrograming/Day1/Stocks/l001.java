class l001 {
    public static void main(String[] args) {
        int arr[] = {};
    }

    // Buy and sell stock with one transaction allowed
    public static int bs1(int arr[], int n) {
        // We need to maintain tow things, MinPrice and the MaxProfit

        int MinPrice = arr[0]; // think for the alternative of this when array size is 0.
        int MaxProfit = 0;

        for (int i = 1; i < n; i++) {
            // find the minimum till today

            MinPrice = Math.min(MinPrice, arr[i]);

            // try to sell today and see what prpfit you can generate
            int currProfit = arr[i] - MinPrice;

            // Update your profit
            MaxProfit = Math.max(MaxProfit, currProfit);

        }
        return MaxProfit < 0 ? 0 : MaxProfit;
    }

    // Buy and sell stock with multiple transaction allowed 

    public static int bs2_rec(int arr[], int idx, int buy){ // 0 -> buy -> 1-> sell
        // Base case-> will figure out
        if(idx == arr.length)return 0;


        int profit = 0;

        if(buy == 0){ // I can buy here 
            int bought = bs2_rec(arr, idx +1, 1) - arr[idx];
            int notBought = bs2_rec(arr, idx+1, 0);

            profit = Math.max(bought, notBought);
        }else{
            int sold = arr[idx] + bs2_rec(arr, idx+1, 0);
            int notSold = bs2_rec(arr, idx+1, 1);
            profit = Math.max(notSold, notSold);
        }
        return profit;


    }
    public static int bs2_memo(int arr[], int idx, int buy, int dp[][]){ // 0 -> buy -> 1-> sell
        // Base case-> will figure out
        if(idx == arr.length)return dp[idx][buy] = 0;


        // check if previously computed 
        if(dp[idx][buy] != -1) return dp[idx][buy];
        int profit = 0;
        if(buy == 0){ // I can buy here 
            int bought = bs2_memo(arr, idx +1, 1, dp) - arr[idx];
            int notBought = bs2_memo(arr, idx+1, 0, dp);

            profit = Math.max(bought, notBought);
        }else{
            int sold = arr[idx] + bs2_memo(arr, idx+1, 0, dp);
            int notSold = bs2_memo(arr, idx+1, 1, dp);
            profit = Math.max(notSold, notSold);
        }
        return dp[idx][buy] = profit;

        // H/w -> Draw the tree, and evaluate the overlapping subproblems  & convert this memoised code into tabulation 

    }
    public static int bs3(int arr[], int idx, int buy, int tar){ // 0 -> buy -> 1-> sell
        // Base case-> will figure out
        if(idx == arr.length || tar == 2)return 0;


        int profit = 0;

        if(buy == 0){ // I can buy here 
            int bought = bs3(arr, idx +1, 1, tar) - arr[idx];
            int notBought = bs3(arr, idx+1, 0, tar);

            profit = Math.max(bought, notBought);
        }else{
            int sold = arr[idx] + bs3(arr, idx+1, 0, (tar +1));
            int notSold = bs3(arr, idx+1, 1, tar);
            profit = Math.max(notSold, notSold);
        }
        return profit;


    }
    public static int bs4(int arr[], int idx, int buy, int tar){ // 0 -> buy -> 1-> sell
        // Base case-> will figure out
        if(idx == arr.length || tar == 0)return 0;


        int profit = 0;

        if(buy == 0){ // I can buy here 
            int bought = bs4(arr, idx +1, 1, tar) - arr[idx];
            int notBought = bs4(arr, idx+1, 0, tar);

            profit = Math.max(bought, notBought);
        }else{
            int sold = arr[idx] + bs4(arr, idx+1, 0, (tar -1));
            int notSold = bs4(arr, idx+1, 1, tar);
            profit = Math.max(notSold, notSold);
        }
        return profit;


    }

    public static int bs5(int arr[], int buy){ // with a cooldown

    }
    public static int bs5(int arr[], int idx, int buy){ // 0 -> buy -> 1-> sell
        // Base case-> will figure out
        if(idx >= arr.length)return 0;


        int profit = 0;

        if(buy == 0){ // I can buy here 
            int bought = bs5(arr, idx +1, 1) - arr[idx];
            int notBought = bs5(arr, idx+1, 0);

            profit = Math.max(bought, notBought);
        }else{
            int sold = arr[idx] + bs5(arr, idx+2, 0);
            int notSold = bs5(arr, idx+1, 1);
            profit = Math.max(notSold, notSold);
        }
        return profit;


    }

    // last one with a transaction fees 
    public static int bs6(int arr[], int idx, int buy, int fees[]){ // 0 -> buy -> 1-> sell
        // Base case-> will figure out
        if(idx >= arr.length)return 0;


        int profit = 0;

        if(buy == 0){ // I can buy here 
            int bought = bs6(arr, idx +1, 1, fees) - arr[idx];
            int notBought = bs6(arr, idx+1, 0, fees);

            profit = Math.max(bought, notBought);
        }else{
            int sold = arr[idx] + bs6(arr, idx+2, 0, fees) - fees[idx];
            int notSold = bs6(arr, idx+1, 1, fees);
            profit = Math.max(notSold, notSold);
        }
        return profit;


    }


    // H/w -> wtite down the memoised and tabulation of all the abouve program && try to draw the tree diagram and try to figure out the overlapping subproblems 
    

}