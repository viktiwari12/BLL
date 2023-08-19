
import java.util.*;
public class p1 {

    public static void main(String[] args) {
        
    }
    public static void pre(TreeNode root){
        // base Case 

        if(root == null) return;

        System.out.println(root.val); // Print -> Incase you want to store you can store 

        // Traverse on the LST
        pre(root.left);
        // Traverse on the RST 
        pre(root.right);
    }
    public static ArrayList<Integer> pre(TreeNode root){

        // Not allowed to change the parameter 
        // Not allowed to use any global arraylist 
        // Not allowed to use any helper function 

       if(root == null) return;

       ArrayList<Integer> temp = new ArrayList<>();
        temp.add(root.val); // Print -> Incase you want to store you can store 

        // Traverse on the LST
        pre(root.left);
        // Traverse on the RST 
        pre(root.right);

        return temp;

        9717970966


    }
     public static ArrayList<Integer> in(TreeNode root){

        // Not allowed to change the parameter 
        // Not allowed to use any global arraylist 
        // Not allowed to use any helper function 
     }
     public static ArrayList<Integer> post(TreeNode root){

        // Not allowed to change the parameter 
        // Not allowed to use any global arraylist 
        // Not allowed to use any helper function 
     }
}
