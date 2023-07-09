import java.util.*;

public class l001 {
    public static void main(String[] args) {
        // Let's Learn about strings

        // In java, Strings behave complete differently from any other Programing language. 

        // String -> Collection of characters is called String 

        String str = "Vikash";

        String str2 = "VIkash Tiwary";


        // How to take any String as Input 
        Scanner scn = new Scanner(System.in);

        //String st = scn.next(); // .next() -> only reads till it's encounters " " for the first time 
        //System.out.println();
        String st = scn.nextLine();
        System.out.println(st);


        // reading the characters of the Strings 


        // .chatAt(idx);

        char ch0 = st.charAt(0);

        char ch1 = st.charAt(1);
        char ch2 = st.charAt(2);
        char ch3 = st.charAt(3);
        char ch4 = st.charAt(4);
        System.out.println(ch0);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);


        for(int idx = 0; idx<st.length(); idx++){
            System.out.println(st.charAt(idx));
        }

        // NOTE :- We can't use for each Loop in strings 


    }
}
