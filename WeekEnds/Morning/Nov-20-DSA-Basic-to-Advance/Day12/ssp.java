

public class ssp {
    public static void main(String[] args) {
        
    }
    public static boolean SubsetSum(int arr[],  int tar, int n, Boolean dp[][]) {
        // base case -> We will figure out
        if(tar == 0) return dp[n][tar] = true;
        if (n == 0)
            return dp[n][tar] = false;

        // everytime I have two choices
        if(dp[n][tar] != null) return dp[n][tar];
        boolean ans = false;
        // If I pick, but before picking I also have to check weater I can pick that not
        if (arr[n - 1] <= tar) {
            boolean c1 = SubsetSum(arr,  (tar - arr[n - 1]),  n +1, dp); // picking the element
            boolean c2 = SubsetSum(arr,  tar, n -1, dp); // not picking

            ans = c1 || c2;
        } else {
            // Here in this case, I just have one option to not pick

            ans = SubsetSum(arr,    tar, n + 1, dp);
        }

        return dp[n][tar] = ans;
    }
    
}
