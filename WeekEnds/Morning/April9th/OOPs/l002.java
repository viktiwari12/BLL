

public class l002 {
    public static class consumer{
        String name ;
        String address;
        long  mobile;
        boolean male;
        String email;
        consumer(){}; // this is default constructor 
        consumer(String name, long mobile , boolean male, String email){ // This is called as parameerse constructor 
            this.name = name;
            this.mobile = mobile;
            this.male = male;
            this.email = email;

        }
        consumer(String name, String address, long mobile , boolean male, String email){
            this.name = name;
            this.address = address;
            this.mobile = mobile;
            this.male = male;
            this.email = email;
        }
    }
    public static void main(String[] args) {
        // Constructors 

       consumer c1 = new consumer();
       consumer c2 = new consumer();
       consumer c3 = new consumer();
       consumer c4 = new consumer();
       consumer c5 = new consumer();
       consumer c6 = new consumer();

       consumer c7 = new consumer();
       consumer c8 = new consumer();
       
        // Is it Convinent to assing every propery manully (Line by Line) each property of each object? 

        consumer c9 = new consumer("Viaksh", "afbnkbnk", 97917, true, "viktiwarixyz@pqrst.com");
        display(c9);
       

        consumer c10 = new consumer(a1, 0, false, null);

        
    }
    public static void display(consumer c1){
        System.out.println(c1.name);
        System.out.println(c1.address);
        System.out.println(c1.mobile);
        System.out.println(c1.male);
        System.out.println(c1.email);
    }
}
