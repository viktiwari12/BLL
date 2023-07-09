
public class patterns {
    public static void main(String[] args) {
        int n= 5;

        // pt1(n);
        // pt2(n);
        // pt3(n);
        pt4(n);
    }
    // using some functions 
    public static void printStars(int n){
        for(int i = 1; i<=n; i++){
            System.out.print("*"+ "  ");
        }
    }
    public static void printSpace(int n){
        for(int i = 1; i<=n; i++){
            System.out.print(" "+ "  ");
        }
    }
    public static void pt1(int n){
        /* 
        *
        * *
        * * * 
        * * * * 
        * * * * * 
       
        *
        * *
        * * * 
        * * * * 
        * * * * * 
        * * * * * *
        for(every Line){
            print some stars 
            print some space -> by default it's managed 
        }
        */
        int nst = 1; // nst -> no of stars to be printed in each row  || irrespective of the value of n my first row will alsways have only 1 stars
        System.out.println("Pattern 1");
        for(int row = 1; row<=n; row++){
            printStars(nst);
            System.out.println();
            nst++;
        }
    }
    public static void pt2(int n){
        /*
         * * * * *  0 5
           * * * *  1 4
             * * *  2 3
               * *  3 2
                 *  4 1
                 
        

            for( every Line){
                -> print some space 
                -> then Imideately print some stars 
            }
         */

         // Clean and Readable code 
         System.out.println();
         System.out.println("pattern 2");
        int nst = n; // no of stars 
        int nsp = 0; // no of space 

        for(int row = 1; row <= n; row++){
            printSpace(nsp);
            printStars(nst);
            System.out.println();
            nsp++;
            nst--;
        }

        // dirty code 
        /* 
        for(int i = 1; i<=n; i++){
            // first loop to print space 
            for(int j = 1; j<x; j++){

            }
            // second loop to print stars 
            for(int k = 1; j<=y; k++){

            }
            System.out.println();
        }
        */


    }
    public static void pt3(int n){
            /*
                        *                 4 1 
                    *   *   *             3 3
                *   *   *   *  *          2 5
            *   *   *   *   *  *  *       1 7
         *  *   *   *   *   *  *  *  *    0 9
         
         for( every Line){
             -> Orint some space 
            -> then Imideately print some stars 
        }
             */

        System.out.println();
        System.out.println("pattern 3");
        int nst = 1; // no of stars 
        int nsp = n-1; // no of space 

        for(int row = 1; row <= n; row++){
            printSpace(nsp);
            printStars(nst);
            System.out.println();
            nsp--;
            nst+= 2;
        }
    }
    public static void pt4(int n){ //n ==5
            /*
            *                    4 1
         *  *  *                 3 3
      *  *  *  *  *              2 5
   *  *  *  *  *  *  *           1 7
*  *  *  *  *  *  *  *  *        0 9
   *  *  *  *  *  *  *           1 7
      *  *  *  *  *              2 5 
         *  *  *                 3 3
            *                    4 1
             */


             System.out.println();
             System.out.println("pattern 4");
             int nst = 1; // no of stars 
             int nsp = n-1; // no of space 
             for(int row = 1; row <= (n*2 -1); row++){

                System.out.println("In this line print " + nsp + "no of spaces  and " + nst + " no of stars");
                 printSpace(nsp);
                 printStars(nst);
                 System.out.println();

                 // figure out the no of stars and spaces for the next line 
                 if(row < n){
                    nsp--;
                    nst+= 2;
                 }else{
                    nsp++;
                    nst-=2;
                 }
             }
    }
    public static void pt5(int n){
    
    }
    public static void pt6(int n){
    
    }
    public static void pt7(int n){
    
    }
}
