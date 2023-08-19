public class knightTour {
    public static int n = 5;
    public static int direction[][] = {{-2, 1},{-1, 2}, {1, 2},{2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}};
    public static void main(String[] args) {
        
        int board[][] = new int[n][n];


        System.out.println(knight(board, 2, 0, 1));
    }
    public static boolean knight(int board[][], int row, int col, int count){
        // base case
        if(count == n*n){
            board[row][col] = count;
            dispaly(board);
            return true;

        }
        // Here I can go at 8 possible spots
        boolean ans = false;
        for(int dir[]: direction ){
            int r = row + dir[0];
            int c = col + dir[1];

            if(r <n && c < n &&  r>= 0 && c >=0 && board[r][c] == 0){
                // mark 
                board[row][col] = count;
                
                ans = ans || knight(board, r, c, (count+1));
                // unmark the position 
                board[row][col] = 0;
            }
        }
        return ans;
    }
    public static void dispaly(int arr[][]){
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
