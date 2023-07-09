import java.util.Arrays;

public class intro2 {
    public static void main(String[] args) {
        int cost[] = { 1, 4, 5, 7 };

        int wt[] = { 1, 3, 4, 5 };

        int cap = 7;
        int dp1[][] = new int[cost.length + 1][cap + 1];

        int dp2[][] = new int[cost.length + 1][cap + 1];
        for (int arr[] : dp1) {
            Arrays.fill(arr, -1);
        }

        for (int arr[] : dp2) {
            Arrays.fill(arr, -1);
        }
        int p1 = knapsap_memo(cost, wt, cap, cost.length, dp1);
        int p2 = knapsap_memo01(cost, wt, cap, 0, 0, dp2);
        System.out.println("Bottom Up ");
        display(dp1);
        System.out.println(p1);

        System.out.println();
        System.out.println();
        System.out.println("Top down ");
        display(dp2);
        System.out.println(p2);


        int dp3[][] = new int[cost.length + 1][cap + 1];
        int p3 = knapsap_tabu(cost, wt, cap, cost.length, dp3);

        System.out.println("Tabulation ");
        display(dp3);
        System.out.println(p3);




    }

    public static void display(int arr[][]){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[0].length; j++){
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public static int knapsap(int cost[], int wt[], int cap, int n) {
        // base case -> We will figure out
        if (n == 0 || cap == 0)
            return 0;

        // everytime I have two choices
        int MaxProfit = 0;
        // If I pick, but before picking I also have to check weater I can pick that not
        if (wt[n - 1] <= cap) {
            int c1 = cost[n - 1] + knapsap(cost, wt, (cap - wt[n - 1]), n - 1); // picking the element
            int c2 = 0 + knapsap(cost, wt, cap, n - 1); // not picking

            MaxProfit = Math.max(c1, c2);
        } else {
            // Here in this case, I just have one option to not pick

            MaxProfit = 0 + knapsap(cost, wt, cap, n - 1);
        }

        return MaxProfit;
    }

    public static int knapsap_memo(int cost[], int wt[], int cap, int n, int dp[][]) {
        // base case -> We will figure out
        if (n == 0 || cap == 0)
            return dp[n][cap] = 0;

        // everytime I have two choices

        // just check=, Have I ever elplored any such combination or not ?
        if (dp[n ][cap ] != -1)
            return dp[n ][cap];

        int MaxProfit = 0;
        // If I pick, but before picking I also have to check weater I can pick that not
        if (wt[n - 1] <= cap) {
            int c1 = cost[n - 1] + knapsap_memo(cost, wt, (cap - wt[n - 1]), n - 1, dp); // picking the element
            int c2 = 0 + knapsap_memo(cost, wt, cap, n - 1, dp); // not picking

            MaxProfit = Math.max(c1, c2);
        } else {
            // Here in this case, I just have one option to not pick

            MaxProfit = 0 + knapsap_memo(cost, wt, cap, n - 1, dp);
        }

        // now just store here before returning
        return dp[n][cap] = MaxProfit;
    }

    public static int knapsap_memo01(int cost[], int wt[], int cap, int n, int currCap, int dp[][]) {
        // base case -> We will figure out
        if (n == cost.length || currCap == cap)
            return dp[n][currCap] = 0;

        // everytime I have two choices

        // just check=, Have I ever elplored any such combination or not ?
        if (dp[n][currCap] != -1)
            return dp[n][currCap];

        int MaxProfit = 0;
        // If I pick, but before picking I also have to check weater I can pick that not
        if (currCap + wt[n] <= cap) {
            int c1 = cost[n] + knapsap_memo01(cost, wt, cap, n + 1, (currCap + wt[n]), dp); // picking the element
            int c2 = 0 + knapsap_memo01(cost, wt, cap, n + 1, currCap, dp); // not picking

            MaxProfit = Math.max(c1, c2);
        } else {
            // Here in this case, I just have one option to not pick

            MaxProfit = 0 + knapsap_memo01(cost, wt, cap, n + 1, currCap, dp);
        }

        // now just store here before returning
        return dp[n][currCap] = MaxProfit;
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
                System.out.println("Figuring out first ans from row  " + (n-1) + "  and  col  " + (cap - currWt)  + "  Which is  " +( dp[n - 1][cap - currWt]));
                int c2 = dp[ n - 1][cap] ; // not picking
                System.out.println("Figuring out Second ans from row  " + (n-1) + "  and  col  " + (cap) +  "  Which is  " +( dp[n - 1][cap ]) );

                System.out.println("adding currcost to first possibility aftr which  C1 ->  " + c1 +  " and   c2 ->   " + c2 );
                    MaxProfit = Math.max(c1, c2);
                } else {
                    // Here in this case, I just have one option to not pick
                    MaxProfit = dp[ n - 1][cap] ; // not picking
                    System.out.println("Figuring out Second ans from row  " + (n-1) + "  and  col  " + (cap) +  "  Which is  " +( dp[n - 1][cap ]) );
                }

                dp[n][cap] = MaxProfit;
            }
            // now just store here before returning
        }
        return dp[N][CAP];
    }
}

