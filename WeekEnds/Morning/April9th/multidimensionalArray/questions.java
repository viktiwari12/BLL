
public class questions {
    public static void main(String[] args) {
        char[][] arr = { { 'i',  },
                         { 'a', 'b', 'c', 'd','h' },
                         { 'e', 'f', 'g' },
                         { 'm', 'n', 'o', 'p' } };


        // int row = 0, col = 0; 
        // while(col<arr[row].length){
        //     while(row<arr.length){
        //         if(row<arr[row].length)
        //             System.out.print(arr[row][col] + "  "); 

        //         row++;
        //     }
        //     col++;
        //     row =0;
        //     System.out.println();
        // }
        System.out.println();
         rowWise(arr);
    }

    public static void rowWise(char arr[][]) {
        for(int row = 0; row <arr.length; row++){
            for(int col = 0; col< arr[row].length; col++){
                System.out.print(arr[col][row] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void colWise(char arr[][]) {
        for(int col= 0; col<arr[col].length; col++){
            for(int row = 0; row<arr.length; row++){
                if(arr[row].length < col)
                    System.out.print(arr[row][col] + "  ");
            }
            System.out.println();
        }
        System.out.println();


        // int row = 0, col = 0; 
        // while(col<arr[row].length){
        //     while(row<arr.length){
        //         System.out.print(arr[row][col] + "  "); 
        //         row++;
        //     }
        //     col++;
        //     System.out.println();
        // }
        // System.out.println();

    }

    public static void SpiralRowWise(int arr[][]) {

    }

    public static void SpiralColWise(int arr[][]) {

    }
}
