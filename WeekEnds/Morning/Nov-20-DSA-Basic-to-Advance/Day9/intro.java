import java.rmi.server.SocketSecurityException;

public class intro {
    public static void main(String[] args) {
        // Dual Recursive calls.

        fun(3);
    }
    public static void fun(int n){
        // base case 
        if(n == 0){
            System.out.println("Hitting base case.");
            return;
        }

        System.out.println("Pre -> " + n);
        fun(n-1);
        System.out.println("In -> " + n);
        fun(n-1);
        System.out.println("Post -> " + n);
    }
}
