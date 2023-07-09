import java.math.*;
public class stc {

    public  static class student{
        String Name = "Vikash";
         String College = "IIT DELHI"; // After Using static here, this is the data member of the student class not of any particular object which might be 
        int roll;
        long mo;
    }
    public static void main(String[] args) {
        // Can I access any Data member of student class without creating any object of the student clas? 
        student st = new student();
        st.College = "IIT DELHI";
        String str = st.College;
        System.out.println(str);

        Math.max(5, 6);

    }

}
