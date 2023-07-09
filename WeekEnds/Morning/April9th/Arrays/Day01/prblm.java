// 9717970966 
import java.util.*;
public class prblm {
    public static void main(String[] args) {
        int arr[] = {10, 30, 20, 14, 50, 12};
        PrintReverse(arr);

    }
    // problem 1 
    public static void print(int arr[]){
        // GIven an array print all the elemtns 
        for(int idx = 0; idx< arr.length; idx++ ){
            System.out.print(arr[idx] + "  ");
        }
        System.out.println();
    }
    // problem 2
    public static void PrintReverse(int arr[]){
        // GIven an array print all the elemtns i reverse order
        for(int idx = arr.length -1; idx>= 0; idx--){
            System.out.print(arr[idx] + "  ");
        }
        System.out.println();
        print(arr);
    }
    // problem 3
    public static void min(int arr[]){
        // GIven an array print minimumelement
        int ans = Integer.MAX_VALUE;
        for(int idx = 0; idx< arr.length; idx++ ){
            if(arr[idx] < ans){
                ans = arr[idx];
            }
            // ans = Math.min(arr[idx], ans);
        }
        System.out.println(ans);

    }
    // problem 4
    public static void max(int arr[]){
        // GIven an array  print maximum element
        // if(arr.length == 0) 
        int ans = Integer.MIN_VALUE;
        for(int idx = 0; idx< arr.length; idx++ ){
            if(arr[idx] > ans){
                ans = arr[idx];
            }
            // ans = Math.max(arr[idx], ans);
        }
        System.out.println(ans);

    }
    // problem 5
    public static void frq(int arr[], int tar){
        // GIven an array and a target element print the no of times (frequency) the target elemetns appears in the array 

        int ans = 0; 
       
        for(int idx = 0; idx< arr.length; idx++ ){
            if(arr[idx]  == tar){
                ans++;
            }
            // ans = Math.min(arr[idx], ans);
        }
        System.out.println(ans);
    }


    // Some Good Questions 
    public static boolean isPalindrome(int arr[]){
        // check if the array is palindrome or not 

        // Print ture/ false 
        // true --> It is palindrome 
        // false -> It is not Palindrome 

        //{()} -> abccba
        //})({
            int st = 0; 
            int end = arr.length-1;


            while(st<end){
                if(arr[st] != arr[end]) return false;

                st++;
                end--;
            }
            return true;
    }
    public static void isPalindrome01(int arr[]){

        // Print the ans in the body itself;
        boolean ans;
        /*
         * 
         * Complete the body
         */

        System.out.println(ans);
    }
    public static void reverse(int arr[]){
        // reverse all the elements in the array 

       // {1, 2, 3, 4, 5} -> arr[0] -> 1
       // -> reversed array -> {5, 4,  3, 2,1 }; arr[0] -> 5
    }
        
    
}
