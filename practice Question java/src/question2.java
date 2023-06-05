import java.util.Scanner;
public class question2 {
    public static void main(String[] args) {
        /*
         Accept 5 variables from command prompt as paramter from Java program
		float a
		float b
		float c
		float d
		float e
	2a. Print result of ++a
	2b. Print result of a++
	2c. print result of (a++ + b++ ) / c++
	2d. print result of a/(b*(c + ++d))
	2e. Print result of a^b++ + b ^ ++c + c ^ --d + d ^ e--

         */

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
        float a= sc.nextFloat();
        System.out.println("Enter value of b:");
        float b= sc.nextFloat();
        System.out.println("Enter value of c:");
        float c= sc.nextFloat();
        System.out.println("Enter value of d:");
        float d= sc.nextFloat();
        System.out.println("Enter value of e:");
        float e= sc.nextFloat();

        System.out.println("value of  ++a is"+(++a));
        System.out.println("value of  a++ is"+(a++));
        System.out.println("value of (a++ + b++ ) / c++ is"+((a++ + b++ ) / c++));
        System.out.println("value of  a/(b*(c + ++d)) is"+(a/(b*(c + ++d))));

        // It will give error because we can not use ^ operator with float
      //  System.out.println("value of  a^b++ + b ^ ++c + c ^ --d + d ^ e-- is"+(a^b++ + b ^ ++c + c ^ --d + d ^ e--));

    }
}
