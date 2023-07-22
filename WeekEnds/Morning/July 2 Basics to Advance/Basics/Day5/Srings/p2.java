
import java.util.*;
public class p2 {
    public static void main(String[] args) {
        String s1 = "Vikash";
        String s2 = new String("Vikash");
    
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        boolean flag1 = (s1 == s2); // this just only compares reference 
        boolean flag = (s1.equals(s2)); // This Initially comapares the references, if match it returns true from here only. else It  will go and copmare the actual values at both the places and the return ans accordingly/
        System.out.println(flag);
    }
}
