package oopsJava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class txtHandler implements baseInterface {
    @Override
    public void EnterString(String str) throws IOException {
        System.out.println("Initialising the TXT file");
        File file=new File("Textfile.txt");
        FileWriter F_IN = new FileWriter("Textfile.txt");
        F_IN.write(str);
        F_IN.close();
    }

}
