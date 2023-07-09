package Day3;

public class loops {
    public static void main(String[] args) {
        /*// Let's start learning loops 

        // We have a guest -> Greet him/her

        System.out.println("Hello Dear");

        // Greet 5 times 
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");



        // Greet 10 times

        System.out.println("Hello Dear");
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");
        System.out.println("Hello Dear");

        // Greet 100 times 
         // may be we can explecitly write it 100 times 


         // Greet 1k times 

         // Greet 100k times 



         // to optmise this we use loops 



         // There are three pillors of loops 


         // Initilation of the condition 

         // Proper check of the truth of the condition 

         // updation of the condition 



         // We have majorly three types of loops 
         /*
          * for loop 
          * while Loop 
          * do while loop 
          */

        //   for( initilation ; condtion ; update){
            // task;
        //   } */
        

        // for(int ntrl = 1; ntrl<=10; ntrl++){
            // System.out.println(ntrl);
        // }

        // System.out.println("Hey Guys! WHat's up? ");

        // int cond = 1; 
        // for(; cond <= 10; cond++){
            // System.out.println(cond);
        // }

       // we also also write three of the things very seperately 

        // int x = 1; 
        // for(;x<= 20;){
            // System.out.println(x);

            //update here as well 

            // x++;
        // }


        // Let's do one question based on this 

        int n = 100;
        // given n -> figure out if it's a prime no or not?
        boolean flag = false;
        for( int i = 2; i<n; i++){
           if(n % i == 0){
            // at this position I am able to say it's not a prime no
            System.out.println("Not Prime");
            flag = true;
            break;
           }  
        }

        // declear it's a prime no only when when the if condition was not executed 
        if(flag == false)System.out.println("Prime");

        
    }
}
