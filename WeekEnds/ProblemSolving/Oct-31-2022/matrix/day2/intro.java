

public class intro {
    public static void main(String[] args) {
        
    }
    public static void transpose(int arr[][]){
        int r = arr.length;
        int c = arr[0].length;

        for(int row = 0; row<r; row++){
            for(int col = row+1; col<c; col++){
                swap2d(arr, row, col);
            }
        }
    }
    public static void swap2d(int arr[][], int i, int j ){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    public static void swap(int arr[], int i, int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void rotate(int arr[][]){
        transpose(arr);


        for(int ele[]: arr){
            reverse(ele);
        }
    }
    public static void reverse(int arr[]){
        int i =0, j = arr.length-1;
        while(i<j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
}
