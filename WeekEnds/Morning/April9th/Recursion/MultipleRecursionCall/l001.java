class l001{
    public static void main(String[] args) {
        fun1();
    }
    public static void fun1(){
        System.out.println("Fun  1 Line 1");
        fun2();
        System.out.println("Fun 1  Line 2");
        fun2();
        System.out.println("Fun 1  Line 3");
    }
    public static void fun2(){
        System.out.println("Fun 2  Line 1");
        fun3();
        System.out.println("Fun 2  Line 2");
        fun3();
        System.out.println("Fun  2 Line 3");
    }
    public static void fun3(){
        System.out.println("Fun 3  Line 1");
        
        System.out.println("Fun 3  Line 2");
       
        System.out.println("Fun 3  Line 3");
    }
    

}