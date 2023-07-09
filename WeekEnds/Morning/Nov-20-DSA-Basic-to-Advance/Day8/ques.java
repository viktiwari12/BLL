
public class ques {
   public static void main(String[] args) {
    //printDec(5);
   // printinc(5);
    int ans = fact(5);
    System.out.println(ans);
   } 

   // expectation from this fun is to print n -> 1 in decreasing order 
   public static void printDec(int n){
        // base case 
        if(n == 0) return;


        // task  print n 
        System.out.println(n);

        // have faith that recursion will print (n-1 ) -> 1 in decreasing order 

        printDec(n-1);

   }
   // print from 1 -> n increasing order
   public static void printinc(int n){
        // base case 
        if(n == 0) return ;


        // Here first we will apply faith 
        printinc(n-1); // print from 1 -> n-1 in increasing order
        // and then do the task 

        System.out.println(n);;
   }

   // return the sum all all natural numbers upto n
   public static int sum(int n){
        // base case 
        if(n == 1) return 1;


        int faith = sum(n-1);
        System.out.println("Sum for n = " + n + " is " + faith) ;
        int task = faith + n;

        return task;
   }

   public static int fact(int n){

    if(n == 1) return 1;


    int faith = fact(n-1);
    System.out.println(" factorial for n = " + (n-1) + " is " + faith) ;
    int task = faith * n;

    return task;
   }


   
}
