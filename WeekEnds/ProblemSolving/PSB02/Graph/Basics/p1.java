import java.util.*;

public class p1 {
    public class edge{
        int u;
        int v;
        int w;
        public edge(int u, int v, int w){
            this.u = u;
            this.v = v;
            this.w = w;
        }
    }
     public class edge2{
        
        int v;
        int w;
        public edge2( int v, int w){
            
            this.v = v;
            this.w = w;
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Lets' take the information of graph as Input from the user 
        // First take, the no of the nodes and the edges 
        System.out.println("Enter The total no of Nodes ");

        int n = scn.nextInt();
        System.out.println("Enter The total no of Edges ");

        int ed = scn.nextInt();
        // Now take the Information of all the all the edges as input from user

        int src[] = new int[ed];
        int dest[] = new int[ed];
        int wt[] = new int[ed];

        System.out.println("Now Enter the Information of all the Edges");

        for(int i = 0; i< ed; i++){
            System.out.println("Enter the Source Node of the " + i+"th  Node" );
            src[i] = scn.nextInt();
            System.out.println("Enter the Dest Node of the " + i+"th  Node" );
            dest[i] = scn.nextInt();
            System.out.println("Enter the Weight of the " + i+"th  Node" );
            wt[i] = scn.nextInt();
        }
        display(src);
        display(dest);
        display(wt);

    }
    public static int[][] adjMtrx(int src[], int dest[], int wt[] , int n, int ed){
        // Considering this a directed/unidirectional  graph 
        int graph[][] = new int[n][n];
        for(int i = 0; i<ed; i++){
            graph[src[i]][dest[i]] = wt[i];
            /*
             * int source = src[i];
             * int destination = dest[i];
             * int weight = wt[i];
             * graph[source][destination] = weight;
             * 
            */

            // In case if it's a bidirectional Graph, just add one more line and your work is done 
            // graph[destination][source] = weight ;
        }

    }
    // We can take a array of arraylist 
    // we take take a arraylist of arraylist 
    // we can tale a hashmap of Int -> Arraylist 
    public static void constructGraph(int src[], int dest[], int wt[] , int n, int ed ){
        ArrayList<edge>graph[] = new ArrayList [n];
         ArrayList<edge2>graph2[] = new ArrayList [n];
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
            graph2[i] = new ArrayList<>();
        }
        // In case of Bidirectional Graph
        for(int i = 0; i<ed; i++){
            edge temp = new edge(src[i], dest[i], wt[i]);
            graph[src[i]].add(temp);
        }
        // In case of Bidirectional Graph -> Little optmised 
        for(int i = 0; i<ed; i++){
            edge2 temp = new edge2(dest[i], wt[i]);
            graph2[src[i]].add(temp);
        }

        // In case of Unweighted graph 
        ArrayList<Integer> graph3[] = new ArrayList [n];
        for(int i = 0; i<graph3.length; i++){
            graph3[i] = new ArrayList<>();
        }
        for(int i = 0; i<ed; i++){
            graph3[src[i]].add(dest[i]);
        }
    }
    public static void display(int arr[]){
        for(int ele : arr){
            System.out.print(ele + "   ");
        }
        System.out.println();
    }

    
}
