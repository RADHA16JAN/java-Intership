import java.util.*;
public class question8 {
    public static void main(String[] args) {
        /*
8.Take 10 integers as input and add them to an integer array. Then write code find average of an Array.
         */

        int arr[];
        arr=new int[10];
        int l= arr.length;
        float sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no in array:");
        for(int i=0;i<l;i++) {
             arr[i] = sc.nextInt();
        }

        for(int i=0;i<l;i++){
            sum=sum+arr[i];
        }


        System.out.println("The total sum is "+sum);

        float average =sum/l;

        System.out.println("The total average is "+average);

    }
}
