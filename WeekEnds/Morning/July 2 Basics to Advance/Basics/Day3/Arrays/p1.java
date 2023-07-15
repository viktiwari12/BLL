
public class p1 {
    public static void main(String[] args) {
        // Let's say w want to store 5 diffrent Integer values 

        int a = 10;
        int b = 20; 
        int c = 30; 
        int d = 40; 
        int e = 50;

        // for 10 diffrent Integer values ? 
        // for 100 diffrent Integer values ? 
        // for 1000 diffrent Integer values ? 

        // Array actualy solves the problem of accessing the data (
      
        int arr[] = new int [5]; // by writing this a array of 10 size has been created in the heap. and the address of the that array is stopred in the arr variabe

        System.out.println(a);
        System.out.println(arr);


        // How to access the elements of the array 
        // we can acess the elements of the array using the Indexes and the indexing of the arrays starts from 0(why? will dscuss in a while)


        arr[0] = 10;  // the first element of the arrays 
        arr[1] = 20;  // the second element of the arrays 
        arr[2] = 30;  // the third element of the arrays 
        arr[3] = 40;
        arr[4] = 50;

        
        // 0 -> size -1
        for(int idx = 0; idx <arr.length; idx++){
            System.out.print(arr[idx] +  "  ");
        }
        System.out.println();

        // we can update the existing values also 

        arr[2] = 200;
        arr[3] = 500;
        for(int idx = 0; idx <arr.length; idx++){
            System.out.print(arr[idx] +  "  ");
        }
        System.out.println();

    }
}
