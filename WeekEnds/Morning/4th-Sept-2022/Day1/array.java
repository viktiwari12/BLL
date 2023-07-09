import java.util.*;

import java.io.*;
import java.lang.*;
public class array {
    public static void main(String[] args) {
        // make a scanner class to take input 

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt(); // length of the array 

        // make a array of the selected size 
        int arr[] = new int[n];
        // take all the elements of the array as input 
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        // now the real game begins 
        // take a variable to store the sum 
        int sum = 0;
        for(int ele : arr){ // this is a for-each loop 
            sum = sum+ ele;
        }
        System.out.println("Sum of all the elements in the array is -> " + sum);


        // now find the product of all the elements if the same array 
        int product = 1;
        for(int ele : arr){ // this is a for-each loop 
            product = product* ele;
        }
        System.out.println("Product of all the elements in the array is -> " + product);

        // Slight tougher problem 

        




    }
}
