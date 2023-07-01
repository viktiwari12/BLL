package DynamicPrograming.BuySellStock;

public class bs5 {
    public static void main(String[] args) {
        
    }
    // Given an array, arr[i] -> represent stock price of that particular day. 
    // You will also get a value K -> which represent the no of transaction allowed 
    // figure out the maximum profit yu can generate 
    // Now once u complete the transaction, you have one day cooldown,which mean ypu cannot do the transaction on the imideate next day, once you have completed a transaction

    public static int fun(int arr[], int curr, int buy){ // buy 0/1 0-> buy 1-> 
        // base case -> will figure out later on 
        if(curr == arr.length)return 0;

        if(buy == 0){
            int bought = (fun(arr, curr+1, 1))- (arr[curr]); // we are loosing money || faith -> for current item, I am choosing to buy, figure out the max profit out of the rest 
            int notBought = fun(arr, curr +1, buy); // when we buy/ not do we actually complete a trasaction ? 
            return Math.max(bought, notBought);
        }else{
            int sell = fun(arr, curr + 2 , 0) + arr[curr];
            int notSell = fun(arr, curr +1, buy);
            return Math.max(sell, notSell);

        }

    }
}
