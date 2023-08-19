
import java.util.*;
public class p1 {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
    }
    public static void main(String[] args) {
        
    }
    public static ArrayList<Integer> lvl01(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll(); 

            ans.add(temp.val); // null point exception wile doing null.val
            if(temp.left != null) q.add(temp.left); // this will add null into the q 
            if(temp.right != null) q.add(temp.right);
        }
        return ans;
    }
    public static ArrayList<ArrayList<Integer>> lvl02(TreeNode root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            int cl = q.size();
            ArrayList<Integer> xlvl = new ArrayList<>();
            while(cl-- > 0){
                TreeNode temp = q.poll(); 

                xlvl.add(temp.val); // null point exception wile doing null.val
                if(temp.left != null) q.add(temp.left); // this will add null into the q 
                if(temp.right != null) q.add(temp.right);                
            }
            ans.add(xlvl);

        }
    }
}
