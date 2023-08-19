import java.util.*;

public class p2 {
    public static void main(String[] args) {
        
    }
    // target sum subset set 
    // Given an array and a tar value 
    // figure out if there exist a subset whose sum is euqal to the sum of the subset ?
    public static boolean tss(int arr[], int tar, int curr){
        // base case 
        if(tar == 0 || curr == 0) return tar == 0? true: false;
        
        

        if(arr[curr-1] <= tar){
            boolean pick = tss(arr, (tar - arr[curr -1]), (curr-1));
            // we got ans as true , do we need to check further? 
            
            boolean notPick = tss(arr, tar, (curr -1));
            return  pick || notPick;
        }else {
            return tss(arr, tar, curr -1);
        }
    } 
    public static boolean tss_memo(int arr[], int tar, int curr, Boolean dp[][]){
        // base case []
        if(tar == 0 || curr == 0) return dp[curr][tar] = tar == 0? true: false;
        
        
        if(dp[curr][tar] != null) return dp[curr][tar]; // this will stop muliple recursive calls 
        if(arr[curr-1] <= tar){
            boolean pick = tss_memo(arr, (tar - arr[curr -1]), (curr-1), dp);
            // we got ans as true , do we need to check further? 
            
            boolean notPick = tss_memo(arr, tar, (curr -1), dp);
            return dp[curr][tar] =  pick || notPick;
        }else {
            return dp[curr][tar] = tss_memo(arr, tar, curr -1, dp);
        }
    } 
    public static boolean tss_tabu(int arr[], int TAR, int CURR, Boolean dp[][]){
        // base case []
        for(int curr = 0; curr<=CURR; curr++ ){
            for(int tar = 0; tar<= TAR; tar++){
                if(tar == 0 || curr == 0){
                     dp[curr][tar] = tar == 0? true: false;
                     continue;
                }
                if(arr[curr-1] <= tar){
                    boolean pick = dp[curr-1][tar - arr[curr -1]];//tss_memo(arr, (tar - arr[curr -1]), (curr-1), dp);
                    // we got ans as true , do we need to check further? 
            
                    boolean notPick = dp[curr-1][tar];//tss_memo(arr, tar, (curr -1), dp);
                    dp[curr][tar] =  pick || notPick;
                    continue;
                }else {
                    dp[curr][tar] = dp[curr-1][tar]; //tss_memo(arr, tar, curr -1, dp);
                    continue;
                }
            }
        }
        return dp[CURR][TAR];
    } 
     public static boolean tss(int arr[], int tar, int csum,  int curr, int n){
        // base case 
        if(csum == tar) return true;
        if(curr > n) return false;
        

        if(arr[curr-1] <= tar){
            boolean pick = tss(arr, tar, csum + arr[curr-1], (curr+ 1), n);
            // we got ans as true , do we need to check further? 
            
            boolean notPick = tss(arr, tar, csum, (curr + 1), n);
            return  pick || notPick;
        }else {
            return tss(arr, tar, csum, (curr + 1), n);
        }
    } 
}

