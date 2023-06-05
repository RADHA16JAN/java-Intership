import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class server {
    public static void main(String[] args) {
        System.out.println("Waiting for client...");
        try {
            ServerSocket ss=new ServerSocket(9806);
            Socket soc=ss.accept();
            System.out.println("connection established.");
            BufferedReader input=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String str=input.readLine();
            PrintWriter p=new PrintWriter(soc.getOutputStream(),true);
            p.println("Server says: "+str);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
