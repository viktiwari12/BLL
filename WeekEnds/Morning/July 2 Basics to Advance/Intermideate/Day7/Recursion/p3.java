public class p3 {
    public static void main(String[] args) {
        int ans = fib(10);
        System.out.println(ans);
    }
    // Gven n find the nth Fibannaci number 
    public static int fib(int n){
        // base case -> will figure out later on 
        if(n == 1) return 1;
        if(n== 0) return 0;

        int f1 = fib(n-1);
        int f2 = fib(n-2);

        int ans = f1 + f2;
        return ans;
    }
}
