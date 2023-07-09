
//  https://www.w3schools.com/java/java_ref_string.asp
public class it2 {
    public static void main(String[] args) {
        // String is nothing but a collection of characters plaaced btw ""


        // String str = "AFSK12345*()$%";

        // // some unctions of the strings 

        // // We can figure out the length of the string
        // int len = str.length(); 

        // // Indexing of characters in the string starts from 0 like arrays 
        // // we can access the characters of the string 


        // char ch = str.charAt(0);
        // for(int i = 0; i< str.length(); i++){
        //     System.err.print(str.charAt(i) + " ");
        // }


        // // stbstring || if you remember the subarray -> substring is exactly same 

        // String sb = str.substring(2, 5); // char at st idx will be counted but the char at the ending idx will not be counted
        
        // //  characters at idx 2 3 4 

        // String sb2 = str.substring(2); // it will print from starting idx till the end of the string 


        // // converting from one case to another 

        // // you have a string which is in lowercase 

        // String st2 = str.toUpperCase(); // "Vikash Tiwary" -> "VIKASH TIWARY"

        // String st3 = str.toLowerCase(); // "   VIKASH TIWARY   " -> "vikash tiwary"

        // String st4 = str.trim();


        String str = "Vikash";

        String str2 = "Vikash";

        String st3 = new String("Vikash");

        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(st3.hashCode());


        if(str == st3){ // these comparision are done btw the references stored in the stack 
            System.out.println("Strings are same ");
        }else{
            System.out.println("Strings are different");
        }
        

        //In strings there is another sort of comparision i.e .equals() -> which compare litterally word fby word 

        if(str.equals(st3)){
            System.out.println("Strings are same ");
        }else{
            System.out.println("Strings are different");
        }

       // System.out.println(System.identityHashCode(st3));








       
    }
}
