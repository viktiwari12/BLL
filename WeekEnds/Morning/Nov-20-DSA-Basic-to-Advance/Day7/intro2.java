

public class intro2 {
    public static void main(String[] args) {
        /*System.out.println('a' - 'a');
        System.out.println('b' - 'a');
        System.out.println('c' - 'a');
        System.out.println('d' - 'a');
        System.out.println('e' - 'a'); */


        // Let's Move to StringBuilder 

        StringBuilder sb = new StringBuilder(); // THis is creating a new StringBuilder with an initial Capacity of 16 character character

        StringBuilder sb2 = new StringBuilder("Vikash");


        //Length of the StringBuilder 

        int len = sb.length();


        // Reading the charater of stringbuilder 


        char ch = sb.charAt(0);

        // in case you want to read the character by character 

        for(int i = 0; i<sb.length(); i++){
            System.out.println(sb.charAt(i));
        }

        // set a character-> Overrite 


        sb.setCharAt(3, 'b');

        // delete a charater from any given Index 

        sb.deleteCharAt(5);


        // convert a stringBuilder to a string 


        String str = sb.toString();


        
    }
}
