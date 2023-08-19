import java.util.*;

public class p2 {
    public static void main(String[] args) {
        fun(4);
    }
    public static void fun(int n){
        if(n== 0){
            System.out.println("Hitting Base Case");
            return ;
        }
        System.out.println("C1 " + n);
        fun(n-1);
        System.out.println("C2 " + n);
        fun(n-1);
        System.out.println("C3 " + n);
    
    }
}
