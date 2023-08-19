
public class l001 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "becd";
        int x  = lcs(s1, s2, s1.length(), s2.length());
        System.out.println(x);
    }
    public static int lcs(String s1, String s2, int i1, int i2){

        // base case 
        if(i1 == 0 || i2 == 0)return 0;
        
        if(s1.charAt(i1 -1) == s2.charAt(i2-1)){
            return 1 + lcs(s1, s2, i1-1, i2-1);
        }else{
            return Math.max(lcs(s1, s2, i1-1, i2), lcs(s1, s2, i1, i2-1));
        }

    }
    public static int lcs_memo(String s1, String s2, int i1, int i2, int dp[][]){

        // base case 
        if(i1 == 0 || i2 == 0)return dp[i1][i2] = 0;
        

        // before going forward, let's just check if we have computed it earlier or not 
        if(dp[i1][i2] != -1) return dp[i1][i2];

        if(s1.charAt(i1 -1) == s2.charAt(i2-1)){
            return dp[i1][i2] =  (1 + lcs_memo(s1, s2, i1-1, i2-1, dp));
        }else{
            return dp[i1][i2] = Math.max(lcs_memo(s1, s2, i1-1, i2, dp), lcs_memo(s1, s2, i1, i2-1, dp));
        }

    }
}
