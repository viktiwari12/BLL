
import java.util.*;
public class l001 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
       
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);
        System.out.println("First elemwnt " + q.peek());
        System.out.println("Length " + q.size());
        System.out.println( "First elemwnt " +  q.poll());
        System.out.println(q);
        System.out.println("Length " + q.size());
        System.out.println("First elemwnt " + q.peek());

        System.out.println(q);

    }
}
