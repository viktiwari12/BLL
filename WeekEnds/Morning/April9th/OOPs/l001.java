public class l001{
    // Make a class of Student 
    public static class student{
        String name ;
        String Father;
        // int rool;
        // long  mobile;
        // boolean male;
        // int std;
    }
    public static void main(String[] args) {
        // To store any data of 
        // Integer 
        // int num = 10;
        // char ch = 'w';
        // String str = "Vikash Tiwary";
        // boolean flag  = true;


        // But, Now I want to store the Information of a student 
        student s1 = new student(); // WHat I have created is a object of studnet class 
        System.out.println("Value stored in S1 variable " + s1);
        // Assign the values one by one 
        s1.name = "Vikash Tiwary";
        s1.Father = "Mr. Tiwary";
        // s1.rool = 29;
        // s1.mobile  = 9717970;
        // s1.male = true;
        // s1.std = 10;


        System.out.println(s1.name);
        System.out.println(s1.Father);
        // System.out.println(s1.rool);
        // System.out.println(s1.mobile);
        // System.out.println(s1.male);
        // System.out.println(s1.std);

        // try to assingn some values and not some, and see what happens

        student s2 = new student();
        s2.name  = "Madhumita";
        s2.Father = "Mr. Das";
        // s2.rool = 19;

        System.out.println(s2.name);
        System.out.println(s2.Father);
        // System.out.println(s2.rool);
        // System.out.println(s2.mobile);
        // System.out.println(s2.male);
        // System.out.println(s2.std);

        // student s3 = null;

        // System.out.println(s3);
        
        System.out.println("Before Swapping  ");
        System.out.println(s1.name);
        System.out.println(s1.Father);
        System.out.println(s2.name);
        System.out.println(s2.Father);

        swap(s1, s2);

        System.out.println("After Swapping  ");
        System.out.println(s1.name);
        System.out.println(s1.Father);
        System.out.println(s2.name);
        System.out.println(s2.Father);   
    }
    public static void swap(student s1, student s2){
        // student temp = s1;
        // s1 = s2;
        // s2 = temp;
        String t = s1.name;
        s1.name = s2.name;
        s2.name = t;
    }
}