

public class intro {
    public static void main(String[] args) {
        int arr[] = new int[100];


    
    }
    public static void BinarySearch(int arr[], int tar){
        // set the start nad end / Low and High 


        int st = 0;
        int end = arr.length -1;

        while(st <=end){
            int mid = st + ((end - st)/2);
            if(arr[mid] == tar){
                System.out.println("Wallah ! Finally found it at the " + mid + "  idx");
                break;

            }else if(arr[mid] <tar){
                st = mid +1;
            }else{
                end = mid -1;
            }
        }
    }
}
