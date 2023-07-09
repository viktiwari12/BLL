
import java.util.*;
public class l001 {
    public static void main(String[] args) {
        // Let's Start Learning Stacks.


        // How to Initilise/Create stack 

        Stack<Integer> st = new Stack<>();


        // Adding elements into the stack 

        st.add(10);
        st.add(20);
        st.add(30);
        st.add(40);

        // How to check the total no of elements in the stack 

        int size = st.size();

        System.out.println(size);

        // Reading/ Looking at the top of the stack 


        int ele = st.peek();
        System.out.println(ele);

        System.out.println(st);


        // Let's say I want to remove the element of the stack 

        ele = st.pop(); // This .pop() method does 2 thing, it will remove the top element from the stack at the same time we can read the removed element also. 
        System.out.println(ele);
        System.out.println(st);

        // to check if the stack contains any element or not 

        size = st.size(); // if this turns out to be 0 -> stack has no element 

        boolean flag = st.isEmpty();
        if(balanceParanthesis()){
            System.out.println("Balanced Paranthesis ");
        }else{
            System.out.println("UnBalanced Paranthesis ");
        }

    }
    public static boolean ValidParanthesis(){
        /*
         * Algorith 
         * Itetrate in the string 
         *         if the is curr char is anything except for ')' push it into the stack 
         * 
         *        if the curr char is ')'
         *              check if the top of the stack is '(' 
         *                      if Yes return false; 
         *  
         *          if not, 
         *               wipe out everything from the stack until u get the '(' on the top of the stack and wipe out that openng bracket too. 
         * 
         * 
         *      at the nd return true;
         */

        String str =  "a + b + ( c+d)";
         Stack<Character> st = new Stack<>();

         for(int i = 0; i<str.length(); i++){
            char curr = str.charAt(i);

            if(curr == ')'){
                if( !st.isEmpty() && st.peek() == '(') return false;
                else{
                    while(!st.isEmpty() && st.peek() != '('){
                        st.pop();
                    }
                    // the above loop will only pop till openng bracket, not the opening bracket 
                    st.pop(); // this line will make sure the opening bracket is also poped
                }
                
            }else{
                st.push(curr);
            }
         }

         return true;
    }
    // Balanced paranthesis 

    // Given a string which will contains different types of paranthesis 
    // FIgure out if there exist, a coorsponding closing parantheis for every respective opening paranthesis

    

    // -> Count the no of o1 o2 o3 
    // -> c1 c2 c3 

    public static boolean balanceParanthesis(){
        String str =  "{ a+ [ (b-c) *  {(d+e ) / f]} *() g}";
        Stack<Character> st = new Stack<>();
        for(int i = 0; i< str.length(); i++){
            char ch =str.charAt(i);

            if(ch == '(' ||ch == '[' || ch == '{' ) st.add(ch);
            
            else if(ch == ')') {
                if(st.peek() != '(') return false;
                else st.pop();
            }
            else if(ch == ']'){
                 if(st.peek() != '[') return false;
                 else st.pop();
            }
            else if(ch == '}'){
                 if(st.peek() != '{') return false;
                 else st.pop();
            }
        }
        return true;

    }
}
