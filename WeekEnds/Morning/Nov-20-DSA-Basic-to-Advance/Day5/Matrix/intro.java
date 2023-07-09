
public class intro {
    public static void main(String[] args) {
        int[][] arr = new int[5][];

        arr[0] = new int[10];
        arr[1] = new int[20]; // have initilise an array
        arr[2] = new int[40];
        arr[3] = new int[190];
        arr[4] = new int[140];

        // for(int i = 0; i < arr.length; i++){
        // System.out.println(arr[i]);
        // System.out.println(arr[i].length);
        // }

        for (int i = 0; i < arr.length; i++) {
            display(arr[i]);
        }
    }

    public static void display(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + " ");
        }
        System.out.println();

    }

    // Display the matxix
    public static void display2D(int arr[][]) {
        for (int ele[] : arr) { // for each loop || accessing the individual arrays from the 2-d array 
            display(ele); // displaying the individual arrays
        }
        // doisplaying the individual Arrays
    }

    // display the 2D array using matrix concept
    public static void displayMatrix(int arr[][]) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}