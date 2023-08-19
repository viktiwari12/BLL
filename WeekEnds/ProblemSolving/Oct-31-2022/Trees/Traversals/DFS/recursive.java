
public class recursive {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {
        
    }
    public static void preorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
    public static void InorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        
        InorderTraversal(root.left);
        System.out.println(root.val);
        InorderTraversal(root.right);
    }

    public static void PostorderTraversal(TreeNode root){
        if(root == null){
            return;
        }
        PostorderTraversal(root.left);
        PostorderTraversal(root.right);
        System.out.println(root.val);

}
