public class l002 {
    public static class student{
        String collegeName;
        String name;
        int roll;
        String fatherName;
        boolean gender; // true -> male || fasle -female;
        String depatment;
        student(){}; // constructor 1 -> Default constructor 

        student(String collegeName, String name,  String fatherName, boolean gender ){ // paramATERISE CONSTRUCTOR 1
            //this.collegeName = collegeName;  // this.xyz = instance.xyz
            this.name = name;
            this.fatherName = fatherName;
            this.gender = gender;
        }
            
        
        student(String collegeName, String name, int roll, String fatherName, boolean gender, String depatment ){ // paramATERISE CONSTRUCTOR 2
            this.collegeName = collegeName;
            this.name = name;
            this.roll = roll;
            this.fatherName = fatherName;
            this.gender = gender;
            this.depatment = depatment;
        }
        
        public void displayDetails(){ // This is a function/ method
            System.out.println(this.collegeName);
            System.out.println(this.name);
            System.out.println(this.fatherName);
            System.out.println(this.roll);
            System.out.println(this.gender);
            System.out.println(this.depatment);
        
        }
    }
        public static void main(String[] args) {
            student s1 = new student("ABS", "Mimansa", 20, "Mr. M Sinha", false, "CS");
            //s1.displayDetails();
            
            student s2 = new student("XYZ College", "Vikash", 49, "H K Tiwary", true,  "IT");

            System.out.println("Details of S1");
            s1.displayDetails();
            System.out.println();
            System.err.println();
            System.out.println("Details of S2");
            s2.displayDetails();
            System.out.println();
            System.out.println();



            // task is to swap the details of s1 & s2 


            // s1.displayDetails(); // it should print the details of actual s2 

            // s2.displayDetails(); // ti should print the details of actual s1



            // simple swapping concept

            
            swap(s1, s2);
            System.out.println("Details of S1");
            s1.displayDetails();
            System.out.println();
            System.err.println();
            System.out.println("Details of S2");
            s2.displayDetails();
            System.out.println();
            System.out.println();

        }
        // very famous interview question 
        public static void swap(student s1, student s2){
            // student temp = s1;
            // s1 = s2;
            // s2 = temp;


            // here we will have to actually swap every values individually , because those values recieved as paramenter are actually reference to some Instance


            String temp = s1.collegeName;

            s1.collegeName = s2.collegeName;
            s2.collegeName = temp;
        }
}
