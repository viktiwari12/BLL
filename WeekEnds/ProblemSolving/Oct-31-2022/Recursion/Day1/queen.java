

public class queen {
    public static void main(String[] args) {
        
    }
    public static int nqueen(int arr[][], int row){
        // base case -> will figure out 
        if(row == arr.length){
            return 1;
        }


        for(int col = 0; col<arr[0].length; col++){
            if(isSafetoPlace(arr, row, col)){
                // place here 

                arr[row][col] = 1;
                nqueen(arr, row+1); // go and place other queens 

                // unplace while coming back 
                arr[row][col] = 0;
            }
        }
    }


    public static boolean isSafetoPlace(int arr[][], int row, int col){
        
    }
}
