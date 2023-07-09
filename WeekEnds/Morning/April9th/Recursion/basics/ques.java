

public class ques {
    public static void main(String[] args) {
        System.out.println(countPrimes(8000));
    }
    public static int factorail(int n){
        // Given n-> Find the n!
        if(n == 1) return 1; 

        int sa = factorail(n-1);
        int ans  = sa * n;
        return ans;
    }
    public static int countPrimes(int n){
        // Given N, Count the total no of primes no btw 1-> n
        if(n == 1){
            System.out.println(n  + "  ->  Prime ");
            
            return 1;
        }

        /* for n = 50
        1-> 49 = 10  from 1- 50 -> 
         * Expectation -> no of primes btw 1-> n 
         * Faith -> will get the total no of Primes btw (1 -> n-1)   10
         */

         int count = countPrimes(n-1);

         if(isPrime(n)){ // if my nth no is a prime no then 
            System.out.println(n  + "  ->  Prime ");
            int ans = count+1;
            return ans;
         }else{ // if my nth no is not a prime no 
            System.out.println(n  + "  ->  Not Prime ");
            int ans = count + 0;
            return ans;
         }
    }
    public static boolean isPrime(int n){
        for(int  i = 2; i<n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}




