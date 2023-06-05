import java.util.Scanner;
import java.lang.Math;

public class question5 {
    public static void main(String[] args) {
        /*
       5.  Using calculator from previous exercise (Step 4), keep performing operations in loop till end user wants.
	Add additional functionality to calculator
		1. Power
		2. E^
		3. Modulo operator
		4. Trignometric functions.

         */
        int n1 , n2 ,e;
        double result;
        char op;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter first number:");
            n1=sc.nextInt();
            System.out.println("Enter second number:");
            n2=sc.nextInt();
            System.out.println("Enter operation you want to perform: Power=1, E^=2,Modulo operator=3, Trignometric functions=4 ");
            op = sc.next().charAt(0);
            switch (op) {
                case '1':
                    result = Math.pow(n1, n2);
                    System.out.println("The power of n1 to n2 is " + result);
                    break;

                case '2':
                    result =Math.exp(n1);
                    System.out.println("The value of exponential function is " + result);
                    break;

                case '3':
                    result = Math.ceilMod(n1, n2);
                    double result_1=Math.floorMod(n1, n2);
                    System.out.println("The value of modulo  ceil function is " + result);
                    System.out.println("The value of modulo  floor function is " + result);

                    break;

                case '4':
                    result =Math.tan(n2);
                    System.out.println("The value of  Trignometric function is " + result);
                    break;
                default:
                    System.out.println("wrong option");
                    break;
            }
            System.out.println("Do you want to preform operation again? if yes then 1 else 2.");
            e = sc.nextInt();
        }
        while(e==1);

    }
}
