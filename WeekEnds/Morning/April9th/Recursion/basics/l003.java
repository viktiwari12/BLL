

public class l003 {
    public static void main(String[] args) {
        sum(5);
    }
    public static int sum(int n){
        if(n==0)return 0;

        System.out.println("Sum of  "+ n + "  Numbers");
        System.out.println("First find sum of  " + (n-1) + "numbers");
        int sa = sum(n-1);
        System.out.println("Sum of n-1 numbers is now  " + (sa ) );
        System.out.println("Sum of n numbers is now  " + (sa + n) );
        System.out.println();
        int ans = sa+ n;
        return ans;
    }
}
