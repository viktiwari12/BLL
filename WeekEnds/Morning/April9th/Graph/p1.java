
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // First we need the info of Nodes and edges 
        System.out.println("Enter the no of Nodes");
        int n= scn.nextInt();
        // make three arrays of  size
        

         System.out.println("Enter the no of Edges");
        int e = scn.nextInt();
        int U[] = new int [e];
        int V[] = new int [e];
        int W[] = new int [e]; // this one os optional, in case it's a unweighted graph it's not required 

        for(int i = 0; i< e; i++){
            System.out.println("Enter Source");
            int u = scn.nextInt();
            U[i] = u;
            System.out.println("Enter Destination");
            int v = scn.nextInt();
            V[i] = v;
            System.out.println("Enter Weight");
            int w = scn.nextInt();
            W[i] = w;

        }
    }
}
