import java.util.*;

public class p1 {
    public class node{
        int data;
        node next; // next will tore the referense of another node 
        node(){} 
        node(int data){
            this.data = data;
            this.next = null;
        }
         node(int data, node next){
            this.data = data;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        
    }
    public static void display(node head){
        // Never ever use head pointer to travel in the LinkedList 
        node curr = head;

        while(curr != null){
            System.out.print(curr.data + " -> "); // Print the data 
            curr = curr.next; // Update the pointer 
        }
        System.out.println();
    }
    public static void tail(node head){
        node curr = head;

        while(curr.next != null){
           
            curr = curr.next; // Update the pointer 
        }
        System.out.println(curr.data);
    }
     public static node mid(node head){
        node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
     }
}