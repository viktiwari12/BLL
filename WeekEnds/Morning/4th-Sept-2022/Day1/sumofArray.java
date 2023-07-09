import java.util.*;

import java.io.*;
import java.lang.*;

public class sumofArray {
    public static void main(String[] args) {
        // make a scanner class 
        Scanner scn = new Scanner(System.in);
        int s1 = scn.nextInt(); // size of the first array 
        int a1[] = new int[s1];
        // take all the elements of the first arrray as inout 
        for(int i = 0; i<s1; i++){
            a1[i] = scn.nextInt();
        }

        int s2 = scn.nextInt(); // size of the second array 
        int a2[] = new int[s2];
        for(int i = 0; i<s2; i++){
            a2[i] = scn.nextInt();
        }


        // the real game begins here 

        // first step-> find the size of the sum/ans array 
        int s3 =( Math.max(s1, s2) +1); // Math.max-> return maximum of the two numbers 

        int sum[] = new int[s3];

        int i = s1-1, j= s2-1, k = s3-1, c = 0;
        while(i>=0 || j>=0){
            int num = c;
            if(i>=0) num += a1[i];
            if(j>=0) num += a2[j];
            // now I have got the number, and I have to do two things 
            int rem = num%10;
            int qu = num/10;
            sum[k] = rem;
            c = qu;
            // the most important -> update the pointers 
            i--;j--;k--;
        }
        if(c > 0) sum[k] = c;
        for(int ele : sum){
            System.out.print(ele + " ");
        }
        System.out.println();

        // reverse a array 

        int x = 0, y = sum.length-1;
        while(x <y){
            int temp = sum[x];
            sum[x] = sum[y];
            sum[y] = temp;

            x++;
            y--;
        }
        for(int ele : sum){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
