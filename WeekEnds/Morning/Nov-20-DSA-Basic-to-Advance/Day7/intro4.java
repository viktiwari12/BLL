
public class intro4 {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};
        subset(arr);
    }
    public static void subset(int arr[]){
        int tn = (int)Math.pow(2, arr.length);
        for(int num = 0; num<tn; num++){

            // 
            String bn = binary(num);
            while(bn.length()< arr.length){
                bn = '0' + bn;
            }
            // Generate subsequence based upon this binary 
            for(int i = 0; i< bn.length(); i++){
                if(bn.charAt(i) == '0'){
                    System.out.print('-' + " ");
                }else{
                    System.out.print(arr[i] + " ");
                }
            }
            System.out.println();
        }
    }
    public static String binary(int n){
        // Black Box 
        String ans = "";
        while(n!= 0){
            int rem = n % 2;
            ans = rem + ans;
            n = n/2;
        }
        return ans;
    }

    // Follow up-> Try using the logic of binary but not generate any number or 
    //string and then do computation rather just simpally usse in in one single loop 
}
