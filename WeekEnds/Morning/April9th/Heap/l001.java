import java.util.*;

public class l001 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // wy to create heap 

       pq.add(30);
       System.out.println(pq);
       pq.add(50);
       System.out.println(pq);
        pq.add(10);
       System.out.println(pq);
       pq.add(20);
       System.out.println(pq);

       // Some fact 
       /*   
        * Intesertion in heap happen in logN
        * Deletion/ Removaval happens in logN
        * Reading peak happens in o(1)


        // Will derive  the complexity once we learn in construction of heap in advance classes 
        */
    }
}
