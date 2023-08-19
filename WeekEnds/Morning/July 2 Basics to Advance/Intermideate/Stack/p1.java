import java.util.*;
public class p1 {
    public static void main(String[] args) {
        // Syntax of the stack 
        Stack<Integer> st = new Stack<>();

        // Some operations on stack DS 

        // Adding element into the stack
        System.out.println(st);
        st.push(10);
        System.out.println(st);
        System.out.println(st.peek());
        st.push(20);
        System.out.println(st);
        System.out.println(st.peek());
        st.push(30);
        System.out.println(st);
        System.out.println(st.peek());
        st.push(40);
        System.out.println(st);
        System.out.println(st.peek());
        st.push(50);
        System.out.println(st);
        System.out.println(st.peek());

        //NOTE: we can only read the element using .peeK() method

        // Now let's say we want to remove the element from the stack/
        // Here we can only remove the elemet at the top of the stack 
        System.out.println("=========================================");
        System.out.println(st);
        st.pop();
        System.out.println(st); 


        // Here is a catch, we can read the removed element also. 

        int x = st.pop();
        System.out.println(x);
        System.out.println(st);

        // we can check the size of the stack 
        System.out.println(st.size());

        // a method to check, if stack is empty or not 

        System.out.println(st.isEmpty());
        System.out.println("----------------------------------");

        System.out.println(validPranthesis("(a+b) + ((c+ d))"));
    }
    public static boolean validPranthesis(String str){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i <str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ')'){
                st.push(ch);
            }else{
                if(st.peek() == '(') return false;

                while(st.size() > 0 && st.peek() != '(') {
                    st.pop();
                }

                st.pop();
            }
        }

        return true;
    }
    public static boolean balancedPranthesis(String str){
        Stack<Character> st = new Stack<>();

        for(int i = 0; i <str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);
            else if(ch == ')' || ch == '}' || ch == ']'){
                if(ch == ')'){
                    if(st.peek() == '(')
                        st.pop();
                    else return false;
                }else  if(ch == '}'){
                    if(st.peek() == '{')
                        st.pop();
                    else return false;
                }else  if(ch == ']'){
                    if(st.peek() == '[')
                        st.pop();
                    else return false;
                }
            }
        }
        return st.isEmpty();

    }
    public static ArrayList<Integer> NGTL(int arr[]){
        ArrayList<Integer> ans = new ArrayList<>();

        ans.add(-1);
        for(int i = 1; i<arr.length; i++){
            int j = i-1;
            while(j>=0){
                if(arr[j] > arr[i]){
                    ans.add(arr[j]);
                    break;
                }
                j--;
            }
            if(j == -1) ans.add(j);
        }
    }
}
