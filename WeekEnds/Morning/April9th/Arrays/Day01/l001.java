

public class l001 {
    public static void main(String[] args) {
        // You have to sore the marks of 5 people 
        int p1 = 10;
        int p2 = 12;
        int p3 = 15; 
        int p4 = 45;
        int p5 = 30;

        // Let say,I ask to store marks of 10 ppl

        // -> will take 10 different vaiable 

        // Let's I ask to store marks of 100 ppl -> 1K - > 10K -> 100k Students 


        // To solve above problem, we use array 

        // What is Array ? 

        // Array is continous memory allocation of same data type or Similar data 

        // Note: - Arrays Behave differently in different programing language but bvasic fundamentals is same.

        // Syntax 

        // int x = 10; 
        // System.out.println(x);


        int arr[] = new int [10];
        int ar4[]  = new int [10];


        int a5 []= arr.clone();
        System.out.println("real Address of arr " + arr);
        System.out.println("clone Address of arr1 " +a5);
        arr[5] = 500;
        int arr1 [] = arr;

        System.out.println("Address of arr " + arr);
        System.out.println("Address of arr1 " +arr1);
        System.out.println(arr.hashCode());
        System.out.println(arr1.hashCode());


        System.out.println("element of arr " + arr[5]);
        System.out.println("elements of arr1 " +arr1[5]);
        // Accessing the elements in the array 

        // -> how 
        // -> why 

       // [a, b, c, d, e, f, g, h];


    //    arr[0] -> will give u the first element 

    //    arr[1] -> will give you secod element 

    //    arr[2] -> will give you the 3rd element in the array 



       // why ? 

       int arr2[]  = {10, 20, 30, 40, 50};
       System.out.println(arr2.length);

    //    System.out.println(arr[0]);
    //    System.out.println(arr[1]);
    //    System.out.println(arr[2]);
    //    System.out.println(arr[3]);
    //    System.out.println(arr[4]);

        System.out.println("Address of second array ");
        System.out.println(arr2);
       for(int i = 0; i< arr2.length; i++){
        System.out.println(arr2[i]);
       }


    }

    
}
