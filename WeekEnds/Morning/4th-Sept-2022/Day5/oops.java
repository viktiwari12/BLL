
class oops{

    static class car{
        String Name ;
        String ModelNo;
        int ManufacturingYear;
        int price ;
        static int count = 0;
        car(){
            count++;
        }
        car(String Name, String ModelNo, int ManufacturingYear){
            this.Name = Name;
            this.ModelNo = ModelNo;
            this.ManufacturingYear = ManufacturingYear;
        }
        car(String a, String b, int c, int p){
            Name = a;
            ModelNo = b;
            ManufacturingYear = c;
            price = p;
        }

    }
    class students{
        String Name;
        int roll;
        long mobile ;
        String address;
        static String college;
    }
    public static void main(String[] args) {
        int num = 1;
        char ch = 'a';

        int arr[] = new int[10];

        String str = " Vikash Tiwary";

        // car c1 = new car("Bmw", "X5", 2022);
        // car c2 = new car("Audi", "Q3", 2021, 5000000);
        car c1 = new car();
        System.out.println(c1.count);
        car c2 = new car();
       
        System.out.println(c2.count);
        car c3 = new car();
        
        System.out.println(c3.count);
        car c4 = new car();
        System.out.println(c4.count);

        // c1.price = 4000000;
        
        // c2.Name = "JagWar";
        // c2.ModelNo = "XJ";
        // c2.ManufacturingYear = 2021;

        // System.out.println(c1.Name);
        // System.out.println(c1.ModelNo);
        // System.out.println(c1.ManufacturingYear);
        // System.out.println(c1.price);

        // System.out.println(c2.Name);
        // System.out.println(c2.ModelNo);
        // System.out.println(c2.ManufacturingYear);
        // System.out.println(c2.price);


        // students s1 = new students();
        // students s2 = new students();
        // students s3 = new students();
        // students s4 = new students();
        // students s5 = new students();

        // students s6 = new students();
        // students s7 = new students();
        // students s8 = new students();
        // students s9 = new students();
        // students s10 = new students();
        // students s11 = new students();
        
    }
}