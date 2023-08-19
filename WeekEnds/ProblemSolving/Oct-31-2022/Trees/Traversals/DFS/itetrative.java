
import java.util.*;
public class itetrative {
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
    public class pair{
        TreeNode node = null;
        int state = 0;
        pair(TreeNode node){
            this.node = node;
        }
    }
    public static void main(String[] args) {
        
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> bag = new ArrayList<>();
        if(root == null) return bag; // edge case check 
        Stack<pair> st = new Stack<>();
        st.push(new pair(root));

        while(st.size() > 0){
            // first read out the top element 
            pair temp = st.peek();
            if(temp.state == 0){ // visiting this node for the first time -> pre area
                bag.add(temp.node.val);
                temp.state++;
            }else if(temp.state == 1){ //visiting the node in the second time-> in area
                if(temp.node.left != null){
                    st.push(new pair(temp.node.left));
                }
                temp.state++;
            }else if(temp.state == 2){ // visiting the node in third time -> post area
                if(temp.node.right != null){
                    st.push(new pair(temp.node.right));
                }
                temp.state++;
            }else{
                st.pop();
            }
        }
        return bag;
      
    }
    public List<Integer> InorderTraversal(TreeNode root) {
        List<Integer> bag = new ArrayList<>();
        if(root == null) return bag; // edge case check 
        Stack<pair> st = new Stack<>();
        st.push(new pair(root));

        while(st.size() > 0){
            // first read out the top element 
            pair temp = st.peek();
            if(temp.state == 0){ // visiting this node for the first time -> pre area
                if(temp.node.left != null){
                    st.push(new pair(temp.node.left));
                }
                temp.state++;
            }else if(temp.state == 1){ //visiting the node in the second time-> in area
                bag.add(temp.node.val);
                temp.state++;
                
            }else if(temp.state == 2){ // visiting the node in third time -> post area
                if(temp.node.right != null){
                    st.push(new pair(temp.node.right));
                }
                temp.state++;
            }else{
                st.pop();
            }
        }
        return bag;
      
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> bag = new ArrayList<>();
        if(root == null) return bag; // edge case check 
        Stack<pair> st = new Stack<>();
        st.push(new pair(root));

        while(st.size() > 0){
            // first read out the top element 
            pair temp = st.peek();
            if(temp.state == 0){ // visiting this node for the first time -> pre area
                if(temp.node.left != null){
                    st.push(new pair(temp.node.left));
                }
                temp.state++;
            }else if(temp.state == 1){ //visiting the node in the second time-> in area
                if(temp.node.right != null){
                    st.push(new pair(temp.node.right));
                }
                temp.state++;
            }else if(temp.state == 2){ // visiting the node in third time -> post area
                bag.add(temp.node.val);
                temp.state++;
                
                
            }else{
                st.pop();
            }
        }
        return bag;
      
    }
    
    
}
