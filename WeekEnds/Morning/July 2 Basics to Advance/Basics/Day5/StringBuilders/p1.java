
import java.util.*;
public class p1 {
    public static void main(String[] args) {
        // String Buider 
        //StringBuilder sb = new StringBuilder();
        // another way to create a string builder 
        StringBuilder sb = new StringBuilder("Viaksh");

        // Some most used methods of stringBuilders 
        System.out.println(sb);
        int len = sb.length();
        // char 
        System.out.println(len);
        char ch = sb.charAt(3);
        System.out.println(ch);
        // we can override the character at any perticular index
        sb.setCharAt(2, 'x');
        System.out.println(sb);

        // we can also selete a character 
        sb.deleteCharAt(2);
        System.out.println(sb);

        // we can also delete a substring from the string/ part of the string 

        sb.delete(1, 3);

        System.out.println(sb);

        // we can conver a string builder into a string 

        String str = sb.toString();

    }
}
