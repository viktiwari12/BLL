import java.rmi.StubNotFoundException;
import java.util.*;
public class p2 {
    public static class std{ // we have created a data type of student 
        String name;
        String FName;
        int roll;
        long mo;
        static String college; // this is common to all the students 
        std(){};
        // constructor 
        std(String name, String FName, int roll,  String college){
            this.name = name;
            this.FName = FName;
            this.roll =roll;
            
            this.college = college;
        }
        public static void display(int a , int b) {
            System.out.println(a +b);

        }

        
        
    }
    public static void main(String[] args) {
        // std.college = "IIT DELHI";
        // System.out.println(std.college);
        // std s1 = new std(null, null, 0, null);
        // System.out.println(std.college);
        // s1
        std.display(10, 015);
    }
}




