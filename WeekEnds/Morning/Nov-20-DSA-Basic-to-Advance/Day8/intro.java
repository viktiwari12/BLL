// recursion Foundation 

public class intro {
    public static void main(String[] args) {
        // task 
        // Print "Hey Vikash ! How are you doing? " 5 times 
        // first & the most simple way to do

        System.out.println( "Hey Vikash ! How are you doing? ");
        System.out.println( "Hey Vikash ! How are you doing? ");
        System.out.println( "Hey Vikash ! How are you doing? ");
        System.out.println( "Hey Vikash ! How are you doing? ");
        System.out.println( "Hey Vikash ! How are you doing? ");


        // teh second way :- 
        // using for loop 
        for(int i = 1; i<=5 ; i++){
            System.out.println( "Hey Vikash ! How are you doing? ");
        }


        // do the same task, but using a function
        // call the function 5 times  


        // call all the 5 function individually 

        greet();
       
        int n = 5;

        // Now, I modified the condition, you can only greet once from any function 

      


        // Note the three Golden Terms 

        // Expectations || Faith || Task 
       
    }
    
    // make a function and greet 5 times from it 
    public static void greet(int n){
        System.out.println( "Hey Vikash ! How are you doing? ");  // task 
        if(n > 0)
            greet2(n-1); // fatih that it will do the remaning task 
    }
    public static void greet2(int n){
        System.out.println( "Hey Vikash ! How are you doing? "); // task 
        if(n > 0)
            greet3(n-1); // faith 
    }
    public static void greet3(int n){
        System.out.println( "Hey Vikash ! How are you doing? ");
        if(n > 0)
            greet4(n-1);
    }
    public static void greet4(int n){
        System.out.println( "Hey Vikash ! How are you doing? ");
        if(n > 0)
            greet5(n-1);
    }
    public static void greet5(int n){
        System.out.println( "Hey Vikash ! How are you doing? ");
        if(n > 0)
            greet(n);
       
    }
    
}
