class l002 {
    public static void main(String[] args) {
        fun2(10);
    }

    public static void fun(int n) {
        // base case
        if (n == 0)
            return;

        System.out.println("F" + n + "   " + n);
        fun(n - 1);
        System.out.println("F" + n + "   " + (n - 1));
        fun(n - 1);
        System.out.println("F" + n + "   " + (n - 2));
    }

    public static void fun2(int n) {
        // base case
        if (n <= 0)
            return;

        System.out.println("F" + n + "   " + n);
        fun2(n - 1);
        System.out.println("F" + n + "   " + (n - 1));
        fun2(n - 1);
        System.out.println("F" + n + "   " + (n - 2));
        fun2(n - 1);
        System.out.println("F" + n + "   " + (n - 3));
    }
}