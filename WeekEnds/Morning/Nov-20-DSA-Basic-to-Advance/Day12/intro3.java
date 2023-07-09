import java.util.Arrays;

public class intro3 {
    public static void main(String[] args) {
        int cost[] = { 1, 4, 5, 7 };

        int wt[] = { 1, 3, 4, 5 };

        int cap = 7;
        int dp3[][] = new int[cost.length + 1][cap + 1];
        int dp2[][] = new int[cost.length + 1][cap + 1];
        for (int arr[] : dp2) {
            Arrays.fill(arr, -1);
        }
        int p1  = knapsap_memo(cost, wt, cap, cost.length, dp2);
        int p3 = knapsap_tabu(cost, wt, cap, cost.length, dp3);
        System.out.println("Memoisation ");
        System.out.println(p1);
        display(dp2);

        System.out.println("Tabulation ");
        System.out.println(p3);
        display(dp3);


        

    }
    public static void display(int arr[][]){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[0].length; j++){
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }
    public static int knapsap_memo(int cost[], int wt[], int cap, int n, int dp[][]) {
        // base case -> We will figure out
        if (n == 0 || cap == 0)
            return dp[n][cap] = 0;

        // everytime I have two choices

        // just check=, Have I ever elplored any such combination or not ?
        if (dp[n ][cap ] != -1){
            //System.out.println("Hey Got an overlapping situation! ");
            return dp[n ][cap];
        }
        int MaxProfit = 0;
        // If I pick, but before picking I also have to check weater I can pick that not
        if (wt[n - 1] <= cap) {
            int currWt = wt[n-1];
            int c1 = cost[n - 1] + knapsap_memo(cost, wt, (cap - currWt), n - 1, dp); // picking the element
            int c2 = 0 + knapsap_memo(cost, wt, cap, n - 1, dp); // not picking

            MaxProfit = Math.max(c1, c2);
        } else {
            // Here in this case, I just have one option to not pick

            MaxProfit = 0 + knapsap_memo(cost, wt, cap, n - 1, dp);
        }

        // now just store here before returning
        return dp[n][cap] = MaxProfit;
    }
    public static int knapsap_tabu(int cost[], int wt[], int CAP, int N, int dp[][]){

        for(int n =0 ; n<=N; n++){
            for(int cap = 0; cap<= CAP; cap++){
                if (n == 0 || cap == 0){
                    dp[n][cap] = 0;
                    continue;
                }
                int MaxProfit = 0;
                int currWt = wt[n - 1];
                if ( currWt <= cap) {
                int c1 = cost[n - 1] + dp[n - 1][cap - currWt]; // picking the element
                int c2 = dp[ n - 1][cap] ; // not picking
                    MaxProfit = Math.max(c1, c2);
                } else {
                    // Here in this case, I just have one option to not pick
                    MaxProfit = dp[ n - 1][cap] ; // not picking
                }

                dp[n][cap] = MaxProfit;
            }
            // now just store here before returning
        }
        return dp[N][CAP];
    }
    
}
