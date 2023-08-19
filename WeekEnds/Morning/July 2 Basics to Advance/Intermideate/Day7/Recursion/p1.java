public class p1 {
    public static void main(String[] args) {
        //Let's Start with Recursion!
        
        // Recursion -> A function calling itslef

        // Say Hello To Vikash 5 times 
        System.out.println("Hii VIkash, How are u!");
        System.out.println("Hii VIkash, How are u!");
        System.out.println("Hii VIkash, How are u!");
        System.out.println("Hii VIkash, How are u!");
        System.out.println("Hii VIkash, How are u!"); 
        
        // Other way  of doing this 
        for(int i = 1; i<= 5; i++){
            System.out.println("Hii VIkash, How are u!");
        }
        // From main-> You are allowed to call any one function-> 
        greet01(5); // Here one function is calling another function || Nesting of Function
    }
    public static void greet01(int count){
        System.out.println("Hii VIkash, How are u!");    
        if(count >0)
            greet02(count--);    
    }
    public static void greet02(int count){
        System.out.println("Hii VIkash, How are u!");       
        greet03(count--);
    }
    public static void greet03(int count){
        System.out.println("Hii VIkash, How are u!");
        if(count >0)        
            greet04(count--);
    }
    public static void greet04(int count){
        System.out.println("Hii VIkash, How are u!");
        if(count >0)        
            greet05(count--);
    }
    public static void greet05(int count){
        System.out.println("Hii VIkash, How are u!");  
        if(count >0){
            greet01(count--);
        }      
    }
}
