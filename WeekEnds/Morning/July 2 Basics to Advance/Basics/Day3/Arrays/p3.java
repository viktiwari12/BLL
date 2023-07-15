
import java.util.*;
public class p3 {
    public static void main(String[] args) {
        int arr[]  = new int [10];

    }

    // Find the sum of all the elements of the array 
    public static int sum(int arr[]){
        int ans = 0; 
        for(int idx = 0; idx <arr.length; idx++){
            ans  += arr[idx]; // a += b || a = (a + b)
        }
        return ans;
    }
    // Find the difference of the max element  and min element  of the  array 
    public static int range(int arr[]){
        // first I need to find the min element 
        // Find the max element 
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // int mn  = arr[0]; // this will fail if the size of the array is 0 
        // int mx = arr[0];

        for(int idx = 0; idx <arr.length; idx++){
            min = Math.min(arr[idx],min);
            max = Math.max(arr[idx], max);
        }
        return max - min;

    } 
    public static int[] arrsum(int a1[], int a2[]){ 
        if(a1.length == 0 || a2.length == 0) return a1.length == 0 ?a2: a1;  // edge case check 

        // take the resultant array 
        int al = Math.max(a1.length, a2.length) + 1;
        int a3 [] = new int [al];

        // taek three pointers to traverse all the three array 
        int i = a1.length-1, j = a2.length -1, k = a3.length -1;

        // take a carry 
        int cr = 0;
        while(i>=0 || j>=0 || k>=0){
            int num = cr;
            if(i>=0) num+= a1[i--];
            if(j >=0) num += a2[j--];
            a3[k--] = num %10;
            cr = num /10;
            /*
             if(i >=0 ){
                  num+= a1[i];
                      i--;
              }
               if(j >=0 ){
                   num+= a2[j];
                     j--;
              }
               // Mark the ans 
              
              a3[k] = num% 10;
              k--;
              
              // cupdate the carry 
              cr = cr /10;
             */

             
        }
        /*
            if(cr!= 0) a3[k] = cr;
        */

        //HW Problems 
        // Sutraction  (a2 >= a1)

        // Multiplicatoion 
    }

    public static void reverse(int arr[]){
        // reverse the elewments of the array 
        // Note: You hae to reverse the elements inside the array, not that u have to just print in reverse order 

        // swap the elements from first and last 
        int st = 0, end = arr.length -1;
        while (st < end){
            swap(arr, st++, end--);
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static boolean isPalindrome(int arr[]){
        // Given a array, check if it's palindrome or not? 
         int st = 0, end = arr.length -1;
        while (st < end){
           if(arr[st++] != arr[end--]) return false;
        }
        return true;
    }
}
