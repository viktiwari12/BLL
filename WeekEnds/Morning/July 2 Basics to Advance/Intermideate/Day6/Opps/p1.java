
import java.util.*;

public class p1 {
    public static class student { // we have created a data type of student
        String name;
        String FName;
        int roll;
        long mo;
        static String college; // this is common to all the students

        student() {
        };

        // constructor
        student(String name, String FName, int roll, String college) {
            this.name = name;
            this.FName = FName;
            this.roll = roll;

            this.college = college;
        }

        student(String name, String FName, String college) {
            this.name = name;
            this.FName = FName;

            this.college = college;
        }

        student(String name, String FName, int roll, long mo, String college) {
            this.name = name;
            this.FName = FName;
            this.roll = roll;
            this.mo = mo;
            this.college = college;
        }

        public void display() {
            System.out.println(this.name);
            System.out.println(this.FName);
            System.out.println(this.college);
            System.out.println(this.roll);

        }
    }

    public static void main(String[] args) {
        int x = 10;

        char ch = 'c';
        String str = "Vikash";
        boolean bool = false;

        student s1 = new student();
        System.out.println(s1);

        // Instance & Reference
        // S1 is the reference to the instance of the student class
        // Assining the Values
        s1.name = "Vikash";
        s1.FName = "Mr. Tiwary";
        s1.college = "XYZ";
        s1.mo = 9717970;
        s1.roll = 43;

        s1.name = "Pranesh";
        s1.display();

        // System.out.println(s1.name);
        // System.out.println(s1.FName);
        // System.out.println(s1.college);
        // System.out.println(s1.roll);

        // student s2 = new student("Prakash", "Mr. singh", 38, 498375, "ABC");
        // System.out.println(s2.name);
        // System.out.println(s2.FName);
        // System.out.println(s2.college);
        // System.out.println(s2.roll);

        student s3 = new student();
        System.out.println(s3.college);
        s3.display();

    }
}
