package oopsJava;
import java.io.*;
public class csvHandler implements baseInterface {
    @Override
    public void EnterString(String str) throws IOException {
        System.out.println("Initialising the CSV file");
        File file=new File("Csvfile.csv");
        FileWriter F_IN = new FileWriter("Csvfile.csv");
        F_IN.write(str);
        F_IN.close();
    }
}
