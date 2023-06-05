import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Thread.currentThread;

public class multi implements Runnable{
    static int thread=0;
    static int currentThread=0;

    @Override
    public void run() {
      long threadId=currentThread().getId();
       String filename="text"+threadId+".txt";
       FileWriter writer;

        try {
            writer=new FileWriter(filename);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        for(int i=1;i<10;i++) {
            String s= String.valueOf(i);

            try {
                writer.write(s);
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

    public static void main(String[] args) {
        multi m=new multi();
        m.run();
    }
}
