
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new  PriorityQueue<>(Collections.reverseOrder());
        // reading the top of the element 
        pq.add(10);
        System.out.println(pq.peek());

        pq.add(20);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.add(30);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.add(8);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.add(7);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.add(25);
        System.out.println(pq);
        System.out.println(pq.peek());
         pq.add(5);
         System.out.println(pq);
        System.out.println(pq.peek());

        System.out.println(pq);
        pq.add(50);
         System.out.println(pq);
        System.out.println(pq.peek());
        
        /*
         * time complexity of few operations in Pq
         * 
         * .add() -> logN (if N elements in the heap)
         * .remove() -> LogN 
         * .peek() -> 0(1) -> Always, irespective of the no of elements in the heap 
         * 
         */

    }
}
