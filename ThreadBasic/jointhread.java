import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import static java.lang.Thread.currentThread;

public class jointhread implements Runnable{

    static int thread=0;
    static int currentThread=0;

    public void run(){
        long threadId=currentThread().getId();
        String name="text_"+threadId+".txt";
        FileWriter writer;

        try {
             writer=new FileWriter(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Random rand=new Random();
       for(int i=1;i<10000/thread;i++) {
           String s = rand.nextInt(1000) + " " + currentThread().getId();
           try {
               writer.write(s);
               writer.write("\n");
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       }
           try {
               writer.close();
           } catch (IOException e) {
               throw new RuntimeException(e);
           }

    }

    public static void printnumbers(int no) {
        Runnable runnable = new jointhread();
        switch (no) {
            case 1 -> {
                thread = 1;
                Thread t1 = new Thread(runnable);
                System.out.println("1st thread running.");
                t1.start();
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            case 2 -> {
                thread = 2;
                for (int i = thread; i >= 1; i--) {
                    Thread t = new Thread(runnable);
                    System.out.println(i + " thread running.");
                    t.start();
                    try {
                        t.join();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

            case 4 -> {
                thread = 4;
                for (int i = thread; i >= 1; i--) {
                    Thread t4 = new Thread(runnable);
                    System.out.println(i + " thread running.");
                    t4.start();

                }
            }


        }
    }

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Main Program starts");

        System.out.println("Enter the no. of threads(choose only 1, 2, 4, 8, 16, 32)");
        int no=in.nextInt();
        printnumbers(no);

    }
}
