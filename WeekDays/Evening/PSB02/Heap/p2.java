
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        
    }
    public static int kthlar(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){ // Put all the elements in the heap
            pq.add(ele); // logN 
        }
        // N * log(N)  

        for(int i =0; i< k-1; i++){ //k-1
            pq.remove(); // LogN
        }
        // (k-1)* LogN
        return pq.peek();
        // Total Complexity -> NlogN + (k-1)logN + O(N) -> Space 
    }
    public static int kth01(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i< k; i++){ // Initaially, put first K element in the heap
            pq.add(arr[i]); // K * Log(K) 
        }
        for(int i =k +1; i< arr.length; i++){ //k-1 // Put all the elements in the heap
            if(arr[i]>pq.peek()){
                pq.remove(); //  * LogK
                pq.add(arr[i]); // Log K 
            }
        }
        //( N-k )* (log K ) 

       
        return pq.peek();
        // Total Complexity -> NlogN + (k-1)logN + O(N) -> Space 
    }
    public static int kthsmallest(int arr[], int k){

    }
    public static ArrayList<Integer>klar(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i< k; i++){ // Initaially, put first K element in the heap
            pq.add(arr[i]); // K * Log(K) 
        }
        for(int i =k +1; i< arr.length; i++){ //k-1 // Put all the elements in the heap
            if(arr[i]>pq.peek()){
                pq.remove(); //  * LogK
                pq.add(arr[i]); // Log K 
            }
        }
        //( N-k )* (log K ) 

        ArrayList<Integer> al = new ArrayList<>();
        while(pq.size() >0){
            al.add(pq.remove());
        }
        return al;
        // Total Complexity -> NlogN + (k-1)logN + O(N) -> Space 
    }
    public static ArrayList<Integer>ksmallest(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0; i< k; i++){ // Initaially, put first K element in the heap
            pq.add(arr[i]); // K * Log(K) 
        }
        for(int i =k +1; i< arr.length; i++){ //k-1 // Put all the elements in the heap
            if(arr[i]<pq.peek()){
                pq.remove(); //  * LogK
                pq.add(arr[i]); // Log K 
            }
        }
        //( N-k )* (log K ) 

        ArrayList<Integer> al = new ArrayList<>();
        while(pq.size() >0){
            al.add(pq.remove());
        }
        return al;
    } 

}
