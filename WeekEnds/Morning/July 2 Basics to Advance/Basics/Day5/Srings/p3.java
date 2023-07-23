
import java.util.*;
public class p3 {
   public static void main(String[] args) {
        // GIven a stringend
        // Print all the palindorimic substring 
        String str = "osgnddldagankf";
        // Generate all the substring 
        ArrayList<String> al = new ArrayList<>();
        for( int st  = 0; st< str.length(); st++){ // this to define the starting position 
            for( int end = st; end<str.length(); end++){ // this is to define the ending position
                if(isPalindrome(str, st, end)){
                    al.add(printSubstirng(str, st, end));
                    //System.out.println();
                }
            }
        }
        System.out.println(al);
   } 
   public static String  printSubstirng(String str, int st, int end){
       StringBuilder x = new StringBuilder();
        for(int idx = st; idx<= end; idx++){
            x.append(str.charAt(idx));
            //System.out.print(str.charAt(idx));
        }
        return x.toString();
   }
   public static boolean isPalindrome (String str , int i, int j ){
        // The purpose of this function is just simpally return weather the collections of character from i to j is sustring or not
        int x = i, y= j;
        while(x<y){
            char ch1 = str.charAt(x);
            char ch2 = str.charAt(x);
            if(ch1 != ch2) return false;

            x++;
            y--;
        }
        return true;
   }
}
