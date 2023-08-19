
import java.util.*;
public class l002 {
    static class edge{
        int v;
        int w;
        edge(int v, int w){
            this.v = v;
            this.w = w;
        }
    }
    public static void addEdge(ArrayList<edge> graph[], int u, int v, int w){
        graph[u].add(new edge(v, w));
        graph[v].add(new edge(u, w));
    }
    public static void constructGraph(int n){
        // the very first step
        // Create a array of Arraylist of edges 
        ArrayList<edge> graph[] = new ArrayList[n];

        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // now let's start adding edges here in the graphs 
        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 6, 10);

        addEdge(graph, 1, 5, 20);
        addEdge(graph, 1, 2, 5);

        addEdge(graph, 2, 4, 50);
        addEdge(graph, 2, 3, 50);

        addEdge(graph, 3, 4, 30);

        addEdge(graph, 5, 6, 10);
        addEdge(graph, 5, 7, 20);
        addEdge(graph, 5, 8, 20);

        addEdge(graph, 7, 8, 20);

       // printGraph(graph);
       PrintALlPath(graph, 1, 8, new boolean[n], "");
    }
    public static void printGraph(ArrayList<edge> graph[]){
        int u = 0;
        for(ArrayList<edge> li : graph){
            System.out.print( "{  " + u);
            for(edge ed : li){
                System.out.print("(  " + ed.v + " ->  " +ed.w + " ), ");
            }
            System.out.println ( "}  ");
            u++;

        }
    }
    public static void PrintALlPath(ArrayList<edge>graph[], int src, int dest, boolean vis[], String psf){
        // base case wiull figure out 
        if( src == dest){
            System.out.println(psf);
            return;
        }

        vis[src] = true;
        for(edge ed :graph[src]){
            int nbr = ed.v;
            if(!vis[nbr]){
                PrintALlPath(graph, nbr, dest, vis, psf+src);
            }
        }
        vis[src] = false;
    }

    // Writre a Program to find an edge 


    // Write a program to delete an edge 


    //  Write a program to delete a vertex;
    public static void main(String[] args) {
        int n = 9;
        constructGraph(n);

    }
}
