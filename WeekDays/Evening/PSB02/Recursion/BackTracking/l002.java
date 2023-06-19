public class l002 {
    static int direction[][] = {{-1,1},{0,1},{1,1}};// Modify direction array by urself
    public static void main(String[] args) {
        int ans = 0; 
        int arr[][] = new int[5][6];
        for (int r = 0; r<arr.length; r++){
            ans = Math.max(ans, goldMine(arr, r, r));
        }
    }
    private static int goldMine(int arr[][], int r, int c){
        // base case -> will figure out later on


        int ans = 0;
        for(int dir[] : direction){
            int nr = r + dir[0];
            int nc = r + dir[1];
            ans = arr[r][c]; // what exactly am I doing here? 
            if(/*Leaving checks for u */){
                ans += goldMine(arr, nr, nc);
            }
            ans -= arr[r][c];
        }
        return ans;
    }
}
