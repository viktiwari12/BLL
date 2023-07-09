
import java.util.*;
import java.io.*;
import java.lang.*;
public class function {
    public static void main(String[] args) {
        System.out.println("Enter in the main Function");
        System.out.println("calling function 1-> from main function");
        fun1();
        System.out.println("Exit from main function");
    }
    public static void fun1(){
        System.out.println("Excuting the codes in fun1");

        fun02();

        System.out.println("Exit from fun  fun1");
    }
    public static void fun02(){
        System.out.println("Excuting the codes in fun2");

        fun3();

        System.out.println("Exit from fun fun2");
    }
    public static void fun3(){
        System.out.println("Exit from fun 1 fun1");
    }
}
