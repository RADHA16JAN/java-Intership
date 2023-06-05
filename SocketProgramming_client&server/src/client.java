import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class client {
    public static void main(String[] args) {
        try {
            System.out.println("client started...");
            Socket soc=new Socket("localhost",9806);
            BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter a string: ");
            String str=userInput.readLine();
            PrintWriter p=new PrintWriter(soc.getOutputStream(),true);
            p.println(str);
            BufferedReader read=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(read.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
