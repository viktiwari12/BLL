
public class l001 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        
    }
    
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head; 
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static ListNode reverseList(ListNode head) {
       
        ListNode pre = null;
        ListNode curr = head;
 
        while(curr != null){
            ListNode frw = curr.next; // create a back up 
 
            curr.next = pre;
 
            // update the pointers 
            pre = curr;
            curr = frw;
        }
 
        return pre;
     }
}
