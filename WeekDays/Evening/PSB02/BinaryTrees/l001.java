
import java.util.*;
public class l001 {
    public static class pair{
        node root;
        int lvl;
        pair(node root, int lvl){
            this.root= root;
            this.lvl = lvl;
        }
    }
    public static class node{
        int val;
        node left;
        node right;
    }
    public static int lm = 0;
    public static int rm = 0;
    public static void main(String[] args) {
        int width = rm -lm;
    }
    public static void dfs(node root, int curr){
        if(root == null) return;


        lm = Math.min(lm, curr);
        rm = Math.max(rm, curr);
        dfs(root.left,curr-1);
        dfs(root.right, curr+1);
    } 
    public static void verticalOrder(node root, HashMap<Integer, ArrayList<Integer>>hm , int curr){
        if(root == null) return;

        // when coming here I know my current vertical order 

        // first check, if the current vertical already exist in the hashmap or not? 
        int cl = curr + lm;
        if(!hm.containsKey(cl)){
            hm.put(cl, new ArrayList<>()); // first create a arraylIst 
        }
            
        hm.get(cl).add(root.val);
        verticalOrder(root.left, hm, curr -1 );
        verticalOrder(root.right, hm, curr +1 );
       
    }
     public static void verticalOrderHor(node root, HashMap<Integer, ArrayList<Integer>>hm , int curr){
        
        Queue<pair> q = new ArrayDeque<>();
        q.offer(new pair(root, curr));
        while(q.size()> 0){
            pair temp = q.remove();
            int cl = temp.lvl + lm;
            if(!hm.containsKey(cl)){
                hm.put(cl, new ArrayList<>()); // first create a arraylIst 
            }
            hm.get(cl).add(root.val);
            if(temp.root.left != null) q.offer(new pair(temp.root.left, cl -1));
            if(temp.root.right != null) q.offer(new pair(temp.root.right, cl +1));
        }
     }
}
