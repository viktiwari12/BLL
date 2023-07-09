
public class l002 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        // this will simpally create a new array of 5 size where by default values are 0
        int arr2[] = { 1, 23, 4, 5, 6, 7 };
        arr[0] = 1;
        arr[1] = 2;

        // can we update the existing values?

        arr[0] = 5;

        int a1[][] = new int[5][6]; // this created an array of 5 size which will further store disserent arrays

        a1[0] = new int[6];
        a1[1] = new int[6];
        a1[2] = new int[60];
        a1[3] = new int[6];
        a1[4] = new int[6];
        for (int i = 0; i < a1.length; i++) {
            System.out.println(" Value stored at " + i + "th  position " + a1[i]);

            System.out.println("Size of the array stored at  " + i + "th  position " + a1[i].length);
        }
        for (int a[] : a1) {
            displayArray(a);
        }
    }

    public static void displayArray(int arr[]) {
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
    }


   
}
