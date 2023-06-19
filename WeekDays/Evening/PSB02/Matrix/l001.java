import javax.swing.text.AbstractDocument.LeafElement;

public class l001 {
    public static void main(String[] args) {
        int arr[][] = new int[4][4];
        int count = 1;
        // Just initilasing value in matrix
        for (int x[] : arr) {
            for (int i = 0; i < x.length; i++) {
                x[i] = count++;
            }
        }

        // the Actual Matrix 
        System.out.println("The Actual Matrix ");
        System.out.println();
        display2D(arr);
        System.out.println("The Matrix -> Row Wise  ");
        System.out.println();
        RoWise(arr);
        System.out.println("The Matrix -> Col Wise  ");
        System.out.println();
        ColWise(arr);
        System.out.println("The Matrix -> Row Wise alt ");
        System.out.println();
        RoWiseAlt(arr);
        System.out.println("The Matrix -> Col Wise alt ");
        System.out.println();
        ColWiseAlt(arr);


    }
    public static void display1D(int arr[]){
        for(int ele : arr){
            System.out.print(ele + "   ");
        }
        System.out.println();
    }
    public static void display2D(int arr[][]){
        for(int x[]: arr){
            display1D(x);
        }

        System.out.println();
    }

    public static void RoWise(int arr[][]) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + "  ->  ");
            }
        }
        System.out.println();
    }

    public static void ColWise(int arr[][]) {
        for (int col = 0; col < arr[0].length; col++) {
            for (int row = 0; row < arr.length; row++) {
                System.out.print(arr[row][col] + " -> ");
            }
        }
        System.out.println();
    }

    public static void RoWiseAlt(int arr[][]) {
        boolean ltr = true;
        for (int row = 0; row < arr.length; row++) {
            if (ltr) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[row][col] + "  ->  ");
                }
                ltr = !ltr; // ! -> is negation sign, if true, mark false, if false mark true;
            } else {
                for (int col = arr[row].length - 1; col >= 0; col--) {
                    System.out.print(arr[row][col] + "  ->  ");
                }
                ltr = !ltr;
            }
        }
        System.out.println();

    }

    public static void ColWiseAlt(int arr[][]) {
        boolean ltr = true;
        for (int row = 0; row < arr.length; row++) {
            if (ltr) {
                for (int col = 0; col < arr[row].length; col++) {
                    System.out.print(arr[col][row] + "  ->  ");
                }
                ltr = !ltr; // ! -> is negation sign, if true, mark false, if false mark true;
            } else {
                for (int col = arr[row].length - 1; col >= 0; col--) {
                    System.out.print(arr[col][row] + "  ->  ");
                }
                ltr = !ltr;
            }
        }
        System.out.println();
    }
}
