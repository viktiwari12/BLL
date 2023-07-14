
import java.util.*;
public class l001 {
    public class node{
        int data ;
        String name; 
        String fname;
        String address;
        node next;
    }
    public static void main(String[] args) {
        
    }
    public static node mid(node head){
        node fast = head, slow = head;


        while(fast != null || fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
