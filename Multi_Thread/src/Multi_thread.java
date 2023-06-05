import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import static java.lang.Thread.currentThread;
public class Multi_thread implements Runnable{
    static int thread=0;
    static int currentthread=0;
    static long time=0;
    @Override
    public void run() {

        long threadId = currentThread().getId();
        String fileName = "text_" + threadId + ".txt";
        FileWriter writer;

        try {
            writer = new FileWriter(fileName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Random rand=new Random();
        long st = System.currentTimeMillis();
        for (int i=1; i<=(1000000000/thread);i++)
        {
            String s= rand.nextInt(Integer.MAX_VALUE) +" " + currentThread().getId();
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

        long finish=System.currentTimeMillis();
        long time_final=finish-st;

        currentthread++;
        if(currentthread== thread)
            System.out.println("Time taken="+ time_final+"ms.");
    }

    public void printnumbers(int no) {
        Runnable runnable = new multiThread_join();

        switch (no){
            case 1 -> {
                thread=1;
                Thread t1=new Thread(runnable);
                System.out.println("1st thread running.");
                t1.start();
            }

            case 2 ->  {
                   thread=2;
                    for(int i=thread;i>=1;i--){
                    Thread t=new Thread(runnable);
                    System.out.println(i+" thread running.");
                    t.start();
                }

            }

            case 4 -> {
                thread=4;
                for(int i=thread;i>=1;i--){
                    Thread t=new Thread(runnable);
                    System.out.println(i+" thread running.");
                    t.start();
                }
            }

            case 8 -> {
                thread=8;
                for(int i=thread;i>=1;i--){
                    Thread t=new Thread(runnable);
                    System.out.println(i+" thread running.");
                    t.start();
                }
            }

            case 16 -> {
                thread=16;
                for(int i=thread;i>=1;i--){
                    Thread t=new Thread(runnable);
                    System.out.println(i+" thread running.");
                    t.start();
                }
            }

            case 32 -> {
                thread=32;
                for(int i=thread;i>=1;i--){
                    Thread t=new Thread(runnable);
                    System.out.println(i+" thread running.");
                    t.start();
                }
            }

        }
    }
}
