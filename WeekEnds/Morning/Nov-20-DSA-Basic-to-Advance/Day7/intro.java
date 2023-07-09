class intro{
    public static void main(String[] args) {
        String str = "vvvviiiiikkkkkassshhhv";


        String ans = ""+ str.charAt(0);
        for(int i = 1; i< str.length(); i++){
            if(str.charAt(i) != str.charAt(i-1)){
                ans += str.charAt(i);
            }
        }


        System.out.println(ans);


        // Given a string : count the frequency of each character 
        // Every character is in samllercase and not allowed to use any other data structure

        // viiikkkkhaiiisdfasdga
        // 1-> 26 || 0-> 25

        int arr[] = new int [26]; // storing the frequency of every characters

        for(int i = 0; i< str.length(); i++){
            int pos = str.charAt(i) -'a';

            int prefrq = arr[pos];
            arr[pos] = (prefrq +1); // updateing the frequency 
        }


        int pos = ch -'a';
        System.out.println(arr[pos]); //0(1)



        // tell me the frequency of h -> 
        // tell me the frequency of a -> 
        // tell me the frequency of s -> 
        // tell me the frequency of g -> 
        // tell me the frequency of k -> 


    }
}