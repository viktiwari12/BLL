import java.util.*;

import javax.swing.Painter;
public class p1 {
    public static class pair{
        
        int v;
        int w;
        pair( int v, int w){
            this.v = v;
            this.w = w;
        }
        
    }
    public static void main(String[] args) {
        int n= 9;
        int e =22;
        int U[] = new int [e];
        int V[] = new int [e];
        int W[] = new int [e]; 

    }
    public static void ConstructGraph(int n, int U[], int V[], int W[]){
        // Let's construct the Graph 
        ArrayList<pair> graph[] = new ArrayList [n]; 
        // array or arraylist of pair 

        for(int idx = 0; idx<graph.length; idx++){
            graph[idx] = new ArrayList<>();
        }

        // push all the edges 
        for(int i = 0; i <U.length; i++){
            int src = U[i], dest = V[i], wt = W[i];
            pair edge = new pair(dest, wt);
            graph[src].add(edge);
        }

        // Constructioon of Graph using HaSHMAP 
         HashMap<Integer, ArrayList<pair>> graph01 = new HashMap<>();
        // // map of Inteeger and List of Pairs 
        for(int idx = 0; idx<graph.length; idx++){
            graph01.put(idx, new ArrayList<>());
        }
        for(int i = 0; i <U.length; i++){
            int src = U[i], dest = V[i], wt = W[i];
            pair edge = new pair(dest, wt);
            graph01.get(src).add(edge);
        }

        

    }
    //Given a Graph, and a source node and a destination node. 
    // Figure out the total no of path exist and Print all the path 
    public static  int totalNoofPath( ArrayList<pair> graph[], int src, int dest, String psf, boolean vis[]){
        if(src == dest){
            System.out.println(psf);
            return 1; /// Found a path 
        }   
        vis[src] = true;
        int tp = 0; 
        for(pair nbr : graph[src]){
            tp += totalNoofPath(graph, nbr.v, dest, psf +src, vis);
        }
        vis[src] = false;
        return tp;
    }
    public static int find(ArrayList<pair> graph[], int src, int dest){
        for(int i = 0; i< graph[src].size(); i++){
            if(graph[src].get(i).v == dest) return i;
        }
        return -1;
    }
    public static void removeEdge(ArrayList<pair> graph[], int src, int dest){
        // Given a BiDirectional - Graph and an edge , remove the edge 
        // Wwhile removing an edge we have to remove it bidirectionally.
        // but to do so, we need to first figure out the position of the edge in the arraylist 
        int p1 = find(graph, src, dest);
        int p2 = find(graph, dest, src);

        graph[src].remove(p1); // remove the outgoing edge 
        graph[dest].remove(p2); // remove the incoming edge 

    }
    public static void removeVertex(ArrayList<pair> graph[], int vrtx){
        // Given a BiDirectional - Graph and an edge , remove the vertex from that graph  

        // Go at the vertex and remove all the edges assoicated with that edge 

       //  H/W Do it by urself 
    }

}
