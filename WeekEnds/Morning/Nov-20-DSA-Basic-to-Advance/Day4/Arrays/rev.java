

public class rev {
    public static void main(String[] args) {
        int arr[] = {1,2, 3, 4, 5, 6, 7};
        display(arr);
        reverse(arr);
        display(arr);
    }

    public static void reverse(int arr[], int st, int end){
        

        while(st < end){
            swap(arr, st, end);
            st++;
            end--;
        }
    }
    public static void rotate(int arr[], int k){
        int st1 = 0;
        int end1 = arr.length - k -1;
        int st2 = end1 +1;

        int end2 = arr.length -1;

        // reverse the first half
        reverse(arr, st1, end1);
        // reverse the second half 
        reverse(arr, st2, end2);

        // reverse the complete array 
        reverse(arr, st1,  end2);

    }
    public static void inverse(int arr[]){
        // first thing first, take a new array of the same size 

        int arr2[]= new int[arr.length];

        for(int idx = 0; idx <arr.length; idx++){
            arr2[arr[idx]] = idx;
        }
    }
    public static void sum(int a1[], int a2[]){
        int ans[] = new int[Math.max(a1.length, a2.length) +1]; 
        int i = a1.length-1, j = a2.length-1, k= ans.length-1;
        int c = 0;
    
        while(i >=0 || j >=0){   
            int num = c;

            // have to some checks here
            if(i>=0) 
                num += a1[i];

            if(j>=0)
                num += a2[j];


            ans[k] = num% 10;
            c = num/10;
            i--;
            j--;
            k--;
        }
        if(c != 0)
            ans[k] = c;  
        
        displayadd(ans);
        
    }
    //{1 , 2, 3 ,4 5,} => 12345
    // difference 
    public static void diff(int a1[], int a2[]){
        int ans[] = new int[Math.max(a1.length, a2.length) ]; 
        int i = a1.length-1, j = a2.length-1, k= ans.length-1;
        int c = 0;
    
        while(i >=0){
            int num = c;

            // have to some checks here
            
            num += a1[i];

            if(j>=0){
                if(num < a2[j]){
                    num += 10;
                    c = -1;
                }
                num -= a2[j];
            }


            ans[k] = num;
            i--;
            j--;
            k--;
        }
         
        displaySub(ans);
        
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
       


    }
    public static void displayadd(int arr[]){

        if(arr[0] != 0)
            System.out.print(arr[0] + "  ");
        for(int idx = 1; idx <arr.length; idx++){
            System.out.print(arr[idx] + "  ");
        }
        System.out.println();
    }
    public static void displaySub(int arr[]){
        int i = 0;
        while(i < arr.length && arr[i] == 0) 
            i++;
        for(int idx = i; idx <arr.length; idx++){
            System.out.print(arr[idx] + "  ");
        }
        System.out.println();
    }
}
