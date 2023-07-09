
public class intro2 {
    public static void main(String[] args) {
        greet(5);
    }

    public static void greet(int n) {  // ex[ectation ]
        
        if (n == 0) {
            System.out.println("Hitting base case");
            return;
          }  // base case 
            System.out.println("Hey what's up? " + n); // task 
            greet(n - 1); // recursive calll || faith 

            System.out.println("Execution after recursive call for n = " + n);
        
    }
}
