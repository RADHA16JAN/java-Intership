import  java.util.Scanner;
public class question6 {
    public static void main(String[] args) {
        /*
        6. Take inputs and build factorial functions.
	5! = 5x4x3x2x1

         */
    int fact=1,result;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value:");
    int n=sc.nextInt();

    if(n==0||n==1){
         System.out.println("The factorial of"+n+"is"+fact);
     }
    else{
        for(int i=n;i>1;i--){
        fact=fact*i;
          }
         System.out.println("The factorial of"+n+"is"+fact);
        }

    }
}
