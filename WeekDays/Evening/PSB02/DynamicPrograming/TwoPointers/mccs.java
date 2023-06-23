import java.util.*;

public class mccs {
    public static void main(String[] args) {
        // Leetcode 746
        int cost[] = {};
        int n;
        int s1 = fun(0, n, cost);
        int s2 = fun(1, n, cost);

        int ans = Math.min(s1, s2);;

        // MEmosied code 
        int a1 = fun_memo(1, n, cost, new int[n +1]);
        int a2 = fun_memo(0, n, cost, new int [n+ 1]);

        // Optmised -> recursive code 
        int ans01 = fun_opti_rec(cost, -1);
    }
    public static int fun(int si, int n, int cost[]){
        if(si == n-1){
            return cost[si];
        }
        if(si>= n) return 0;


        int temp = Math.min(fun(si+1, n, cost), fun(si +2, n, cost));

        return temp + cost[si];
    }
    public static int fun_memo(int si, int n, int cost[],int dp[]){
        if(si == n-1){
            return cost[si];
        }
        if(si>= n) return 0;


        int temp = Math.min(fun_memo(si+1, n, cost, dp), fun_memo(si +2, n, cost, dp));

        return temp + cost[si];
    }


    // Optmisation -> Using just one call from public static void main(String[] args) 
        
    public static int fun_opti_rec(int cost[], int n){
        // base case 
        if(n == cost.length - 1){
            return cost[n];
        }else if(n >= cost.length) return 0;

        int currCost = n == -1? 0: cost[n]; // just handelling the starting position  
        int ans = Math.min(fun_opti_rec(cost, n-1), fun_opti_rec(cost, n-2)) + currCost;

        /*
         * int currCost = 0;
         * if(n != -1){
         *      currCost = cost[n];
         * }
         */

        /*int j1 = fun_opti_rec(cost, n-1);
        int j2 = fun_opti_rec(cost, n -2);

        int ans = Math.min(j1, j2);
        ans = ans + currCost;


        return ans; */
    }
}
