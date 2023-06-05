import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Main Program starts");
        System.out.println("Enter the no. of threads(choose only 1, 2, 4, 8, 16, 32)");
        int no=in.nextInt();
        multiThread_join p = new multiThread_join();
        p.printNumbers(no);

    }
}