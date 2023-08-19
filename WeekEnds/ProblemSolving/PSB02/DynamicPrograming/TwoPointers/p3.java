public class p3 {
    public static int direction[][] = {{0, -1}, {-1, 0}, {-1, -1}};
    public static void main(String[] args) {
        
    }
    // recursive ways 
    public static int mazePath(int r, int c){
        // base case 
        if(r == 0 && c == 0) return 1; // found a path 
        //if(r <0 || c <0) return 0;


        int ans = 0; 
        for(int dir[] : direction){
            int nr = r + dir[0];
            int nc = c + dir[1];
            // check if the new row and col is out of bound or not 
            if(nr >=0 && nc >=0 ){
                ans += mazePath(nr, nc);
            }
        }
        return ans;

        /*
          ans = 0

          // hor move 
          ans += mazePath(r, c-1);
          ans += mazePath(r-1, c);
          ans += maxe Path(r-1, c-1);
         */
    }
    public static int mazePath_memo(int r, int c, int dp[][]){
        // base case 
        if(r == 0 && c == 0) return dp[r][c] = 1; // found a path 
        //if(r <0 || c <0) return 0;

        if(dp[r][c] != -1)return dp[r][c];
        int ans = 0; 
        for(int dir[] : direction){
            int nr = r + dir[0];
            int nc = c + dir[1];
            // check if the new row and col is out of bound or not 
            if(nr >=0 && nc >=0 ){
                ans += mazePath_memo(nr, nc, dp);
            }
        }
        return dp[r][c] = ans;
    }
    
}
