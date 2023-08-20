import java.util.*;
public class p3 {
    
     public class edge{
        int v;
        int w;
        public edge( int v, int w){
            
            this.v = v;
            this.w = w;
        }
    }
    public static void main(String[] args) {
    }
    public static int allPath(ArrayList<edge>graph[], int src, int dest, boolean vis[], String psf){
        // base case 
        if(src == dest){
            System.out.println(psf);
            return 1;
        }

        // mark the current node as the visited node 
        vis[src] = true;
        // Explore for all the nibhours, and check if there is any unvisited neibhour 
        int ans = 0;
        for(edge ed : graph[src]){
            int nbr = ed.v;
            if(vis[nbr] == false) {// !vis[nbr]
                ans += allPath(graph, nbr, dest, vis, psf+src);
            }   
        }
        // once all the neibhour has been explored, unmark the current node and return the ans 
        vis[src] = false;
        return ans;

        // one hw-> try stotring all the paths in a arraylist and return the array list 
    }
}