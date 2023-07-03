//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.LongestRepeatingSubsequence(str);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestRepeatingSubsequence(String str)
    {
        // code here
        int n=str.length(); 
        int[][] dp=new int[n+1][n+1]; 
        for(int[] row:dp) Arrays.fill(row,-1);
        return fun_memo(str, str.length(), str.length(), dp);
    }
    public int fun(String str, int i, int j){
        // base case 
        if(i ==0 || j == 0)return 0;
        
        
        char ch1 = str.charAt(i-1);
        char ch2 = str.charAt(j-1);
        if(ch1 == ch2 && i!= j){
            return 1+ fun(str, i-1, j-1 );
        }
        else{
            return Math.max(fun(str, i-1, j), fun(str, i, j-1));
        }
    }
     public int fun_memo(String str, int i, int j, int dp[][]){
        // base case 
        if(i ==0 || j == 0)return dp[i][j] =  0;
        
        
        if(dp[i][j] != -1) return dp[i][j];
        char ch1 = str.charAt(i-1);
        char ch2 = str.charAt(j-1);
        if(ch1 == ch2 && i!= j){
            return dp[i][j] = 1+ fun_memo(str, i-1, j-1 , dp);
        }
        else{
            return dp[i][j] = Math.max(fun_memo(str, i-1, j, dp), fun_memo(str, i, j-1, dp));
        }
    }
}