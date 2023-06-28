

public class bs2 {
    public static void main(String[] args) {
        
    }
    // Given an array, arr[i] -> represent stock price of that particular day. 
    // You will also get a value K -> which represent the no of transaction allowed 
    // figure out the maximum profit yu can generate 
     public static int fun(int arr[], int curr, boolean buy, int trans){
        // base case 
        if(curr == arr.length || trans == 0) return 0;


        if(buy){
            int bought = fun(arr, curr +1, !buy, trans) - arr[curr];
            int notBought = fun(arr, curr+1, buy, trans);
            return Math.max(bought, notBought);
        }else{
            int sell = fun(arr, curr +1, !buy, trans -1) + arr[curr];
            int notSell = fun(arr, curr +1, buy, trans);
            return Math.max(sell, notSell);
        }
    }
}
