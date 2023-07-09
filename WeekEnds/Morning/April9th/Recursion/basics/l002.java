

public class l002 {
    public static void main(String[] args) {
        // print the sum of n numbers 
        sum05(5);
    }
    // public static int sum(int n){


    //     int smallerAns = sum(n-1);
    //     // if I have the sum of n-1, can I form the sum of n? 
    // }
    public static int sum05(int n){
        
        System.out.println("Sum of  "+ n + "  Numbers");
        System.out.println("First find sum of  " + (n-1) + "numbers");
        int sa = sum04(n-1);
        System.out.println("Sum of n-1 numbers is now  " + (sa ) );
        System.out.println("Sum of n numbers is now  " + (sa + n) );
        return sa+n;

    }
    public static int sum04(int n){
       
        System.out.println("Sum of  "+ n + "  Numbers");
        System.out.println("First find sum of  " + (n-1) + "numbers");
        int sa = sum03(n-1);
        System.out.println("Sum of" + (n-1)+  " numbers is now  " + (sa ) );
        System.out.println("Sum of" + (n)+  " numbers is now  " + (sa + n ) );
        System.out.println();
        return sa+n;
    }
    public static int sum03(int n){
        System.out.println("Sum of  "+ n + "  Numbers");
        System.out.println("First find sum of  " + (n-1) + "numbers");
        int sa = sum02(n-1);
        System.out.println("Sum of" + (n-1)+  " numbers is now  " + (sa ) );
        System.out.println("Sum of" + (n)+  " numbers is now  " + (sa + n ) );
        System.out.println();
        return sa+n;

    }
    public static int sum02(int n){
        System.out.println("Sum of  "+ n + "  Numbers");
        System.out.println("First find sum of  " + (n-1) + "numbers");
        int sa = sum01(n-1);
        System.out.println("Sum of" + (n-1)+  " numbers is now  " + (sa ) );
        System.out.println("Sum of" + (n)+  " numbers is now  " + (sa + n ) );
        System.out.println();
        return sa+n;
    }
    public static int sum01(int n){
        System.out.println("Sum of  "+ n + "  Numbers");
        System.out.println("First find sum of  " + (n-1) + "numbers");
        int sa = sum00(n-1);
        System.out.println("Sum of" + (n-1)+  " numbers is now  " + (sa ) );
        System.out.println("Sum of" + (n)+  " numbers is now  " + (sa + n ) );
        System.out.println();
        return sa+n;

    }
    public static int sum00(int n){
        System.out.println("Sum of  "+ n + "  Numbers");
        System.out.println("First find sum of  " + (n-1) + "numbers");
        System.out.println();
        return 0;
        
    }

}
