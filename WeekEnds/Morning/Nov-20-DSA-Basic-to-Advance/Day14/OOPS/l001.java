import java.util.Arrays;

public class l001 {
    class student{
        String name ;
        static String College = "IIT DELHI";
        String Department;
        int roll;
        int age;
    }
    public static void main(String[] args) {
        // Static is not the Data member of any object created by that class 
        // It's the data member of the class itself. 

         String temp = student.College; // This proves the fact that class also have memory
        // System.out.println(temp);
        student s1 = new student(); // object creation 

        String temp2 = s1.College; // This is not the rit practice. 

        

    }
}
