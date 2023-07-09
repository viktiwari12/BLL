import java.util.*;

import javax.lang.model.element.Name;

import java.io.*;
import java.lang.*;
public class intro {
    public static void main(String[] args) {
        // This is for writing comments 
        // Print/ Output in java
         /* Command to run a java Program 
         *  javac filename.java
         *  java filename
         */
        System.out.print("Vikash"); 
        System.out.print("Tiwary");

        System.out.println("Adarsh");
        System.out.println("Venugopal");

        // Variables 
       /* int -> Stores any Integer value  10 90 
        * double -> 59.8 
        char  -> store any character  'c' 'v' '&'  '%' '$'
                    1 != '1'
        double 
        string -> "Viaksh"  "Tiwary"   "Vikash Tiwary"

        boolean -> it just store a ture or false 
         */
        String Name = "Vikash";
        int age = 30;
        double bb1 = 10.5;
        
        boolean male = true;
        boolean female = false;


        System.out.println("Name  " + Name + "   age -> " + age + " Bank Balance -> " + bb1 + " is he/she a male ? " + male + "    is he/she is female?   " + female );



        // Taking Input 

        Scanner scn = new Scanner(System.in);

        int num = scn.nextInt();
        System.out.println("Numebr taken as Input  is  -> " + num);
        
        String str = scn.nextLine();
        System.out.println("String taken as input is -> " + str);

        /* Short 5 min break  */

        
    }
}
