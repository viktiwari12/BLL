import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class basics{
    public static void main(String[] args) {
        int n = 500;

        // Expectation 
        // Faith 
        // Task 
        PrintInc(n);
    }
    // Expectation -> Print 1-> n in ince order
    public static void PrintInc(int n){
        // base case 
        if(n ==  0) return ;


        // faith -> recursion prints from 1 -> (n-1) in Inc order 
        PrintInc(n-1);
        System.out.println(n); // Task Print the nth no 
    }
    public static void PrintDec(int n){
        /*
         * 5
         * 4
         * 3
         * 2
         * 1
         */
        if(n ==  0) return ;


        // faith -> recursion prints from 1 -> (n-1) in Inc order 
        
        System.out.println(n); // Task Print the nth no 
        PrintDec(n-1);
    }
    public static Void PrintDecInc(int n){
        /*
         * 5
         * 4
         * 3
         * 3
         * 2
         * 1
         * 1
         * 2
         * 3
         * 4
         * 5
         */

         /*
          4
          3
          2
          1
          1
          2
          3
          4
        
          */
            // Base  Case 
            if(n == 0) return;
          // First Print n
          System.out.println(n);
          // ask recursion to Print for the Lower Value 
          PrintDecInc(n-1);
          // Again Print n 
          System.out.println(n);
    }
    public static int sum(int n){
         //1+ 2 + 3 + 4 + 5
         // sum of n ==4
         // 1 + 2 + 3 + 4
        if(n == 1) return 1;  
        int ans = n + sun(n-1);
        return ans;
    }   
    public static int factorial(int n){
         // n! = n * n-1 * n-2 
        // 5! = 5 * 4 * 3 * 2 * 1;
        // 4! = 4 * 3 * 2 * 1
        // 5! = 4! * 5;
        // n! = (n-1)! * n;

        // can I put base case case at 0?
        if( n ==0 )return 1;
        int ans = factorial(n-1) * n;
    }

}