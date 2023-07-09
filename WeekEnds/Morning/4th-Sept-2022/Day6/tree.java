

public class tree {
    static class node{
        int data; 
        node left; 
        node right;

        node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        node(int data,  node left, node right){
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        
    }
    public static void preOrder(node root) {
        // base case 
        if(root == null) return;

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
        
    }
    public static void InOrder(node root) {
        // base case 
        if(root == null) return;

        
        InOrder(root.left);
        System.out.println(root.data);
        InOrder(root.right);
        
    }
    public static void postOrder(node root) {
        // base case 
        if(root == null) return;
        
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
        
    }
}
