import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

public class l002 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        if(st.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println(st.peek());
        }
    }
}
