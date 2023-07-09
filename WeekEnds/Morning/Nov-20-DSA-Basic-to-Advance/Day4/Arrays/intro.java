

class intro{
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70};
        display(arr);
    }
    public static void display(int arr[]){
        for(int idx = 0; idx <arr.length; idx++){
            System.out.print(arr[idx] + "  ");
        }
        System.out.println();
    }
    //{4, 5, 6, 1, 1, 3, 6};
    public static int max(int arr[]){
        int max = arr[0];

        for(int idx = 1; idx <arr.length; idx++){
            if(arr[idx] > max){
                max = arr[idx];
            }

            // max = Math.max(a , b);

        }
        return max;
    }
    public static int max01(int arr[]){ // in case of duplicacy in ma/min elemenrt return the index of the first occurence 

    }
    public static int max02(int arr[]){ // in case of duplicacy in ma/min elemenrt return the index of the last occurence 

    }

    // write the program to return the index of the minimum element
    public static int min(int arr[]){
        int min = 0; // Note here I am taking index not ay value

        for(int idx = 1; idx <arr.length; idx++){
            if(arr[idx] < arr[min]){
                min = idx;
            }

            // max = Math.max(arr[idx], max);

        }
        return min;
    }

}