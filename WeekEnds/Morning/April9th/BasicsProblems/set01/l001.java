import java.rmi.dgc.VMID;

public class l001{
    public static void main(String[] args) {
        // Some basics Problem Solving 
        // Will Print Stars patterns \


        /*
                *             1 
                * *           2
                * * *         3
                * * * *       4
                * * * * *     5

                n = 5

                for Given N
                    we have N no rows/lines
                        in every row
                            we have to print some stars  
         */

            // The First loop is for the no of rows/lines 
            int n = 5;
            // pt0(n);
            // pt1(n);
            // pt2(n);
            // pt4(n);
            // pt5(n);
            // pt6(n);
            // pt7(n);
            pt8(n);
 
    


    }
    public static void printStars(int n){
        for(int j= 1; j<= n; j++){
            System.out.print("*" + "  ");
        }
        
    }
    public static void printSpaces(int n){
        for(int j= 1; j<= n; j++){
            System.out.print(" " + "  ");
        }
    }
    public static void pt0(int n){
        int nst = 1;
        for(int row = 1; row <=n; row++){
            printStars(nst);
            System.out.println();
            nst++;
        }
    }
    public static void pt1(int n){
        /*                 sp  st
                    *       4   1
                  * *       3   2
                * * *       2   3 
              * * * *       1   4
            * * * * *       0   5
        */

        /* n= 3
                  * 
                * * 
              * * * 
         */

        /*
            for(every row){
                -> Print some Spaces 
                -> Print Some Stars 
            }
         */
         int nst = 1;
         int nsp = n-1;
         for(int row = 1; row <= n; row++){
            printSpaces(nsp);
            printStars(nst);
            System.out.println();
            nsp--;
            nst++;
         }
    }
    public static void pt2(int n){
        /*                       sp   st
                    *            4     1   
                  * * *          3     3
                * * * * *        2     5 
              * * * * * * *      1     7
            * * * * * * * * *    0     9           
         */
        /*
            for(every row){
                -> Print some Spaces 
                -> Print Some Stars 
            }
        */
        int nst = 1;
        int nsp = n-1;
        for(int row = 1; row <= n; row++){
           printSpaces(nsp);
           printStars(nst);
           System.out.println();
           nsp--;
           nst+=2;
        
        }
    }
    public static void pt4(int n){ //N == 5 
        /*                            line no   sp  st
                    *                   1        4  1
                  * * *                 2        3  3
                * * * * *               3        2  5   
              * * * * * * *             4        1  7
            * * * * * * * * *           5        0  9
              * * * * * * *             6        1  7
                * * * * *               7        2  5
                  * * *                 8        3  3
                    *                   9        4  1
         */ 

         // no of lines -> (2*n -1)
         int nst =1;
         int nsp= n-1;
         for(int row = 1; row <= 2*n-1; row++){
            printSpaces(nsp);
            printStars(nst);
            System.out.println();
            // update the nst & nsp as per the line no 
            if(row < n){
                nst +=2;
                nsp -=1;
            }else{
                nst -=2;
                nsp +=1;
            }
         }
    }
    public static void pt5(int n){
        int nst =1;
        int nsp= n-1;
        for(int row = 1; row <= 2*n-1; row++){
           printSpaces(nsp);
           printStars(nst);
           System.out.println();
           // update the nst & n
           if(row < n){
               nst +=1;
               nsp -=1;
           }else{
               nst -=1;
               nsp +=1;
            }
        }
    }
    public static void pt6(int n){
        int nst = (2*n -1);
        int nsp= 0;
        for(int row = 1; row <= 2*n-1; row++){
           printSpaces(nsp);
           printStars(nst);
           System.out.println();
           // update the nst & n
           if(row < n){
               nst -=2;
               nsp +=1;
           }else{
               nst +=2;
               nsp -=1;
            }
        }
    }
    public static void pt7(int n){
        int nst = 1;
        int nsp= ( 2*n -2);
        for(int row = 1; row <= n; row++){
            printStars(nst);
            printSpaces(nsp);
            printStars(nst);
           System.out.println();
           // update the nst & n
           nst +=1;
           nsp -=2;  
        }
    }
    public static void pt8(int n){ // n == 5
        int nst = n;
        int nsp= 0;
        for(int row = 1; row <= 2*n; row++){
            printStars(nst);
            printSpaces(nsp);
            printStars(nst);
           System.out.println();
           // update the nst & n
           if(row < n){
               nst -=1;
               nsp +=2;
           }else if(row == n){
            continue;
           }else{
               nst +=1;
               nsp -=2;
            }     
        }
    }
    public static void pt9(int n){ // n == 5
        int nst = n;
        int nsp= 0;
        for(int row = 1; row <= 2*n; row++){
            if(){
                for(int j= 1; j<= n; j++){
                    System.out.print(" " + "  ");
                }           
                for(int j= 1; j<= n; j++){
                    System.out.print(" " + "  ");
                }           
            }else{
                for(int j= 1; j<= n; j++){
                    System.out.print(" " + "  ");
                }           
                for(int j= 1; j<= n; j++){
                    System.out.print(" " + "  ");
                }
                for(int j= 1; j<= n; j++){
                    System.out.print(" " + "  ");
                }                                       
            }






            for(int j= 1; j<= n; j++){
                System.out.print(" " + "  ");
            }           
            for(int j= 1; j<= n; j++){
                System.out.print(" " + "  ");
            }
            for(int j= 1; j<= n; j++){
                System.out.print(" " + "  ");
            }                       
           // update the nst & n
           if(row < n){
               nst -=1;
               nsp +=2;
           }else if(row > n){
           
               nst +=1;
               nsp -=2;
            }     
        }
    }
   // javac fileName.java &&  java fileName >>out.txt
}