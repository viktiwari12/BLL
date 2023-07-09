
 class pt {
    public static void main(String[] args) {
        pt1(5);

        System.out.println();
        pt2(5);
    }
    public static void pt1(int n){
        int nst1 = n;
        int nst2 = n;
        int nsp = 0;

        for(int row = 1; row<= (n*2); row++){
            if(row<=n){
                printstarts(nst1);
                nst1 -= 1;
                printspace(nsp);
                nsp += 2;
                printstarts(nst2);
                nst2 -= 1;
            }else{
                nst1 += 1;
                printstarts(nst1);
                nsp -= 2;
                printspace(nsp);
                nst2 += 1;
                printstarts(nst2);
               
            }
            System.out.println();
        }
        
    }

    public static void pt2(int n){
        int nst1 = 1;
        int nst2 = 1;
        int nsp = ((2*n)-2);

        for(int row = 1; row<= (n*2); row++){
            if(row<=n){
                printstarts(nst1);
                nst1 += 1;
                printspace(nsp);
                nsp -= 2;
                printstarts(nst2);
                nst2 += 1;
            }else{
                nst1 -= 1;
                printstarts(nst1);
                nsp += 2;
                printspace(nsp);
                nst2 -= 1;
                printstarts(nst2);
               
            }
            System.out.println();
        }
        
    }
    
    public static void printstarts(int n){
        for(int i = 1; i<=n; i++){
            System.out.print("*  ");
        }
    }
    public static void printspace(int n){
        for(int i = 1; i<=n; i++){
            System.out.print("   ");
        }
    }
}
