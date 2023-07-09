
import java.util.*;
public class l001 {
    public static void main(String[] args) {
        // Bubble sort 
        int arr[] = {6,1,4,3,2,5};
        System.out.println("Before Swapping ");
        display(arr);
        insertionSort(arr);
        System.out.println("After Swapping ");
        display(arr);
    }
    public static void BubbleSort(int arr[]){
        int itr = arr.length -1;
        for(int i = 1; i<= itr; i++){
            // futher looop for compare and swap 
            for(int curr = 0; curr< arr.length -1; curr++){
                System.out.println("Comparing  " + arr[curr] + "  " + arr[curr +1]);
                if(arr[curr] > arr[curr + 1]){
                    System.out.println("Swapping "+ arr[curr] + "  " + arr[curr +1]);
                    swap(arr, curr, curr+1);
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        for(int curr = 0; curr< arr.length -1; curr++){
            int minIdx = findMin(arr,  curr); // find the idex of the minimum element from curr => n
            swap(arr, curr, minIdx); 
        }
    }
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length; i++){ // this loop will help us choose the element which we have to insert in the sorted region
            for(int j = (i -1); j>=0; j-- ){ // this loop for for finding the potential position where we need to insert 
                if(arr[j] > arr[j+1]){
                    swap(arr, j, j+1);
                }else{
                    break; // this is the most important step in Insertion sort
                }
            }
        }
    }
    public static int findMin(int arr[], int curr){
        int min = curr;
        for(int i = curr+1; i<arr.length; i++){
            min = arr[i] < arr[min]? i: min; 
        }
        return min;
    }
    public static void swap(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void display(int arr[]){
        for(int ele : arr){
            System.out.print(ele + "  ");
        }
        System.out.println();
    }
}
