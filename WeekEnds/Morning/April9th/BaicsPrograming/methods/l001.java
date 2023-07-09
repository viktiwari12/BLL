public class l001{
    public static void main(String[] args) {
        // We would like to calculate what's the Simple Interest for different people as per their variables 


        // for Aditya 
        int a1 = 100000;
        int t1 = 12;
        int r1 = 6;
        
        int si1 = si(a1, t1, r1);

        // for akhilesh 
        int a2 = 10000;
        int t2 = 7;
        int r2 = 5;
        int si2 = si(a2, t2, r2);


        // n people -> will have to do the same task n times 
    }
    public static int si(int an, int tn, int rn){
       int x = an * tn * rn;

       int ans = x /100;

       return ans;
    }
}