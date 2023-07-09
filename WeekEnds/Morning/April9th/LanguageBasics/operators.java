

public class operators {
    public static void main(String[] args) {
        // Let's Learn about operators 

        // Unirary 
        // Arthemetic 
        // Logical 
        //Ternary Operator (After Learning Conditionals )
        //assingment operators 


        // Arthmetic operators 

        int a = 12;
        int b = 5;

        int x = a + b; // it will return the sum of both the numbers 

        int y = a -b;  // it is difference 

        int z = a * b; // product 

        int xy = a/ b; // it will give you the quotent 

        int yx = a % b; //  it is called as modulo operator, and it returns the remainder 

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(xy);
        System.out.println(yx);
        System.out.println();


        // out of all these arthemetic operators, one behave differently in some case 

        // + -> in case of strings 
        String str1 = "Vikash ";
        String str2 = "Tiwary ";

        String str3 = str1 + str2; // Here + operator works as concationar 

        // Note:- In Java Strings works completly differently (Will Learn in String Module)


        /* --------  Unirary Operator  */

        //-> Prefix 
        // PostFix 

    //    int temp = 10;
    //    int temp1 = temp++;


     // PreIncrement
        int temp = 10;
        int temp1 = ++temp;
       System.out.println(temp);
       System.out.println(temp1);

        temp += 50 ; // temp = temp +50;

        


        // Comparision Operators  -> it always return a boolean value 

        /*
         * Equality 
         * Not Equality 
         * greater 
         * lesser 
         * greater equal 
         * lesser equal
         */


        temp = 30;

        temp1 = 40;

        boolean flg = (temp == temp1);

        boolean flg1 = (temp != temp1); // not equal to 


        >=  || <= || > || < 




        // Logical operator 



        // Here we check on two or more than two statement


        // Logical and 

        Boolean flag = (temp == 30) && (temp1 == 40);

        boolean flag2 = (temp == 50) && (temp1 == 40);

        // T-T -> T
        // T-F > F
        // F-T -> F
        // F- F -> F


        // Logical and 

        boolean f2 = (temp == 30) || (temp1 == 60);

        boolean f3 = (temp == 20) || (temp1 == 40);


        // T-T -> T
        // T-F -> T
        // F-T -> T
        // F- F -> F

        // https://www.javatpoint.com/operators-in-java

    }
}
