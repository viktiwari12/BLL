

public class l001{
    static int direction[][] = {{-2, 1}, {-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2},{-2, -1} };
    public static void main(String[] args) {
        int arr[][] = new int [5][5];

        display2D(arr);
        kt(arr, 1, 2, 0);
    }
    public static void kt(int arr[][], int moves, int r, int c){
        // base case 
        if(moves == arr.length* arr.length){
            arr[r][c] = moves; // this is the last moves 
            display(arr);
            
            return;
        }

        // rec call 1
        // rec call 2 
        // rec call 3 
        // rec 
        for(int dir[] : direction){ // for evry moves 
            int nr = r+ dir[0];
            int nc = c+ dir[1];
            // first check if the move that we are going to take is a valid move or not? 
            if(nr>=0 && nc >= 0 &&  nr < arr.length && nc < arr.length && arr[nr][nc] == 0 ){
                // first mark the move 
                arr[r][c] = moves;
                kt(arr, moves+1, nr, nc);
                arr[r][c] = 0; // backtrack 
            }
        }
        //  
    }
    public static void display(int arr[][]){
        for(int x[]: arr) display1D(x);
    }
    public static void display1D(int arr[]){
        for(int ele : arr) System.out.print(ele+ "  ");

        System.out.println();
    }

    public static void display2D(int arr[][]){
        for( int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr.length; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
}