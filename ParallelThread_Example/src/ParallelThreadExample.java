import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ParallelThreadExample implements Runnable {
    private int startvalue,endvalue;


    @Override
    public void run() {
        System.out.println("This id is in multiplethreadExample class: "+Thread.currentThread().getId());

        for(int i=startvalue;i<endvalue;i++){

            System.out.println(Thread.currentThread().getId() + " " + i);
        }
    }


    void printno(int start, int end){

        this.startvalue=start;
        this.endvalue=end;

    }


   // BufferedWriter writer;

    {
        try {
            BufferedWriter  writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("writing a file in txt.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}



