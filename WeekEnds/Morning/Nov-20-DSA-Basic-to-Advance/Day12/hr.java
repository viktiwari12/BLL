public class hr {
    public static void main(String[] args) {
        
    }
    public static int HouseRobber(int house[], int n) {
        // base case -> We will figure out
        if (n <= 0 )
            return 0;

        // everytime I have two choices
        int MaxProfit = 0;
        // If I pick, but before picking I also have to check weater I can pick that not
        
        int c1 = house[n - 1] + HouseRobber(house,  n -2); // picking the element
        int c2 = HouseRobber(house,  n - 1); // not picking

        MaxProfit = Math.max(c1, c2);
        

        return MaxProfit;
    }

}
