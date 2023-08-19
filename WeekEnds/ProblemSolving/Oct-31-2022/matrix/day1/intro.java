package day1;
class intro{
    public static void main(String[] args) {
        
    }
    public static void colDisplay(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;

        boolean tob = false; // topToBottom
        for(int col = 0; col <n; col++){
            if(tob){
                for(int row = 0; row <m; row++){
                    System.out.print(arr[row][col] + "  ");
                }
                tob = false;
            }else{
                for(int row =m -1; row>=0 ;row--){
                    System.out.print(arr[row][col] + "  ");
                }
                System.out.println();
                tob = true;
            }   
        }
    }

    public static void spiral(int arr[][]){

        int r = arr.length;
        int c = arr[0].length;

        int sr = 0, sc = 0, er = r-1, ec = c-1;

        while(){
            // print top wall 
            // Here row will be constant & Col will vary from sc-> ec

            for(int col = sc;count < r* c &&  col<=ec; col++){
                System.out.print(arr[sr][col]);
            }
            //Update the row
            sr+= 1;

            // print right wall 
            for(int row = sr; row<=er; row++){
                System.out.print(arr[row][ec]);
            }
            ec-= 1;

            // print bottom  wall 
            for(int col = ec; col>=sc; col--){
                System.out.print(arr[er][col]);
            }   

            er -= 1;

            // print left wall

            for(int row = er; row>=sr; row--){
                System.out.print(arr[row][sc]);
            }
            sc += 1;
        }


        //  4* 4
       // 4* 5
       // 5 * 4 
        //5 * 5 


    }
}