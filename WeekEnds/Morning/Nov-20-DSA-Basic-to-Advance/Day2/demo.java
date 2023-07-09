public class demo {
    public static void main(String[] args) {
        // n = 5


        int n = 5;


        // first looop will be f0r inttrating over the rows, or just to go in each line 


        for(int row = 1; row <= n; row++){
            // Now for every row, I have to do some task 
            // for that, I will use another loop 

            for(int col = 1; col<= n; col++){
                System.out.print("*  ");
            }
            System.out.println();
        }

        for(int i = 0; i< n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }


        // row 1 ->  * 
        // row 2 ->  * * 
        // row 3 ->  * * * 
        // row 4 ->  * * * * 
        // row 5 ->  * * * * * 
    for(int row = 1; row <= n; row++){
        // Now for every row, I have to do some task 
        // for that, I will use another loop 

        for(int col = 1; col<= row; col++){
            System.out.print("*  ");
        }
        System.out.println();
    }




    

}
