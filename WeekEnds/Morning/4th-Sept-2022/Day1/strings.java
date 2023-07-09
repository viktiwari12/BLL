import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.lang.*;
public class strings {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        
        String str = "Vikash";

        // taking string as input 
        String str1 = scn.next(); // it just reads everything til it get the first widespace 
        System.out.println(str1);
        String str2 = scn.nextLine(); // it just reads everything including widespace 
        System.out.println(str2);

        // Functions of the strings 
    
        // lengths of the string
        int n = str.length(); // make sure to put the paranthesis at the end as it is a function of string class
        

        // accessing the characters of the strings 
        for(int i = 0; i< n; i++){
            System.out.print(str.charAt(i)+ "-");
        }
        
        str.toUpperCase();
        System.out.println(str);
        str.toLowerCase();
        System.out.println(str);
        
        // to capmare two strings 
        boolean flag = str1.equals(str2);

        String sb = str.substring(1, 3);

        String x= str + str1;   

        String st3 = "1234";
        int xx = Integer.parseInt(st3); 
    }
}
