class sorting{
    public static void main(String[] args) {
        
    }
    public static void bubbleSort(int arr[]){

        // Total no of Itetration -> N-1
        int n = arr.length;

        for(int i = 0; i< n-1; i++){ // this loop will run N time (to be precise n-1)
            compareAndSwap(arr, i) // every time this function is taking time of O(N)
        }
        // O(N) * o(N) -> O(N)square 
    }
    public static void compareAndSwap(int arr[], int itr){ // this loop is also running n times 
        for(int i = 1; i< arr.lenght -itr; i++){
            if(arr[i] < arr[i-1]) // compare 
                swap(arr, i, i-1); // swap 
        }
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i]; // O(1)
        arr[i] = arr[j]; // O(1)
        arr[j] = temp; // O(1)
    }
     public static void bubbleSort01(int arr[]){

        // Total no of Itetration -> N-1
        int n = arr.length;

        for(int count = 0; count< n-1; count++){ // this loop to to count the number of times comparing and swapping will be done 
             for(int i = 1; i< arr.lenght; i++){ // this loop is for comparing and swapping 
                if(arr[i] > ar[i+1]){ // Compare 
                    int temp = arr[i]; // swap 
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int arr[]){
        for(int i = 0; i< arr.lenght-1; i++){  // this loop will run O(N) 
            int min = finMin(arr, i);  //  find fin function will take O(N) time 
            swap(arr, i, min);
        }

        // resulatant will take O(N) * O(N) -> O(N)square 
    }
    public static int finMin(int arr[], int curr){ // on an avg,this loop will run O(N) times 
        int min = curr;
        for(i = curr+1; i<arr.length; i++){
            if(arr[i] < arr[min]) min= i;
        }

        return min;
    }


}