package Trees;

public class loo1 {
    public static void main(String[] args) {
        
    }
    public static int max(TreeNode root){
        /*  Given a Binary tree, Figure out the node with the maximum value  
        if(root == null) return Integer.MIN_VALUE;
        // Min -> H/W
        // Either the root will be the  max element 
        // or Max element will lie anyewhere in LST or RST 

        int lmax = max(root.left);
        int rmax = max(root.right);
        return Math.max(lmax, Math.max(root.val, rmax));*/

        return root == null? Integer.MIN_VALUE : Math.max(max(root.left), Math.max(max(root.right), root.val));
    }
    public static int sum(TreeNode root){
        // Given a Binary tree, figure out the sum of all the nodes
       
        return root == null ? 0: sum(root.left) + sum(root.right) + root.val;

    }
    public static boolean find(TreeNode root, int tar){
        // Given a binary tree, figure out if a tar value exost in the binary tree or not 
        // base case 
        if(root == null) return false;
        // either the root will be the target element or the tar element will be in LST or Tar element will be in RST 

        // root check 
        if(root.val == tar) return true;

        boolean rf = find(root.right, tar);
        if(rf) return true; // if found in Lst, no need to check in rst 
        boolean lf = find(root.left, tar);

        return lf;
        

        
    }
    // Now there might be muliple occurance of tar in the tree. You have to count the total no of occurences 
    public static int count(TreeNode root, int tar){
        // base case 
        if(root == null) return 0; 

        int lc = count(root.left, tar);
        int rc = count(root.right, tar);
        return root.val == tar? lc + rc +1: lc + rc;
    }
    public static int height(TreeNode root){
         // Height of a binarty tree is defined a s the maximum no of nodes btw root and any leafe node.

         if(root == null) return 0;


         int lh = height(root.left);
         int rh = height(root.right);
         return Math.max(lh, rh)+1; 


         return root == null? 0: Math.max(height(root.left), height(root.right)) +1;
    }
}
