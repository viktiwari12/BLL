

public class p2 {
    public static void main(String[] args) {
        char arr[][] = new char [5][5];
        char ch = 'a';
        for(int r = 0; r<5; r++){
            for(int c = 0; c<5; c++){
                arr[r][c] = ch++;
            }
        }
        System.out.println("Main Array ");

        display(arr);
        System.out.println();
        System.out.println("RowWise");
        rowWise(arr);
        System.out.println();
        System.out.println("ColWise");
        colwise(arr);
        System.out.println();

        System.out.println("RowWise ALternet");
        rowalt(arr);
        System.out.println();
        System.out.println("ColWise  Alternate");
        colAlt(arr);
        System.out.println();
        
    }
    public static void display (char arr[][]){
        // For every Row -> print all the columns
        int  row = arr.length;
        int col = arr[0].length; 
        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                System.out.print(arr[r][c] + "  ");
            }
            System.out.println();
        }
    }
    public static void rowWise(char arr[][]){
        // For every Row -> print all the columns
        int  row = arr.length;
        int col = arr[0].length; 
        for(int r = 0; r<row; r++){
            for(int c = 0; c<col; c++){
                System.out.print(arr[r][c] + "  ");
            }
            
        }
    }
    public static void colwise(char arr[][]){
        // For every Column print all the rows 
        int row = arr.length;
        int col = arr[0].length; 
        for(int c = 0; c<col; c++){
            for(int r = 0; r<row; r++){
                System.out.print(arr[r][c] + "  ");
            }
           
        }
    }
    public static void colAlt(char arr[][]){
        int row = arr.length;
        int col = arr[0].length; 
        boolean tb = true;
        for(char c = 0; c<col; c++){
            if(tb){
                for(int  r = 0; r<row; r++){
                    System.out.print(arr[r][c] + "  ");
                }
            }else{
                for(int r = row-1; r>=0; r--){
                    System.out.print(arr[r][c] + "  ");
                }
            }
            tb = (!tb);
           
        }
    }
    public static void rowalt(char arr[][]){
        int row = arr.length;
        int col = arr[0].length; 
        boolean ltr = true;
        for(char r = 0; r<row; r++){
            if(ltr){
                for(int  c = 0; c<col; c++){
                    System.out.print(arr[r][c] + "  ");
                }
            }else{
                for(int  c = col-1; c>=0 ; c--){
                    System.out.print(arr[r][c] + "  ");
                }
            }
            ltr = (!ltr);
            
        }
    }
}
