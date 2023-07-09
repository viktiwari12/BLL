package Day17.Stack;

import java.util.*;
public class ngs {
    public static void main(String[] args) {
        int arr[] = {2,5, 9, 3, 1, 12, 6, 8, 7};
        for(int i = 0; i<arr.length; i++){
            System.out.print(" " + arr[i] +  "   ");
        }
        System.out.println();
        ngtl01(arr);
    }
    public static void ngtl(int arr[]){
        for(int i = 0; i<arr.length; i++){
            boolean flag = false;
            for(int j = i-1; j>=0; j--){
                if(arr[j]>arr[i]){
                    flag = true;
                    System.out.print(" " + arr[j] +  "   ");
                    break;
                }
            }
            if(!flag) System.out.print(-1 + "   ");
        }
    }
    public static void ngtl01(int arr[]){
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<arr.length; i++){
            while(!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                System.out.print(-1 + "   ");
            }else{
                System.out.print(" " + st.peek() +  "   ");
            }
            // push the current element in the stack 
            st.push(arr[i]);
        }
    }
    public static void ngtr(int arr[]){
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length -1; i>=0; i--){
            while(!st.isEmpty() && st.peek() < arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                System.out.print(-1 + "   ");
            }else{
                System.out.print(" " + st.peek() +  "   ");
            }
            // push the current element in the stack 
            st.push(arr[i]);
        }
    }
    public static void nstl(int arr[]){
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i<arr.length; i++){
            while(!st.isEmpty() && st.peek() > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                System.out.print(-1 + "   ");
            }else{
                System.out.print(" " + st.peek() +  "   ");
            }
            // push the current element in the stack 
            st.push(arr[i]);
        } 
    }
    public static void nstr(int arr[]){
        Stack<Integer> st = new Stack<>();

        for(int i = arr.length -1; i>=0; i--){
            while(!st.isEmpty() && st.peek() > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                System.out.print(-1 + "   ");
            }else{
                System.out.print(" " + st.peek() +  "   ");
            }
            // push the current element in the stack 
            st.push(arr[i]);
        }
    }
}
