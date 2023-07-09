

public class l001 {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        display(arr);

        insertionSort(arr);
        display(arr);
    }
    public static void bubbleSort(int arr[]){
        int n = arr.length;

        for(int itr = 1; itr <n; itr++){
            for(int curr = 0; curr < n-1; curr++){
                // check is current element is greater than Next Eleemnt 
                if(isGreater(arr, curr, curr+1)){
                    // swap the current elemnet with the next element 
                    swap(arr, curr, curr+1);
                }
            }
        }
    }
    public static void insertionSort(int arr[]){
        // travel in unsorted region
        for(int i = 1; i< arr.length; i++){
            // pick the first element of unsorted region and travel back in sorted regoin 
            for(int j = i-1; j>=0; j--){
                // compare and sweap 
                if(isGreater(arr, j, j+1)){
                    swap(arr, j, j+1);
                }else{
                    break;
                }
            }
        }
    }

    public static boolean isGreater(int arr[], int i, int j){
        return (arr[i]> arr[j]) ;
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void display(int arr[]){
        for(int ele : arr){
            System.out.print(ele + "  ");
        }

        System.out.println();
    }
}
