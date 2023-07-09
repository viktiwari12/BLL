

public class l001 {
    class p{
        int d = 1; 
        int d1 = 10;

        public void fun(){
            System.out.println("P fun");
        }
        public void fun1(){
            System.out.println("P fun1");
        }
    }
    class c extends p{
        int d = 2;
        int d2 = 20;
        public void fun(){
            System.out.println("c fun");
        }
        public void fun2(){
            System.out.println("c fun2");
        }

    }

    public static void main(String[] args) {
       p obj1 = new p();

       System.out.println( obj1.d);
       System.out.println(obj1.d1);
       obj1.fun();
       obj1.fun1();

       c o1 = new c();

       System.out.println(o1.d);
       System.out.println(o1.d1);
       System.out.println(o1.d2);
       o1.fun();
       o1.fun2();
       o1.fun1();


       
       p obj2 = new c();
        System.out.println(obj2.d);
        System.out.println(obj2.d1);
        obj2.fun();
        obj2.fun1();




    }

}
