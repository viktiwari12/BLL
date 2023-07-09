

public class op {
    public static void main(String[] args) {
        // We will learn about the operators

        /*
         * Arethmetic 
         * comparison Operator 
         * Equality 
         * Logical Operators 
         * Conditional Operators 
         * Assingment Operators 
         * Unary 
         */

        int a = 10; 
        int b = 20;

        String str1 = "Vikash "; // 4k
        String str2 = "Tiwary ";
         // Arethmetic Operators  +  - * /  % 
        int sub = a -b;
        int mul = a * b;

        int plus = a + b;

        String  newStr = str1 + str2; // Here it will join both the string || Concatinate 


        str1 = str1 + "tiwary"; // 5k


        // / % 

        int x = 99;
        int y = 10;

        int quotent = x/y;

        int remainder = x% y;



        // Assingment Operators 

        int xx = 10;

        xx = (xx +20);

        xx += 10;

        xx -= 10;

        xx *= 10;

        xx %= 10;

        xx /=10;

        // Relational ->  Equality || Comparision 


        boolean flag = (a == b); // true / false 

        flag = (a <b); // less than 
        flag = (a >b); // greater than 

        flag = (a>= b); // greater than or equals 
        flag = (a <=b); // less than or equals

        flag = (a != b); // this will check if one is not equal to the other 
        
        // Logical -> Unary -> if else -> ternary operator 


        // If it is raining and I have beshan in kitchen then I will cook pakodey   && 
       
        // vikash sir or amit sir is present then class will run 


        flag = (a == 10) && (b== 20);


        flag = (a == 10) || (b == 30);
        flag = (a == 30) || (b == 20);



        // Unary Operators 

        // Pre & post  || increment decrement 


        int cc = a++;
        cc = ++a; 

        cc = a--;
        cc = --a;
    }
}
