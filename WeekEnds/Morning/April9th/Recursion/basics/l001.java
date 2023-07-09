public static class l001{
    public static void main(String[] args) {
        //greet 5 times
        greet01(); // While calling/invocking this method, we only know aboout this method
    }
    public static void greet01(){
        System.out.println("Hello Vikash, How are you!"); // I am greeting once, and then relying on the other method that it will do the remaning task.
        greet02(); // putting faith that, this method will do the remaning task
    }
    public static void greet02(){
        System.out.println("Hello Vikash, How are you!");
        greet03();
    }
    public static void greet03(){
        System.out.println("Hello Vikash, How are you!");
        greet04();
    }
    public static void greet04(){
        System.out.println("Hello Vikash, How are you!");
        greet05();
    }
    public static void greet05(){
        System.out.println("Hello Vikash, How are you!");
        
    }
}