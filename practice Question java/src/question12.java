import java.util.Arrays;

public class question12 {
    public static void main(String[] args) {
        /*
write a java program to compare two array. There are two types of equalities, write code for both equalities.
	1. Numbers in arrary are same (irrespective of position).
	2. Both numbers in arrary and positions have to be same to be equal.
         */
        int arr[]={1,2,3,4,56,6};
        int arr1[]={2,3,4,1,6,5,56};
  int l= arr.length;
  int l1= arr1.length;
        Arrays.sort(arr);
        Arrays.sort(arr1);

        // 21 part
        if(l==l1){
            System.out.println("both are same");
        }
        else {
            System.out.println("not same");
        }

        // 2 part
        if(Arrays.equals(arr,arr1)){
            System.out.println("same Element");
        }
        else{
            System.out.println("not same element");
        }

    }
}
