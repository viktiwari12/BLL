import java.util.*;

import java.io.*;
import java.lang.*;
public class array {
    public static void main(String[] args) {

        // Storing the name of the 50 students
       /*  String s1 = "ndgand";
        String s2 = "ndgand";
        String s3 = "ndgand";
        String s4 = "ndgand";
        String s1 = "ndgand";
        String s1 = "ndgand";
        String s1 = "ndgand";
        String s1 = "ndgand";String s1 = "ndgand";
        String s1 = "ndgand";
        String s1 = "ndgand";
        String s1 = "ndgand";
        String s1 = "ndgand";
        String s1 = "ndgand";

        String s1 = "ndgand";
        String s1 = "ndgand";
        String s1 = "ndgand";
        String s1 = "ndgand";
        String s1 = "ndgand";
        String s1 = "ndgand"; */

        int arr[] = new int[10]; // create a array 

        // now let's store the values in array 

        arr[0] = 10; // 1st position 
        arr[1] = 20; // second position 
        arr[2] = 30; // third position

        arr[5] = 40; 

        // update the value

        arr[5] = 50; // 
        // reading the values of array 
        System.out.println("Reading the values stored in array normally");
        System.out.println("First element " + arr[1]);
        System.out.println("Second element " + arr[2]);
        System.out.println("Third element " + arr[3]);
        System.out.println("Fourth element " + arr[4]);
        System.out.println("fiftheelement " + arr[5]);
        // Storing values in array using loops 

        for(int i = 0; i< 10; i++){
            arr[i] = i;
        }

        // reading te values of array using loops 
        System.out.println("Reading the values stored in array Using Loops ");
        for(int i = 0; i< 10; i++){
            System.out.println(i+"th element of the arraay is ->  " + arr[i]);
        }

        for(int i = 9; i>=0 ; i--){
            System.out.println(i+"th element of the arraay is ->  " + arr[i]);
        }

        System.out.println();
        System.out.println(arr);
    }
}
