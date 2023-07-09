import java.util.*;
class l001{
    public static void main(String[] args){
        // How to declear/ Define Heap/PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // by default, the priority is given to the smller no.

        // Putting/adding eleents in the PQ

        pq.add(50);

        pq.add(30);
        pq.add(40);

        System.out.println(pq.peek());

        pq.add(10);
        System.out.println(pq.peek());

        // remove element from the pq

        pq.remove();

        System.out.println(pq.peek());

        PriorityQueue<String> pq2 = new PriorityQueue<>(Collections.reverseOrder());

        pq2.add("Vikash");
        pq2.add("Vishal");
        pq2.add("Mimansha");
        pq2.add("Bajrangi");

        System.out.println(pq2.peek());

        


    }

    // Given an array-> and a K value. 
    /// Return th k largest elements;

    // wh k< arr.lenght();
    public static void kLargest(int arr[], int k){
        // 

    }
    // Given an array, which is K Sorted. 

    public static void kSortedArray(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i<=k; i++){
            pq.add(arr[i]);
        }
        for(int i = k+1; i<arr.length; i++){
            // First remove the element from the heap
            System.out.println(pq.remove());
            // adding the current element into heap;
            pq.add(arr[i]);
        }

        // here still k elements will be there in the Heap;

        // simpally remove them.
        while(pq.size()>0){
            System.out.println(pq.remove());
        }
    }

}