class Solution {
    public int longestPalindromeSubseq(String s) {
        int dp[][] = new int [s.length() ][s.length()];
        for(int x[] : dp) Arrays.fill(x, -1);
        return fun(s, 0, s.length()-1, dp);
    }
    public int fun(String s, int i, int j, int dp[][]){
        // base case -> 
        if(i>= j) return dp[i][j] = (i == j)? 1: 0;
        if(dp[i][j] != -1) return dp[i][j];
        char ch2 = s.charAt(j);
        char ch1 = s.charAt(i);
        if(ch1 == ch2){
            return dp[i][j] = fun(s, i+1, j-1,dp) + 2; // here +2 is for the curr two characters 
        }else{
            return dp[i][j] = Math.max(fun(s, i+1, j, dp), fun(s, i, j-1,dp));
        }
    }
}