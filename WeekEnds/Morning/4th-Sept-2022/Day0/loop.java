
import java.util.*;

import javax.lang.model.element.Name;

import java.io.*;
import java.lang.*;
public class loop {
    public static void main(String[] args) {`
        // All about Loops 


        int num = 10;

        System.out.println(num);


        // While Loops 
        int count = 1; // Initaliation 
        
        while(count <= 10){  // contion check 
            
            System.out.println(num); // Work
            count++; // Updation 
        }
        System.out.println();

        /* 
         * intilation 
         * 
         * conditioncheck 
         * 
         * work 
         * 
         * updation 
         * 
         */


        /*For Loop 

        for(intilation ; conditioncheck ; updation ){
            work 
        }
        */
        int num1 = 10;
        for(int i =0 ; i<10; i++){
            System.out.print(num1 +" ");
        }


        int task = 1; 
        int condition =1 ;
        while(condition <= 5){
            System.out.println(task);
            task = task+1; // Note this is not the updation of the condition rather I am jsut changing the value of the task 
            // updating the condition
            condition++;
            
        }

        int i = 0;
        while(i< 5){
            System.out.println(i);
            i++;
        }


        for(int j = 0; j< 10; j++){
            System.out.println(j);
        }
        System.out.println("Do  While Loop ");
        int x = 5;
        do {
            System.out.println(x);
        } while (x< 4);
        
        System.out.println("Only While Loop ");
        while(x < 4){
            System.out.println(x);
        }

    }
}
