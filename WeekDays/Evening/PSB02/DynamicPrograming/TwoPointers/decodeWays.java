
// https://leetcode.com/problems/decode-ways/

public class decodeWays {
    public static void main(String[] args) {
        String str = "122345";
    }
    public static int fun_rec(String str, int idx){
        // base case
        if(idx == str.length()) return 1;
        // first check? -> check if the curr character is a 0 or not 
        char ch1 = str.charAt(idx);
        if(ch1 == '0') return 0; // -> Not able to decode it any further 
        // now if it's not 0 -> we can blindly put the prist recursive call 
        int ans  = fun_rec(str, idx+1);
        // Can we put the second call Blindly?
        if(idx +1 < str.length()){
            char ch2 = str.charAt(idx +1);  // 5   6 -> (5 * 10) + 6
            // now check the ch1 + ch2 combined <= 26 or not? 
            int num = ((ch1 -'0') * 10 )+ (ch2 -'0');
            if(num <= 26){
                ans += fun_rec(str, idx +2);
            } 
        }
        return ans;
    }
    public static int fun_memo(String str, int idx, int dp[]){
        // base case
        if(idx == str.length()) return dp[idx] = 1;

        if(dp[idx]!= -1) return dp[idx];
        // first check? -> check if the curr character is a 0 or not 
        char ch1 = str.charAt(idx);
        if(ch1 == '0') return 0; // -> Not able to decode it any further 
        // now if it's not 0 -> we can blindly put the prist recursive call 
        int ans  = fun_memo(str, idx+1, dp);
        // Can we put the second call Blindly?
        if(idx +1 < str.length()){
            char ch2 = str.charAt(idx +1);  // 5   6 -> (5 * 10) + 6
            // now check the ch1 + ch2 combined <= 26 or not? 
            int num = ((ch1 -'0') * 10 )+ (ch2 -'0');
            if(num <= 26){
                ans += fun_memo(str, idx +2, dp);
            } 
        }
        return dp[idx] = ans;
    }
}
