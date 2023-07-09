public class l004 {
    public static void main(String[] args) {
        // Given n which represent n stairs
        // fron any kth stairs you can take upto k jump 

        // find the total no of path
        int ans = fun(10, "");
        System.out.println(ans);
        
        
    }
    public static int fun(int n, String path){ // n= 5
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
        int totalPath  = 0;
        for(int jump = 1; jump <= n; jump++){
            totalPath += fun((n- jump) , (path + "J" + jump));
        }
        

        // Task
        return totalPath;
    }
}
