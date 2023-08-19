package Basics;
public class l001{
    public static void main(String[] args) {
        System.out.println("Print Increasing ");
        printInc(5);
        System.out.println("Print Decreasing ");
        printDec(5);
        System.out.println("Print Decreasing - Increasing ");
        printDecInc(5);

    }

    /* 
     * Expectation 
     * Faith 
     * Task
     */
    public static void printInc(int n){

        // base case -> the point where further deligation should stop 
        if(n == 0)  return;
        // n -> 5
        /* 1 2 3 4 5 */
        // n -> 4
        /* 1 2 3 4  */ // I will put a faith that -> someone will do this for me 

        // faith 
        
        printInc(n-1); // my faith is for n = 4 recursion will print the ans 
        // to meet my expectations, my faith is not enough -> I will have to do some task as well 
        System.out.println(n);
        

    }
    public static void printDec(int n){
        // base case 
        if( n == 0) return ; // no further deligations 
        // n -> 5
        /* 5 4 3 2 1  */
        // n = 4 
        /* 4 3 2 1  */

        System.out.println(n); // first print yourself 
        printDec(n-1); // then have faith that recirsion will print the rest
    }
    public static void printDecInc(int n){
        // base case 
        if(n == 0) return;
        /* N-> 5 */
        /* 5 4 3 2 1 1 2 3 4 5  */
        // n -> 4 

        /* 4 3 2 1 1 2 3 4 */

        // first frint yourself
        System.out.println(n);
        // apply faith on n-1
        printDecInc(n-1); 
        // print urself once again.
        System.out.println(n);

         
    }   

    

}