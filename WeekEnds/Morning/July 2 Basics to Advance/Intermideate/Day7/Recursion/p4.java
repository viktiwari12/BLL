public class p4 {
    public static void main(String[] args) {
        int x = MazePath(0, 0, 4, "");
        System.out.println(x);
    }
    public static int climbStairs(int n, String psf){
        // base case 
        if(n == 0) {
            System.out.println(psf);
            return 1; // here 1 stands for I have a path 
        }
        if(n < 0) return 0; // here 0-> no path possible with these moves 

        int j1 = climbStairs(n-1, psf + " - j1 - ");
        int j2 = climbStairs(n-2, psf +" - j2 - ");
        int j3 = climbStairs(n-3, psf + " - j3 - ");
        int totalPath = j1 + j2 + j3;
        return totalPath;

    }
     public static int MazePath(int r, int c,int n, String psf){
        if(r ==n-1 && c == n-1){
            System.out.println(psf);
            return 1;
        }
        if(r == n || c == n) return 0; // Out of matrix 

        int h = MazePath(r, c+1, n , " h " + psf);
        int v = MazePath(r+1, c, n , " v " + psf);
        int d = MazePath(r+1, c+1, n , " d " + psf);

        return h+ v + d;
     }
}
