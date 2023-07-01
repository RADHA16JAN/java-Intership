package oopsJava;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Main Function started");
        System.out.println("Enter your Choice:");
        System.out.print("1.Save as txt " + " " + "2.Save as csv");

        Scanner sc= new Scanner(System.in);

        int choice = sc.nextInt();

        baseInterface client = new Adapter().getID(choice);
        System.out.println("Enter the string you want to enter");
        String str = sc.next();
        client.EnterString(str);

    }
}
