import java.util.*;
public class l003 {
    public static void main(String[] args) {
        int arr[] = {2, 5, 9, 3, 12 ,6, 8, 7};
        display(arr);
        int ans [] = ngetl(arr);
        display(ans);
    }
    public static void display(int arr[]){
        for (int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static int [] ngetl(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];
        ans[0]= -1;
        st.push(arr[0]);

        for(int i = 1; i<n; i++){
            int curr = arr[i];

            while(st.size()>0 && st.peek() <= curr){
                st.pop(); // wipe out all the smaller element that current element from the stack 
            }

            // Here there is only two possibility 

            // 1-> Stack will be empty

            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }

            st.push( curr);
        }

        return ans;
    }
}
