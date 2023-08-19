import java.util.*;

public class l002 {
    public static void main(String[] args) {
        // Print Decodings/ Encoding 


        // Given a string of number where each number can be mapped to a character (a -> z | 1 -> 26 )
        // Decode all the possible combination of the numbers 

        fun("12345",  0, "");// "123456"
        // 1 -> a 2 -> 3 -> c 4-> d
        //12 -> l 
        // 1 -> a 23 -> x
    }
    public static void fun(String str, int curr, String psf){
        // base 
        if(curr == str.length()){
            System.out.println(psf);
            return;
        }

        if(str.charAt(curr) -'0' == 0) return;

        // fist call blindly 
        fun(str, curr+1, psf + (char)((str.charAt(curr) -'0') + 'a') ); // 2-> B
        if(curr +1 <str.length()){
            // for the second call -> can we put second call Blindly??
            int  ch1 = str.charAt(curr) -'0';
            int  ch2 = str.charAt(curr +1) - '0';
            int num = (ch1 *10) +ch2 ;
            if(num<= 26 ){
                fun(str, curr+2, psf +(char) ('a' + num) );
            }
            
        }
    }
}
