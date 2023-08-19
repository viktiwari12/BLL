public class p2 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public static void main(String[] args) {
        
    
    }
    public static int sum(TreeNode root){
        return root == null? 0: root.val + sum(root.left)+ sum(root.right);
    }
    public static int max(TreeNode root){
        return root == null ? Integer.MIN_VALUE : Math.max(root.val, Math.max(max(root.left), max(root.right)));
    }
    public static int min(TreeNode root){
        return root == null ? Integer.MAX_VALUE : Math.min(root.val, Math.min(min(root.left), min(root.right)));
    }
    public static int height(TreeNode root){
        return root == null ? 0:( Math.max(height(root.left), height(root.right)))+ 1;
    }
    public static boolean find(TreeNode root, int tar){
        return root == null? false : root.val == tar|| find(root.left, tar) || find(root.right, tar);

        
    }                
}
