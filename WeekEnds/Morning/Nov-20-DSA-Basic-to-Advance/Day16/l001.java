import java.util.Scanner;

public class l001 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode head = createLinkedList();
        display(head);

    }
    public static void display(ListNode head){
        ListNode curr = head;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }

    }
    public static ListNode addFirst(ListNode head, int val){
        ListNode temp = new ListNode(val);
        temp.next = head;

        head = temp;
        return head;
    }
    public static void addLast(ListNode head, int val){
        ListNode curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        // here I am Pointing to the last element 

        curr.next = new ListNode(val);
    }
    public static void addRandom(ListNode head, int k, int val){
        ListNode curr = head;
        int i = 0;
        while(i++ < k){
            curr = curr.next;
        }
        ListNode frw = curr.next; // create the backup of the next node;
        curr.next = new ListNode(val);
        curr.next.next = frw;
    }
    public static ListNode removeFirst(ListNode head){
        ListNode temp = head;

        head = head.next;
        temp.next = null;
        return head;
    }
    public static void removeLast(ListNode head){
        ListNode curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
    }
    public static void removeRandom(ListNode head, int k){
        ListNode curr = head;
        int i = 0;
        while(i++ < k){
            curr = curr.next;
        }
        ListNode temp = curr.next;
        curr.next = curr.next.next;
        temp.next = null;
    }


    public static ListNode mid(ListNode head){
        
    }
    public static ListNode createLinkedList(){
        Scanner scn = new Scanner(System.in);

        //int len = scn.nextInt();
        // take the first element 
        int temp = scn.nextInt();
        if(temp == -1) return null;

        ListNode head = new ListNode(temp);
        ListNode pre = head;

       // int i = 2;
        while(true){
            temp = scn.nextInt();
            if(temp == -1){ // sign of linkedList completetion
                break;
            }

            ListNode curr = new ListNode(temp);
            pre.next = curr;

            
        }
        return head;
    }
    

}
