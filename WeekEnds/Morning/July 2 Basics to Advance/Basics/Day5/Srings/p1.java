import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = "Vikash ";
        String s2 = new String("Tiwary ");
        //System.out.println(s1.hashCode());
        //String s3 = "Vikash Tiwary";

        System.out.println(s1 + "  " + s2.codePoints());
        System.out.println(s2 + "  " + s2.codePoints());
        String s3 = s1 + s2; // o(M+ N)
        
         //System.out.println(s3.hashCode());
        
       // String s1 = scn.next();
        //System.out.println(s1);
        //System.out.println("Input String  ->  "  + s1);

        // .next() method reads/scan from terminal only till it encounters a space 
        // The solution for the above problem is using .nextLine() method. -> Thsi will read/scan complete string 
        // How to take string as input from user 


        // Few Popular methods of string 
        // We can find the length of the string 
        int len = s1.length(); // it gives u the count of all the characters including special & null characters 
        System.out.println(len);

        // Like array, here also we can read the characters of the string 
        // and like array the index here also starts from 0 

        /*char ch1 = s1.charAt(0);
        char ch2 = s1.charAt(1);
        char ch3 = s1.charAt(2);
        char ch4 = s1.charAt(3);
        System.out.println(ch1 + " " + ch2 + " " + ch3 + "  " + ch4); 
        */

        // we can use loops here also 
        for(int i= 0; i< s1.length(); i++){
            System.out.println(s1.charAt(i));
        }

    }
}
