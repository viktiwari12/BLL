

public class l001 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.val = data;
            this.left = null;
            this.right = null;
        }
        TreeNode(int data, TreeNode left, TreeNode right){
            this.val = data;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        
    }
    public void uler(TreeNode root){
        // base case 
        if(root == null )return;

        System.out.println("Visiting  " + root.val + "  First Time ");
        uler(root.left);
        System.out.println("Visiting  " + root.val + "  Second Time ");
        uler(root.right);
        System.out.println("Visiting  " + root.val + "  Third Time ");

    }
    public void pre(TreeNode root){
        // base case 
        if(root == null )return;

        System.out.println("Visiting  " + root.val + "  Pre Area ");
        pre(root.left); 
        pre(root.right);
    }
    public void in(TreeNode root){
        // base case 
        if(root == null )return;

        in(root.left);
        System.out.println("Visiting  " + root.val + "  In Area ");
        in(root.right);
    }
    public void post(TreeNode root){
        // base case 
        if(root == null )return;

        post(root.left);
        post(root.right);
        System.out.println("Visiting  " + root.val + "  Post Area ");
    }
}
