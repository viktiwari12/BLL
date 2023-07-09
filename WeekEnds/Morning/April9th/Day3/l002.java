// Nested Loops 

public class l002 {
    public static void main(String[] args) {
        // loop inside a loop 


        // there are 10 students in the class -> go and count the total no of notebooks they all have 

        /* 
        for(every students ){
            //count no of notebooks
            int count = 0;
            while(notebook is in the bag){
                count++;

                take out notebook from bag
            }
        }

        */

        /*for - for 

        while - while 

        for -while
        while -for  */

       

        for(int std = 1; std<=10; std++){
            int count = 0;

            while(containsNotebook){
                count++;
            }
        }

        // 2nd case 

        for(int std = 1; std<=10; std++){
            int count = 0;
            if(containsNotebook){
                count++;
            }
        }

        // 
        int std = 1;
        while(std++ < 10){
            int count = 0;
            while(containsNotebook){
                count++;
            }

        }
    }
}
