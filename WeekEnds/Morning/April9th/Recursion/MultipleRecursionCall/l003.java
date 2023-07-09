class l003{
    public static void main(String[] args) {
        System.out.println((fun(4, "")));
    }
    public static int fun(int n, String path){
        // base case 
        if(n == 0) {
            System.out.println(path);
            return 1; // this one indicates here for a path  
        }
        if(n < 0){
            System.out.println("Path Not Found " + path);
            return 0; // this 0 indicates that no path can be formed 
        }
        // Faith
        int f1 = fun(n-1, path+ " j1 "); //  -> n-1 -> 0: j1j2j1j2jj1j1+ j1
        int f2 = fun(n-2, path + " j2 ");

        // Task 
        int totalpath = f1 + f2;
        return totalpath;
    }
}