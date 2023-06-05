import java.util.*;
public class question13 {
    public static void main(String[] args) {
        /*
 Write a java program to fill arrary of length with 100 elemements.
  Random integers will be filled in the arrary.
         */

        int arr[];
        arr=new int[100];

        Random rand=new Random();
        System.out.println("Random no are ");
        for(int i=0;i< arr.length;i++){
            arr[i]=(int)(Math.random()*1000);
            System.out.print(arr[i]+" ");
        }

    }
}
