import java.util.*;

public class l001 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>(); // SYntax to declear queue

        
        q.offer(20);
        q.offer(10);
        q.offer((30));
        System.out.println(q);

        // reading the top element 

        int x = q.peek(); // this command just read the peak element 
        System.out.println(x);
        System.out.println(q);

        x = q.remove(); // this will read and remove the first element 
        System.out.println(x);
        System.out.println(q);
    }
}
