import java.util.*;
public class question9  {
    public static void main(String[] args) {
        /*
Write a Java Program to take 10 input elements in any random order and sort the array and print elements
 of array in sorted (both ascending and descending) order.

         */
        int arr[];
        arr=new int[10];
        int l= arr.length;
         int temp=0;
        Random rand=new Random();
        System.out.println("Random Element in array: ");
        for(int i=0;i<l;i++){
           arr[i]= (int)(Math.random()*50);
        }
        for(int i=0;i<l;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");

        // using sort function
        System.out.println("Sorted array in ascending order using sort function");
        Arrays.sort(arr);
        for(int i=0;i<l;i++){
        System.out.print(arr[i]);
        }
        System.out.println(" ");

        System.out.println("Sorted array in ascending order");
         // using loop and temp variable  in ascending order
            for(int i=0;i<l;i++) {
            for(int j=i+1;j<l;j++){
            if (arr[i] > arr[j]) {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");



        System.out.println("Sorted array in descending order");
        // using loop and temp variable in descending order
        for(int i=0;i<l;i++) {
            for(int j=i+1;j<l;j++){
                if (arr[i] < arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.print(arr[i]+" ");
        }


    }
}
