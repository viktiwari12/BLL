package Basics.Day1;


public class p3 {
    public static void main(String[] args) {
        // Let's learn about Functions/ Methods 
        // Given a principal amount, rate of Interest and Time Frame 
        // calculate the simple Inerest and tehn return the next paid amount at end of the time frame.
        int p1 = 100;
        int roi = 25; 
        int time = 4;
        int amount = p1 + intersetCalculate(p1, roi, time);

        int p2 = 120;
        int r2 = 25; 
        int t2 = 4;
        int a2 = p2 + intersetCalculate(p2, r2, t2);

        int max = Math.max(p1, p2);    
        
        int x =(int)Math.pow(t2, time);

        
    }
    public static int intersetCalculate(int pri, int roi, int time){
        int si = pri* roi * time;
        si = si/100;
        return si;
    }
}
