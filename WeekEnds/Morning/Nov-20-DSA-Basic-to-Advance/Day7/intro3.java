import java.util.ArrayList;

public class intro3 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();


        al.add(10);
        System.out.println(al);
        System.out.println(al.size());
        al.add(20);
        System.out.println(al);
        System.out.println(al.size());
        al.add(30);
        System.out.println(al);
        System.out.println(al.size());


        // reading the elemets in arraylist 

        al.get(0); 

        // in case, We want to read the each element of arraylist 

        for(int i = 0; i< al.size(); i++){
            System.out.println(al.get(i));
        }

        // For each loop is also used very commonly in to read elements of arratylist 


        for (int ele : al){
            System.out.println(ele);
        }

        // revoving/ delete a element

        al.remove(3);
        
        // set . override element at a given index 


        al.set(4, 10);// at 4th index the 10 will be set 
    }
}
