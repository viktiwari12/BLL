import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class intro2 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


        
        pq.add(100);
        pq.add(910);
        pq.add(190);
        pq.add(130);
        pq.add(210);
        pq.add(180);
        pq.add(150);
        pq.add(10);
        pq.add(310);
        pq.add(110);

        System.out.println(pq.peek());
        pq.poll();

        System.out.println(pq.peek());
    }
}
