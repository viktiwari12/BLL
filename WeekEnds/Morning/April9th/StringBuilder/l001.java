
import java.util.*;
public class l001 {
    public static void main(String[] args) {
        // Till now we have learnt Strings 

        /*  Limitations of strings ? 
                Imutable 
                Can't replace any characters 
                and may more 
        */

        /*
         * To deal with the above issue we have something StringBuilders 
         */

         StringBuilder sbb = new StringBuilder(); // this will create an empty string 

         StringBuilder sb = new StringBuilder("Vikash");

         // Some Most useful Methods of StringBuilders 

         // Length of the StringBuilder -> Basicaly it returns the character count 

         int len = sb.length();
         System.out.println("Lenght of the StringUilder is  " + len);

         // we can read the characters of stringBuilders indiviidually 

         for(int idx = 0; idx< len; idx++){
            System.out.print(sb.charAt(idx)+ "  ");
         }
         System.out.println();


         // Now comes the Interesting Part
         // we can set any character at any particular index 


         sb.setCharAt(3, 'I');  // this we can't do in the strings 
         System.out.println(sb);


         // we can also Delete the character at any given Index 

         sb.deleteCharAt(3); 
         System.out.println(sb);

         // we can also delete some set of characters 

         sb.delete(2, 4);  // Here starting Index is included but Ending Index is not 
         System.out.println(sb);

        sb = new StringBuilder("Vikash");

        // we can replace also the characters of the substring 

        sb.replace(0, 2, "ai");
        System.out.println(sb);


        //  we can convert the stringBuilder into string as well 

        String str = sb.toString();

         System.out.println(toggel("ViKaSh"));
        
    }

    // Toggel String 

    public static String toggel(String str){
        // Given a string with Upper case and lower cases

        // convert All the lowecase characters to Upppcase 
        // and convert all the UpperCase characters to LoweeCase
        
        
        // ViKaSh -> vIkAsH

        // 0 1 2 3 4 5 6 7 8 9 
        // A B C D E F G H I J K L M N O P Q R S T U V W X Y Z 
        System.out.println(str);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i< str.length(); i++){
            // first check if the curr char is upper case or Lowercase 
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                int len = str.charAt(i) - 'A';
                char ch = (char)('a' + len); // converted the Uppercase in Lowecase 
                sb.append(ch);
            }else{
                int len = str.charAt(i) - 'a';
                char ch = (char)('A' + len); // converted the Uppercase in Lowecase 
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
