
import java.util.Arrays;
public class l001 {
    public static void main(String[] args) {
        int wt[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 18, 20 };

        int val[] = {10, 20, 30, 40, 50, 60 ,70, 80, 90, 100, 110, 120, 130, 140};

        int cap = 100;
        int tar = 50;

        int dp[][] = new int[val.length + 1][cap +1];
        for(int arr[] : dp){
            Arrays.fill(arr, -1);
        }
        int ans = knapsapMemo(val, wt, cap, val.length, dp);
        System.out.println(ans);
    }
    // Question no 1
    public static int climbStair_rec(int n){
        // base case-> will figure out in sometime 
        // two base case 
        if(n <= 0) return n == 0? 1:0; 


       
        // simple recursive calls 
        int j1 = climbStair_rec(n-1);
        int j2 = climbStair_rec(n-2);
        int j3 = climbStair_rec(n-3);

        return j1 + j2+ j3;
    }


    public static int climbStair_meo(int n, int dp[]){
        // base case-> will figure out in sometime 
        // two base case 
        if(n <= 0) return dp[n] = n == 0? 1:0; 


        if(dp[n] != -1) return dp[n];
        // simple recursive calls 
        int j1 = climbStair_meo(n-1, dp);
        int j2 = climbStair_meo(n-2, dp);
        int j3 = climbStair_meo(n-3, dp);

        return dp[n] = j1 + j2+ j3;
    }

    public static int knapsap(int val[], int wt[], int cap, int idx){
        // base case-> will figure out 
        if(idx == 0 || cap == 0) return 0;


        if(wt[idx -1] <= cap){
            int pick = val[idx -1] + knapsap(val, wt, (cap - wt[idx - 1]), idx -1);
            int dontPick = 0 + knapsap(val, wt, cap, idx-1);
            return  Math.max(pick, dontPick);
        }else{
            return  knapsap(val, wt, cap, idx-1);
        }
    }

    public static int knapsapMemo(int val[], int wt[], int cap, int idx, int dp[][]){
        // base case-> will figure out 
        if(idx == 0 || cap == 0) return dp[idx][cap] = 0;

        if(dp[idx][cap] != -1){
            System.out.println("Hey Found an overlapping SubProblem");
            return dp[idx][cap]; 
        }
        if(wt[idx -1] <= cap){
            int pick = val[idx -1] + knapsapMemo(val, wt, (cap - wt[idx - 1]), idx -1, dp);
            int dontPick = 0 + knapsapMemo(val, wt, cap, idx-1, dp);
            return dp[idx][cap] = Math.max(pick, dontPick);
        }else{
            return dp[idx][cap] = knapsapMemo(val, wt, cap, idx-1, dp);
        }
    }


    // Subset Sum Problem 

    // You have an array, you have a target value, check if a subset exist, whose sum == tar


    public static boolean subsetSum(int arr[],  int tar, int idx, Boolean dp[][]){
        // base case-> will figure out 
        if(idx == 0 || tar == 0) return dp[tar][idx] = tar == 0? true : false;

        if(dp[tar][idx] != null) return dp[tar][idx];
        if(arr[idx - 1] <= tar){
            boolean pick =  subsetSum(arr,  (tar - arr[idx - 1]), idx -1, dp);
            boolean dontPick =  subsetSum(arr,  tar, idx-1, dp);
            return dp[tar][idx] = pick || dontPick;
        }else{
            return  dp[tar][idx] = subsetSum(arr, tar, idx-1, dp);
        }
    }


    // EuquSet Problem 
    // You have an array, check you can devide the arrya into two subset, whose sum are euqal 

    // You have to put all the number in any of the subset 



     

}
