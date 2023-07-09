public class l001 {
    public static void main(String[] args) {
        printIncdec(1, 5);
        int f = fact(10);
        System.out.println("Factorial is ->  " + f);
    }

    // Expectation from this frunction is to print all numbers from st-> end
    public static void printInc(int st, int end){
        if(st > end){
            System.out.println("Hiting base case with st = " + st);
            return;
        }
        // work
        System.out.println("Calling this function for the " + st+"th  time");
        System.out.println(st);
        // faith 
        printInc((st +1), end); 
        System.out.println("returning function for the " + st+"th  value");
    }
    public static void printdec(int st, int end){
        // base case 
        if(st > end){
            System.out.println("Hiting base case with st = " + st);
            return;
        }
        System.out.println("Calling this function for the " + st+"th  time");
        // faith 
        printdec((st+1), end);
        System.out.println(st);
        System.out.println("returning function for the " + st+"th  value");

    }
    public static void printIncdec(int st, int end){
        if(st > end){
            //System.out.println("Hiting base case with st = " + st);
            return;
        }
        //System.out.println("Calling this function for the " + st+"th  time");
       
        System.out.println(st); // w1
         // faith 
        printIncdec((st+1), end);
        System.out.println(st); // w2
        //System.out.println("returning function for the " + st+"th  value");

    }
    // expectation from this function is to return n!
    public static int fact(int n){
        // faith -> I will get (n-1)!
        if(n == 1) return 1;
        System.out.println("Go calculate the " + (n-1 + "factorial first "));
        int ftj = fact(n-1);
        System.out.println((n-1 )+ "factorial is " + ftj);
        // work 
        int ans =  n * ftj;

        System.out.println(" Now forming the and for " + +(n )+ "factorial, which is " + ans);
        return ans;
    }


    // Home Work problems 
    // Fib no 
    // climb stairs 
    
    
}
