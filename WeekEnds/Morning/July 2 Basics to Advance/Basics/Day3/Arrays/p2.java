import java.util.Scanner;
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Take the size of the array from user 
        System.out.println("Enter the size of the array! ");
        int sz = scn.nextInt();

        // create an array of the same size 
        int arr[] = new int[sz];

        // take all the elements of the array as Input from the user

        for(int idx = 0 ; idx<arr.length; idx++){
            System.out.println("Eneter the " + (idx +1)+"th Element  ");
            arr[idx] = scn.nextInt();
        }

        // once we have taken the input, Let's validate! 

        for(int idx = 0; idx <arr.length; idx++){
            System.out.print(arr[idx] + "  ");
        }
        System.out.println();
    }
}
