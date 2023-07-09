
public class ll {
    static class node{
        int data ;
        node next;
        node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        node head = null;
        
        node n1 = new node(10);
        head = n1;
        node pre = head;

        node n2 = new node(20);
        pre.next = n2;

    }
    public static void display(node head){

        node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }


    }
    public static void addFirst(node head){
        node temp = new node(50);
        temp.next = head;
        head = temp;
    }
    public static void addlast(node head){
        node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        node n1 = new node(50);
        temp.next = n1;

    }
    public static void removeFirst(node head){
        node temp = head.next;
        head.next = null;
        head = temp;
    }   
    public static void removelast(node head){
        node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public static void middle(node head){
        
    }

}
