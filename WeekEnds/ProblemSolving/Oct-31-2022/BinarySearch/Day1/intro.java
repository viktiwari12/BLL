import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // int len = scn.nextInt(); // size of the array 
        // int ar[] = new int[len];
        // for(int i = 0; i<len; i++){
        //     ar[i] =  scn.nextInt(); // elements of the array 
        // }
        // int tar = scn.nextInt();
        int arr[] = { 1, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 5, 6, 7 };

        int tar = 3;
        int idx = FirstOccurence(arr, tar);
        System.out.println(idx);

    }
    public static int FirstOccurence(int arr[], int tar){
        int st = 0, end = arr.length -1;
        int ans = -1;

        while(st<= end){
            int mid = (st + (end -st)/2);

            if(arr[mid] == tar){
                ans = mid;
                end = mid-1; // don't break the loop here, instead just continue the search in the same manner 
            }else if(arr[mid] < tar){
                st = mid+1;
            }else{
                end = mid -1;
            }
        }

        return ans ;
    }

    public static int lastOccurence(int arr[], int tar){
        int st = 0, end = arr.length -1;
        int ans = -1;

        while(st<= end){
            int mid = (st + (end -st)/2);

            if(arr[mid] == tar){
                ans = mid;
                st = mid + 1; // don't break the loop here, instead just continue the search in the same manner 
            }else if(arr[mid] < tar){
                st = mid+1;
            }else{
                end = mid -1;
            }
        }

        return ans ;
    }

    {2, 3, 4, 5, 1} // try using modulo operator 

    public static int findMin(int arr[]){
        // apply Bionary search Algo 

        int st = 0, end = arr.length-1;
        int ans = -1;

        while(st <=end){
            int mid = (st + ((end -st)/2));

            if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid +1] ){
                ans = mid;
                break;
            }else if(arr[st] < arr[mid]){
                st = mid +1;
            }else{
                end = mid -1;
            }
        }

        return ans;
    }
    5 6 7 8 1 2 3 4
    public static int findEle(int arr[], int tar){
        int minIdx = findMin(arr);

        if(arr[minIdx] == tar) return minIdx;

        else if(arr[0] > tar){
            binarySearch(arr, tar, 0, minIdx-1);
        }else{
            binarySearch(arr, tar, minIdx+1, arr.length);
        }


    }
    public static void binarySearch(int arr[], int tar, int st, int end){
        // set the start nad end / Low and High 
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
