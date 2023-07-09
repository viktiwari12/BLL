import java.text.NumberFormat.Style;

import javax.print.attribute.standard.Sides;

class intro{
    public static void main(String[] args) {
        SI(0, 0, 0);
    }
    public static int SI(int p, int r, int t){
        int ans = ((p * r * t)/100);
        return ans;
    }

    public static void greet() {
        System.out.println("Hello Vikash, Good Morning!");
    }
    public static void displayReverse(int n){
        // 12345  54321 

        while(n != 0){
            int rem = n % 10;
            System.out.print(rem);


            // update the number 
            n = n/10;
        }
    }

    public static int sum(int n){
        // 12345  return 1 + 2 + 3 + 4 + 5;
        int ans = 0;
        while(n != 0){
            int rem = n % 10;
            ans += rem;


            // update the number 
            n = n/10;
        }
        return ans;
    }

}