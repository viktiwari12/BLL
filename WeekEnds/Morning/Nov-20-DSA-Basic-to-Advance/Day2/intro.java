public class intro {
    public static void main(String[] args) {

        // Task is to Wish me 5 times 
      System.out.println("Hey Vikash, Good Moring");
      System.out.println("Hey Vikash, Good Moring");
      System.out.println("Hey Vikash, Good Moring");
      System.out.println("Hey Vikash, Good Moring");
      System.out.println("Hey Vikash, Good Moring");


      // Now here comes the concept of Loops 
      //- Do the task once, and make it do on auto pilot till certain condions 

      // There are 3 main elemets of any type of loop :- Intitlation (of the condition) -> Condition Check -> Work -> Updation Of Condition 

      /* Types of Loops 
       1) For Loop 
       2) While Loop 
       3) Do While 
       4) for each Loop;(This we will study post learning Arrays & ArrayList)
    */

        // While Loop 

        // Init.. of.. condition... 
        // while(true){

        //     // work 


        //     // update the condition 
        // }

        int count = 1; // Initilation of condition 

        while(count <= 5){
            // work 
            System.out.println("Hey Vikash, Good Moring");

            // update my work 

            count += 1;


           count++;

            



        }


        // Check if a number is prime or not  check from (1, n) -> 1 & n are't included
        int n = 10;
        int curr = 2; // initaliation
        boolean flag = true; // assumed it is prime 

        while(curr < n){ // condition check 
            // work 

            if(n % curr == 0){
                flag = false; // false-> maans not prime 
                break; // it will break the loop here only no matter what
            }
            curr += 1;
        }

        if(flag == true){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }

        // Prit all prime till n -> 100 ;


      

        for(int i = 1; i <= 100; i++){

            curr = 2;
            // check if I is prime or  not 
            while(curr < n){ // condition check 
                // work 
    
                if(n % curr == 0){
                    flag = false; // false-> maans not prime 
                    break; // it will break the loop here only no matter what
                }
                curr += 1;
            }
    
            if(flag == true){
                System.out.println(i);
            }
        }


        


        // for loop 

        // In while loop, we were doing Initaliation, updation, and Condition check in 3 different lines 
        // In for loop, all theree can be done in just one single line. 


        for(int x = 1; x<= 5; x++ ){
            System.out.println("hey What's up man? ");
        }
        

    }
}
