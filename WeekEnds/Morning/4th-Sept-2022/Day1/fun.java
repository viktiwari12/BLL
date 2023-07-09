package Day1;
public class fun {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int s1 = scn.nextInt(); // size of the first array 
        int a1[] = new int[s1];
        // take all the elements of the first arrray as inout 
        for(int i = 0; i<s1; i++){
            a1[i] = scn.nextInt();
        }

        int s2 = scn.nextInt(); // size of the second array 
        int a2[] = new int[s2];
        for(int i = 0; i<s2; i++){
            a2[i] = scn.nextInt();
        }

        int x[] = sum1(a1, a2, s1, s2);

        // logic for printing two arrays 
        for(int ele: x){
            System.out.println(ele + " ");
        }

    }
    public static void demo(int a1[], int a2[],int s1, int s2){ // print the sum of the two arrays 
        int x[] = sum1(a1, a2, s1, s2);
        for(int ele: x){
            System.out.println(ele + " ");
        }

    }
    public static void sum(int a1[], int a2[],int s1, int s2){
        int s3 =( Math.max(s1, s2) +1); // Math.max-> return maximum of the two numbers 
        int sum[] = new int[s3];
        int i = s1-1, j= s2-1, k = s3-1, c = 0;
        while(i>=0 || j>=0){
            int num = c;
            if(i>=0) num += a1[i];
            if(j>=0) num += a2[j];
            // now I have got the number, and I have to do two things 
            int rem = num%10;
            int qu = num/10;
            sum[k] = rem;
            c = qu;
            // the most important -> update the pointers 
            i--;j--;k--;
        }
        if(c > 0) sum[k] = c;
        for(int ele : sum){
            System.out.print(ele + " ");
        } 
    }
    public static int[] sum1(int a1[], int a2[],int s1, int s2){
        int s3 =( Math.max(s1, s2) +1); // Math.max-> return maximum of the two numbers 
        int sum[] = new int[s3];
        int i = s1-1, j= s2-1, k = s3-1, c = 0;
        while(i>=0 || j>=0){
            int num = c;
            if(i>=0) num += a1[i];
            if(j>=0) num += a2[j];
            // now I have got the number, and I have to do two things 
            int rem = num%10;
            int qu = num/10;
            sum[k] = rem;
            c = qu;
            // the most important -> update the pointers 
            i--;j--;k--;
        }
        if(c > 0) sum[k] = c;
        for(int ele : sum){
            System.out.print(ele + " ");
        } 
        return sum;
    }
}
