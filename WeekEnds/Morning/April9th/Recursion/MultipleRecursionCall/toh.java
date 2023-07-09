public class toh {
    public static void main(String[] args) {
        fun(15, "T1", "T2", "T3");
    }   
    public static void fun(int n, String Src, String help, String dest){
        // base case 
        if(n == 0){
            return;
        }

        fun(n-1, Src, dest, help);
        System.out.println("Move  " +n + "th  disk from  "+ Src + "   to  " + dest );
        fun(n -1, help, dest, Src);
    }
    
}
