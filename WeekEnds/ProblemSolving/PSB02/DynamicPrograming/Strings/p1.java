import java.util.*;

public class p1 {
    public static void main(String[] args) {
        String s1 = "Vikash";
        String s2 = "Tiwary";
    }
    public static int longestCommonSubsequence(String s1, String s2, int l1, int l2){
        // base case 
        if(l1 == 0 || l2 == 0) return 0;

        char ch1 = s1.charAt(l1-1);
        char ch2 = s2.charAt(l2-1);

        if(ch1 == ch2){
            return longestCommonSubsequence(s1, s2, l1-1, l2-1) + 1; // +1 for the current char
        }else{
            int x = longestCommonSubsequence(s1, s2, l1-1, l2);
            int y = longestCommonSubsequence(s1, s2, l1, l2-1);
            return Math.max(x, y);
        }
    }
    public static int longestCommonSubsequence_memo(String s1, String s2, int l1, int l2, int dp[][]){
        // base case 
         if(l1 == 0 || l2 == 0) return dp[l1][l2] = 0;
        
        if(dp[l1][l2] != -1) return dp[l1][l2];
        char ch1 = s1.charAt(l1-1);
        char ch2 = s2.charAt(l2-1);

        if(ch1 == ch2){
            return dp[l1][l2] = longestCommonSubsequence_memo(s1, s2, l1-1, l2-1, dp) + 1; // +1 for the current char
        }else{
            int x = longestCommonSubsequence_memo(s1, s2, l1-1, l2, dp);
            int y = longestCommonSubsequence_memo(s1, s2, l1, l2-1, dp);
            return  dp[l1][l2] = Math.max(x, y);
        }
    }
    public static int longestCommonSubsequence_tabu(String s1, String s2, int L1, int L2, int dp[][]){
        for(int l1 = 0; l1<= L1; l1++){
            for(int l2 = 0;  l2<=L2; l2++){
                 if(l1 == 0 || l2 == 0){
                    dp[l1][l2] = 0;
                    continue;
                 }
                char ch1 = s1.charAt(l1-1);
                char ch2 = s2.charAt(l2-1);
                if(ch1 == ch2){
                    dp[l1][l2] = dp[l1-1][l2-1];//longestCommonSubsequence_memo(s1, s2, l1-1, l2-1, dp) + 1; // +1 for the current char
                }else{
                    int x = dp[l1-1][l2];//longestCommonSubsequence_memo(s1, s2, l1-1, l2, dp);
                    int y = dp[l1][l2-1];//longestCommonSubsequence_memo(s1, s2, l1, l2-1, dp);
                    return  dp[l1][l2] = Math.max(x, y);
                }
            }
        } 

        return dp[L1][L2];

       
    }
}
