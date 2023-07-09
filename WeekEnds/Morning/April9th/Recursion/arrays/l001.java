

public class l001 {
    public static void main(String[] args) {
        // Now recursion on arrays 
        int arr[] = {10, 20, 30, 40, 50};
        Print(arr, 0);
        PrintReverse(arr, 0);
    }
    // Given an array and the starting index, Using recursion,Print all all then elements 
    public static void Print(int arr[], int idx){
        if(idx == arr.length) return ;
        // First thing First, Whenever You have recursion on arrays, Use Your faith & Expectations in terms of Indexeds 

        // Expectaions is to Print in normal order from 0th idx to (n-1)th Index
        // 0 1 2 3 4 

        // Faith recursion will Print from (curr+1)th idx to (n-1)th Idx
        // task is frist print curr idx 

        System.out.println(arr[idx]);
        Print(arr, idx+1);

    }
    // Given an array, and the starting index, using recursion Print all the elements in the reverse order;
    public static void PrintReverse(int arr[], int idx){
        
    }
    
}
