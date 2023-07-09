public class p1{
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Pattern 1");
        pt1(n);
        System.out.println("Pattern 2");
        pt2(n);
        System.out.println("Pattern 3");
        pt3(n);
        System.out.println("Pattern 4");
        pt4(n);
        System.out.println("Pattern 5");
        pt5(n);
        System.out.println("Pattern 6");
        pt6(n);
        System.out.println("Pattern 7");
        pt7(n);
        System.out.println("Pattern 9");
        pt9(n);
        System.out.println("Pattern 11");
        pt11(n);
       
    }
    public static void pt01(int n){
        int nst = 1; 
        for(int row = 0 ;row<n; row++){
            printStars(nst);
            nst++;
            System.out.println();
        }
    }
    public static void pt1(int n ){
        // for given n 
        // Print n lines and every line will contains feew stars 
        for(int row = 1; row <=n; row++){
            printStars(row);
            System.out.println();
        }
    }
    public static void pt02(int n){
        int nst = n;
        for(int row = n; row >0; row--){
            printStars(nst);
            System.out.println();
            nst--;
        }
    }
    public static void pt2(int n){
        for(int row = n; row >0; row--){
            printStars(row);
            System.out.println();
        }
    }
    public static void pt3(int n){
        int nst = 1; // no of start 
        int nsp = n-1; // no of space 

        for(int row = 1; row<=n; row++){
            printSpace(nsp--);
            printStars(nst++);
            System.out.println();
        }
    }
    public static void pt4(int n){
        int nst = n; // no of start 
        int nsp = 0; // no of space 

        for(int row = 1; row<=n; row++){
            printSpace(nsp++);
            printStars(nst--);
            System.out.println();
        }
    }
    public static void pt5(int n){
        int nst = 1;
        int row = (2*n) -1;
        for(int r = 1; r <= row; r++){
            printStars(nst);
            System.out.println();
            if(r<n)nst++;
            else nst--;
        }
    }
    public static void pt6(int n){
        int nst = n;
        int row = (2*n) -1;
        for(int r = 1; r <= row; r++){
            printStars(nst);
            System.out.println();
            if(r<n)nst--;
            else nst++;
        }
    }
    public static void pt7(int n){
        int nst = 1;
        int nsp = n-1;
        int row = (2*n) -1;
        for(int r = 1; r <= row; r++){
            printSpace(nsp);
            printStars(nst);
            System.out.println();
            if(r<n){
                nst++;
                nsp--;
            }else {
                nst--;
                nsp++;
            }
        }
    }
    public static void pt9(int n){
        int nst = 1; 
        int nsp = n-1;
        for(int row = 1; row<=n; row ++){
            printSpace(nsp);
            printStars(nst);
            System.out.println();
            nst += 2;
            nsp--;
        }
    }
    public static void pt11(int n){
        int nst = 1; 
        int nsp = n-1;
        int row =( 2*n) -1;
        for(int r = 1; r <= row; r++){
            printSpace(nsp);
            printStars(nst);
            System.out.println();
            
            if(r<n){
                nst+=2;
                nsp--;
            }else {
                nst-=2;
                nsp++;
            }
        }
    }

    public static void printStars(int n){
        //  given a value n- this will print space seperated n stars 
        for(int i = 0; i< n; i++){
            System.out.print("*"+ "  ");
        }
    }
     public static void printSpace(int n){
        // given a value n, this will print space seperated n spaces 
        for(int i = 0; i< n; i++){
            System.out.print(" "+ "  ");
        }
    }
}