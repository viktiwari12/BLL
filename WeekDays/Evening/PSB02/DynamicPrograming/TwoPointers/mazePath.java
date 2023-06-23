

public class mazePath {
    static int direction[][] = {{0,1},{1,0},{1,1}};
    public static void main(String[] args) {
        
    }
    public static int fun(int arr[][], int r, int c){
        // base case 
        if( r == arr.length && c == arr[0].length){
            return 1;
        }

        int ans = 0;
        for(int dir[] : direction){
            int nr = r + dir[0];
            int nc = c + dir[1];
            if(/*check the boundary cases  */){
                ans += fun(arr, nr, nc);
            }
        }
        return ans;

    }

    public static int fun_memo(int arr[][], int r, int c, int dp[][]){
        // base case 
        if( r == arr.length -1 && c == arr[0].length-1){ // reaching at the destination 
            return dp[r][c] = 1;
        }
        if(r >= arr.length || c >= arr[0].length) return 0; // Index out of bound 
        if(dp[r][c] != -1) return dp[r][c];
        int ans = 0;
        for(int dir[] : direction){
            int nr = r + dir[0];
            int nc = c + dir[1];
            //if(nr <arr.length && nc < arr[0].length){
                ans += fun(arr, nr, nc);
            //}
        }
        return dp[r][c] = ans;

    }
}
