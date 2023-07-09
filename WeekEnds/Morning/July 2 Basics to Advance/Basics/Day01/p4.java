

public class p4 {
    public static void main(String[] args) {
        // Given a number n and a digit value k 

        // rotate the nuber by k 

        int n = 1234567;
        int dig = 7;
        //612345 r1
        //561234  r2 

        // 456123  r3 
        int count = 1;
        while(count <= dig){
            int pow = (int)Math.pow(10, count);
            int rem = n % pow;
            int q = n /pow;
            System.out.println(n + "  pow -> " + pow  + "    Divinding it now   " + q + "   ->  "  + rem);
            //System.out.println(q);
            count++;
        }
    }
}
