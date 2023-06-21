public class wrdbrk{
     public static int direction[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public static void main(String[] args) {
        // PLease Handle the iNput by yourself 

        char board[][] = {{}};
        String tar  = "vikash";
        boolean ans = false;
        for(int i = 0; i< board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == tar.charAt(0)){ // In the entire board, Start Searching from the position the you get the starting character of the target string
                    ans = ans || fun();
                    if(ans) return true;
                }
            }
        }
        return false;
    }
    public static boolean fun(char board[][] , int r, int c, String tar, int curr, boolean vis[][]){
        // base case 
        if(curr == tar.length()-1) return true;
        // first mark the curr box as visited 

        vis[r][c] = true;
        for(int dir[] : direction ){
            int nr = r + dir[0];
            int nc = c + dir[1];

            if(nr >= 0 && nc >= 0 && nr< board.length && nc < board[0].length  && !vis[nr][nc] &&  board[nr][nc] == tar.charAt(curr +1)){
                if(fun(board, nr, nc, tar, curr+1, vis)) return true;
            }
        }

        vis[r][c] = false;
        return false;

    }

}