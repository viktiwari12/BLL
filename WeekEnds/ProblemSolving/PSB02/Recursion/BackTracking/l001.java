public class l001{
    public static int direction[][ ] = {{-2, 1},{-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1} };
    public static void main(String[] args) {
        int arr[][] = new int [5][5];
    }
    public static boolean fun(int arr[][], int r, int c, int count ){
        // base case 
        if(count == arr.length * arr.length){
            // what should I do here? 
            //
            arr[r][c] = count;
            return true;
        }
        // if I am reaching at this point // mark it as my current move 
        arr[r][c] = count; 
        boolean ans = false;
        // here we either write 8 different callss with 8 different checks or simpally a direction 
        for(int dir[]: direction){
            int nr = r+ dir[0];
            int nc = c + dir[1];
            if(nr >=0 && nc >=0 && nr <arr.length && nc <arr.length && arr[nr][nc] != 0){
                ans = ans || fun(arr, nr, nc, (count+1));
            }
        }
        arr[r][c] = 0;
        return ans;
    }
}