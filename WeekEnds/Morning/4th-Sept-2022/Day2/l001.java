public class l001 {
    public static void main(String[] args) {

        // int x = 10;
        // int x5 = 10;
        // int x1 = 10;
        // int x2 = 10;
        // int x3 = 10;
        // int x4 = 10;



        // int arr1[] = new int[5];
        // int arr2[] = new int[4];
        // int arr3[] = new int[50];
        // int []arr4 = new int[6];


        // // int[][]vik = new int[5][];
        // // vik[0] = arr1;
        // // vik[1] = arr2;
        // // vik[2] = arr3;


        // int arr5[] = new int[1];
        // int arr6[] = new int[4];
        // int arr7[] = new int[9];
        // int arr8[] = new int[11];
        // int arr9[] = new int[14];
        // int arr10[] = new int[15];


        // int arr[][] = new int [7][4];


     
        // for(int []ele: arr){
        //     System.out.println(ele);
        //     System.out.println(ele.length);
        // }

        // int a[][][] = new int[2][4][5];


        int arr[][] = new int [4][4];
        int count = 1;
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                arr[i][j] = count++;
            }
        }
        System.out.println("Display the 2D Array");
        display2d(arr);
        zigZag(arr);
       rotate(arr);
    }
    //display the 2 day array 
    public static void display2d(int arr[][]){
        
        for(int []ele : arr ){
            display1d(ele);
            System.out.println();
        }
       
        
    }
    
    public static void display1d(int arr[]){
        for(int ele : arr){
            System.out.print(ele +" ");
        }
    }
    public static void displayrev(int arr[]){
        for(int i = arr.length -1; i>= 0; i--){
            System.out.print(arr[i] +" ");
        }
    }
    public static void zz(int arr[][]){
        for(int j = 0; j< arr.length; j++){
            if(j % 2 == 0){
                for(int i = 0;  i< arr.length ; i++){
                    System.out.print(arr[j][i] +" ");
                } 
            }else{
                for(int i = arr.length -1; i>= 0; i--){
                    System.out.print(arr[j][i] +" ");
                }
            }
        }
    }
    public static void zigZag(int arr[][]){

        System.out.println("Display the 2D Array in zingZag way ");
        
        boolean flag = true;
        for(int []ele : arr ){
            if(flag){
                display1d(ele);
                flag = false;
            }else{
                displayrev(ele);
                flag = true;
            }
            System.out.println();
        }  
    }

    public static void reverse(int arr[]){
        int i = 0, j = arr.length -1;
        while(i < j){
            swap1d(arr, i, j);
            i++;
            j--;
        }
    }
    // rotate a matrix
    public static void rotate(int arr[][]){
        System.out.println("Display the 2D Array in initally  way ");
      
        transpose(arr);
        for(int ele[] : arr){
            reverse(ele);
        }
        System.out.println("Display the 2D Array in rotated   way ");
    
        display2d(arr);
    } 

    public static void transpose(int arr[][]){

        System.out.println("Display the 2D Array in initally  way ");
        display2d(arr);
        for(int i = 0; i< arr.length; i++){
            for(int j = i+1; j< arr[i].length; j++){
                swap2d(arr, i, j);
            }
        }
        System.out.println("Display the 2D Array in transposed  way ");
    
        display2d(arr);
    }
    public static void swap2d(int arr[][], int i , int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    public static void swap1d(int arr[], int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

