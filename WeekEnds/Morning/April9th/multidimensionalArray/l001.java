public class l001 {
    public static void main(String[] args) {
        // the wosrt ans is MultiDimentional array is somethng with rows and Columns ->  X

        // 2-D / MultiDimentional arrays are ARRAYS of ARRAYS 

        // arrays 
       
        int a1[] = new int[5];
        char a2[] = new char [5];
        boolean  a3[] = new boolean[5];
        String a4[] = new String[5];
           // a5[1][3];
        int a5[][] = new int [5][10]; // 5 different array -> further that individual arrasy will be of 10 size 
        System.out.println("Main array " + a5);
        System.out.println("Size of the main array " + a5.length);
        for(int i = 0; i< a5.length; i++){
            System.out.println(" Value stored at " + i+ "th  position " + a5[i]);
            System.out.println("Size of the array stored at this position " + a5[i].length);
        }

        // int a6[][] = new int [][5];
        for(int i = 0; i< a5.length; i++){
            displayArray(a5[i]);
            System.out.println();
        }

    }
    public static void displayArray(int arr[]){
        for(int j = 0; j<arr.length ; j++){
            System.out.print(arr[j]+  " ");
        }
    }
}
