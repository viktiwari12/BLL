
public class intro {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 7};
        int tar = 10;

        int ans = conbi_singeCoin(arr, 0, tar);
        System.out.println("Total no of combination "+ans );

        System.out.println("All Combinations");
        Print_conbi_singeCoin(arr, ans, tar, "");

        ans = permutation_singeCoin(arr, ans, tar);

        System.out.println("Total no of Permutation"+ans );

        System.out.println("All Permutation");
        Print_permutation_singeCoin(arr, ans, tar, "");


        System.out.println();

        System.out.println("Infinite series ");

        ans = conbi_infi_Coin(arr, ans, tar);
        System.out.println("Total no of combination "+ans );
        System.out.println();
        System.out.println("All Combinations");
        Print_conbi_infi_Coin(arr, ans, tar, "");

        ans = permut_infi_Coin(arr, ans, tar);

        System.out.println("Total no of Permutation"+ans );

        System.out.println("All Permutation");

        Print_permut_infi_Coin(arr, ans, tar, "");









    }

    public static int conbi_singeCoin(int arr[], int st, int tar ) {

        // base case
        if (tar == 0) {

            return 1;
        }
        if (tar < 0 || st == arr.length)
            return 0;

        int count = 0;
        for (int i = st; i < arr.length; i++) {
            count += conbi_singeCoin(arr, (i + 1), (tar - arr[i]));
        }

        return count;
    }

    public static int permutation_singeCoin(int arr[], int st, int tar) {

        // base case
        if (tar == 0) {
            return 1;
        }
        if (tar < 0 || st == arr.length)
            return 0;

        int count = 0;
        for (int i = st; i < arr.length; i++) {
            // check if it is not maked
            if (arr[i] > 0) {
                // maek
                arr[i] = ((-1) * arr[i]); // this is very much situation based || i have assumed that all values array
                                          // is +ve
                count += permutation_singeCoin(arr, 0, (tar - arr[i]));
                arr[i] = ((-1) * arr[i]);
            }

            // unmark
        }

        return count;
    }

    public static int conbi_infi_Coin(int arr[], int st, int tar) {
        // base case
        if (tar == 0) {

            return 1;
        }
        if (tar < 0 || st == arr.length)
            return 0;

        int count = 0;
        for (int i = st; i < arr.length; i++) {
            count += conbi_singeCoin(arr, (i ), (tar - arr[i]));
        }

        return count;
    }

    public static int permut_infi_Coin(int arr[], int st, int tar) {
        if (tar == 0) {
            return 1;
        }
        if (tar < 0 || st == arr.length)
            return 0;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += permut_infi_Coin(arr, 0, (tar - arr[i]));
        }

        return count;
    }

    public static void Print_conbi_singeCoin(int arr[], int st, int tar,String psf) {

        // base case
        if (tar == 0) {
            System.out.println(psf);
            return;
        }
        if (tar < 0 || st == arr.length)
            return;

        int count = 0;
        for (int i = st; i < arr.length; i++) {
            Print_conbi_singeCoin(arr, (i + 1), (tar - arr[i]), (psf + arr[i]));
        }

        return ;
    }

    public static void Print_permutation_singeCoin(int arr[], int st, int tar, String psf) {

        // base case
        if (tar == 0) {
            System.out.println(psf);
            return;
        }
        if (tar < 0 || st == arr.length)
            return;

       
        for (int i = st; i < arr.length; i++) {
            // check if it is not maked
            if (arr[i] > 0) {
                // maek
                arr[i] = ((-1) * arr[i]); // this is very much situation based || i have assumed that all values array
                                          // is +ve
                Print_permutation_singeCoin(arr, 0, (tar + arr[i]), (psf + arr[i]));
                arr[i] = ((-1) * arr[i]);
            }

            // unmark
        }

        return ;
    }

    public static void Print_conbi_infi_Coin(int arr[], int st, int tar, String psf) {
        // base case
        if (tar == 0) {
            System.out.println(psf);
            return;
        }
        if (tar < 0 || st == arr.length)
            return;

        
        for (int i = st; i < arr.length; i++) {
           Print_conbi_singeCoin(arr, (i), (tar - arr[i]), (psf + arr[i]));
        }

        return ;
    }

    public static void Print_permut_infi_Coin(int arr[], int st, int tar, String psf) {
        if (tar == 0) {
            System.out.println(psf);
            return ;
        }
        if (tar < 0 || st == arr.length)
            return;

        
        for (int i = 0; i < arr.length; i++) {
            Print_permut_infi_Coin(arr, 0, (tar - arr[i]), (psf + arr[i]));
        }

        return ;
    }
}
