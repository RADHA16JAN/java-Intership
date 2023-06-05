import java.util.*;
public class question10 {
    public static void main(String[] args) {
        /*
         Write a java program to store 10 elements in an array and search for the element in arrary.

         */

        int arr[];
        arr= new int[5];
        int l= arr.length;
       Scanner sc=new Scanner(System.in);
       // printing array
       System.out.println("Enter Element in array:");
       for(int i=0;i<l;i++){
           arr[i]=sc.nextInt();
       }
   // Element to search
       System.out.println("Enter element to search: ");
       int ele= sc.nextInt();

       for(int i=0;i<l;i++){
           if(arr[i]==ele){
               System.out.println("Element is present in given array, at position"+i);
               break;
           }
       }

    }
}
