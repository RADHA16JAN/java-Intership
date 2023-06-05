import java.util.Arrays;
import java.util.Random;

public class question14 {
    public static void main(String[] args) {
        /*
Write a java program to remove duplicates from the above array ( in step 13).
         */

        int arr[];
        arr=new int[100];
        int temp[]=new int[arr.length];
        int j=0;

        Random rand=new Random();
        System.out.println("Random no are ");
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*1000);
            System.out.print(arr[i]+" ");
        }

        System.out.print(" ");
        System.out.println("After removing");
        Arrays.sort(arr);
        for(int i=0;i< arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }
        temp[j]=arr[arr.length-1];
        for(int i=0;i< temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
}
