import Day1.fun;

public class rec {
    public static void main(String[] args) {

        // Expectation -> Faith   -> Work 
       greet();  // expectation is to greet everyone 
       
       fun("Vikash"); // expectation is to greet starting from vikash and till subnham 
    }
    
    public static void greet(){
        System.out.println("Hey Vikash, What's up? "); // I greeted Vikash,
        greet1(); // this will greet the rest eeryone 
    }
    public static void greet1(){
        System.out.println("Hey Prajeet, What's up? ");
        greet2();
    }
    public static void greet2(){
        System.out.println("Hey Santosh, What's up? ");
        greet3();
    }
    public static void greet3(){
        System.out.println("Hey Deepa, What's up? ");
        greet4();
    }
    public static void greet4(){
        System.out.println("Hey Subham, What's up? ");
        // terminating condition 

        
    }

    //=================================================================================//
    public static void fun(String name , int count){
        if(count == 5) return;

        System.out.println("Hey  "+ name+ ",  What's up? ");
       fun(name, (count+1));
    }


    
    
}
