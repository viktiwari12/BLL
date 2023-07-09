import java.util.*;
public class l005 {
    public static void main(String[] args) {
        
    }
    public static int fun(String str){
        Stack<Character> st = new Stack();

        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            if((ch == ')' && (st.isEmpty() || st.peek() == ')') )|| ch == '('){ // if u don't uderstand this, try revisiong boolean algebra concepts 
                st.push(ch);
            }else{
                st.pop();
            }
        }
        return st.size();
    }
}
