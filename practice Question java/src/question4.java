import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
/*
Simple Calculator using Switch Case Statements.

	1. Take two numbers (Example 10, 2).
	2. Accept operation to be carried out (a = addition, s = subtraction, m = multiplication, d = division

	With swith case statement perform any of these operations.
	User should give numbers and operations.
 */
        int n1,n2,result,e;
        char op;
        Scanner sc=new Scanner(System.in);

        do {
            System.out.println("Enter first number:");
            n1=sc.nextInt();
            System.out.println("Enter second number:");
            n2=sc.nextInt();
            System.out.println("Enter operation you want to perform: a=1,s=2,m=3,d=4,Exit=5 ");
            op=sc.next().charAt(0);
            switch (op) {
                case '1':
                    result = n1 + n2;
                    System.out.println(n1 + "+" + n2 + "=" + result);
                    break;

                case '2':
                    result = n1 - n2;
                    System.out.println(n1 + "-" + n2 + "=" + result);
                    break;

                case '3':
                    result = n1 * n2;
                    System.out.println(n1 + "*" + n2 + "=" + result);
                    break;

                case '4':
                    result = n1 / n2;
                    System.out.println(n1 + "/" + n2 + "=" + result);
                    break;
                default:
                    System.out.println("wrong option");
                    break;
            }
            System.out.println("Do you want to preform operation again? if yes then 1 else 2.");
             e = sc.nextInt();
        }while (e==1);
    }
}
