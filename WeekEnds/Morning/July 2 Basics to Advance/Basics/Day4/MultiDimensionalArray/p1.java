
import java.util.*;

public class p1 {
    public static void main(String[] args) {
        /*
         * int a1[];
         * char a2[];
         * String a3[];
         * boolean a4[];
         */

        int []arr[] = new int[5][];

        

        System.out.println(arr);
        

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + "  ");  // default vaue of Integer is 0
            arr[i] = new int[i+1];
            System.out.print(arr[i] + "  ");
            System.out.println(arr[i].length);
        }
    }

}
