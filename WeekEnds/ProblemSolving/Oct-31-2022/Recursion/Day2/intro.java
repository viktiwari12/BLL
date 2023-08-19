class intro{
    public static int n = 4;
    public static int col[] = new int[n];
    public static int dia[] = new int[(2*n) -1];
    public static int antidia[] = new int[(2*n )-1];
    public static void main(String[] args) {
        int queen[][] = new int[n][n];
        System.out.println( nqueen(queen, 0));
    }
    public static int nqueen(int queen[][], int row){
        //base case 
        if(row == queen.length){
            dispaly(queen);
            return 1;
        }
        int ans = 0;
        for(int c = 0; c<n; c++){
            if(isSafe(queen, row, c)){
                // place here 
                queen[row][c] = 1;
                col[c] = 1 ; dia[row + c] =1; antidia[(n-1) + (c -row)] = 1;
                ans += nqueen(queen, row+1);
                // unplace 
                queen[row][c] = 0;
                // unmark 
                col[c] = 0 ; dia[row + c] = 0; antidia[n-1 + c -row] = 0;

            }
        }

        return ans;
    }
    public static boolean isSafe(int queen[][], int r, int c){
        if(col[c]== 0 && dia[r +c] == 0 && antidia[(n-1) + (c-r)] == 0){
            return true;
        }else return false;


        // now my is safe is of 0(1) operation 

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