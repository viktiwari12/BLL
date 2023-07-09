
public class l001 {
    // Here I am actually defining the structure of the student class 
    public static class student{
        String CollegeName;
        String name;
        int roll;
        String fatherName;
        boolean gender; // true -> male || fasle -female;
        String Depatment;
        // constructor 1 -> Default constructor 

        student(String ColNm, String nm,  String Fnm, boolean mf){ // paramATERISE CONSTRUCTOR 1
            CollegeName = ColNm;
            name = nm;
            fatherName = Fnm;
            gender = mf;
        }
        student(String ColNm, String nm, int rll, String Fnm, boolean mf, String deprt){ // paramATERISE CONSTRUCTOR 2
            CollegeName = ColNm;
            name = nm;
            roll = rll;
            fatherName = Fnm;
            gender = mf;
            Depatment = deprt;
        }
        public void displayDetails(){ // This is a function/ method
            System.out.println(this.CollegeName);
            System.out.println(this.name);
            System.out.println(this.fatherName);
            System.out.println(this.roll);
            System.out.println(this.gender);
            System.out.println(this.Depatment);
        
        }
    }
    public static void main(String[] args) {
        // Now here comes the real game -> Creation of the object of the class 
        student s1 = new student(); // s1 is reference to a new Instance 
        student s2 = new student(); // s2 is the referene to new Instance 

        student s3 = s2; // s3 is the reference to the old instance `

        System.out.println("S1 -> "  + s1);
        System.out.println("S2 -> "  + s2);
        System.out.println("S3 -> "  + s3);

        // Instace and Reference are two different things 


        // assigning values in the Instance/ objects
        s1.CollegeName = "XYZ College";
        s1.name = "Vikash Tiwary";
        s1.roll = 49;
        s1.fatherName = "MR. H K Tiwary";
        s1.gender = true; // male 
        s1.Depatment = "IT";
        
        

        // Reading the values 
        // System.out.println(s1.CollegeName);
        // System.out.println(s1.name);
        // System.out.println(s1.fatherName);
        // System.out.println(s1.roll);
        // System.out.println(s1.gender);
        // System.out.println(s1.Depatment);
        

        // constructors 
    

        student s4 = new student("ABS", "Mimansa", 20, "Mr. M Sinha", false, "CS");

        s4.displayDetails();
        s4.name = "Preetha"; //
        
        System.out.println(s4.name);


        student s5 = new student(null, null, 0, null, false, null);


        student s6 = new student(null, null, null, false);

        student s7 = new student();

    }
}
