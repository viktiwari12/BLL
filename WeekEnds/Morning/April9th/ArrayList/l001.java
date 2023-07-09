
import java.util.*;
public class l001 {
    public static void main(String[] args) {
        // Till now, we have learnt Arrays. 

        // Arrays-> Continous memory allocation of a fixed length/size

        // Let's say, we want to store some data on real time. The count/soze is not fixed 

        // To solve the issue we have something ArrayList

        // Syntax 

        ArrayList<Integer> al = new ArrayList<>(); // creation of arraylist 
        
        // operations to do on arrayList 
        // add 
        // delete
        // set
        // replace

        System.out.println(al.size());
        System.out.println(al);
        al.add(10);
        System.out.println(al);
        System.out.println(al.size());

        al.add(20);
        System.out.println(al);
        System.out.println(al.size());
        al.add(30);
        System.out.println(al);
        System.out.println(al.size());
        al.add(40);
        System.out.println(al);
        System.out.println(al.size());


        // we can also add an element at any specific index 

        al.add(2, 50);
        
        System.out.println(al);
        System.out.println(al.size());

        // Reading elements from ArrayList in genral or at any given index 

        int x = al.get(2); // element at 2nd Index 

        // in case we want to read all the elements index by index we can use some sort of loops 

        for(int idx = 0; idx <al.size(); idx+=2){
            System.out.print(al.get(idx)+ "  ");
        }
        System.out.println();

        // Let's learn a new type of loop i.e -> For -Each Loop 


        for(int ele : al){
            System.out.print(ele + " ");
        }

        // Deletion / removaval 
        // .remove() method -> this wil remove the elment at any given specific location/index 

        al.remove(2);
        System.out.println();
        System.out.println(al);


        // replace / set
        // this will replace the previous element at any given index with a new one 

        al.set(2, 100);
        System.out.println(al);
        al.add(2, 500);
        System.out.println(al);


        

        




    }
}
