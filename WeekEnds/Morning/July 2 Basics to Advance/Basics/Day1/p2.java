package Basics.Day1;


public class p2 {
    public static void main(String[] args) {
        // Given a number 
        // figure out if it's a prime no or not ? 
        // print all the prime nos btw 3 -> n;

        int  n = 18; 
        boolean falg = true;
        for(int i = 2; i <n; i++){
            if(n%i == 0){
                System.out.println("Not Prime ");
                falg = false;
                break;
            }
        }
        if(falg){
            System.out.println("Prime "); // this line should only print when we have not not printted the above 
        }
        // Print all primes 
        for(int curr =  3; curr <= n; curr++){
            falg = true;
            for(int i = 2; i <curr; i++){
                if(curr%i == 0){
                    //System.out.println(n);
                    falg = false;
                    break;
                }
            }
            if(falg){
                System.out.println(curr); // this line should only print when we have not not printted the above 
            }
        }
    }
}
