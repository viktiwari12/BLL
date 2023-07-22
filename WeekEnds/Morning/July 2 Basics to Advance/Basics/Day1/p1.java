package Basics.Day1;
import java.util.*;
public class p1{
    public static void main(String[] args) {
        // given a number n 
        // count the number of digit 
        // reverse the number 

        int n = 123478;
        int temp = n;

        // count the digit 
        int count = 0;
        while(n != 0){
            int rem = n %10;
            n = n/10; // shortning the number by 1 digit 
            count = count +1;
            System.out.println(rem);
        }
        System.out.println(count);

        System.out.println(temp);
        // reverse the number 
        n = temp;
        int ans = 0;
        while (n != 0){
            int rem = n % 10;
            // for the number till current digit 
            ans = (ans * 10) + rem;

            // update the num -> shorten it by one digit 
            n = n/10;
            System.out.println(ans);
        }
        System.out.println(ans);
    }
}