
import java.util.*;

public class p1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        printSubArray(arr);
    }
    public static void printSubArray(int arr[]){
        for(int st = 0; st<arr.length; st++){
            for(int end = st; end <arr.length; end++){
                // HEre is the regoin we want to Print all the elements b/w st -> end 
                print(arr, st, end);
                
            }
            System.out.println();
        }
    }
    public static void print(int arr[], int i, int j){
        while(i<= j){
            System.out.print(arr[i++] + "  ");
        }
        System.out.println();
    }
}
