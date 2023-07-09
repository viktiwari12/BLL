
import java.util.*;
public class l001 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // we can add an element into the stack 
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);


        // how do we read the element 
        // 1st way is -> you can simpally read the element 
        int len = st.size();
        System.out.println(len);
        System.out.println(st.peek());
        len = st.size();
        System.out.println(len);
        // another way 
        System.out.println(st.pop()); // this will not only read, but at the same time it will extract it out from top 

        // we can see the total no of elements/size of the stack

        len = st.size();
        System.out.println(len);

        boolean flag = st.isEmpty();
        System.out.println(flag);

    }
}
