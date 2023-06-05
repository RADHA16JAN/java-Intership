import java.io.*;
import java.net.*;
import java.util.Scanner;
class Client1 {
    public static void main(String[] args) {
        try {
            Socket soc=new Socket("localhost",9806);
            PrintWriter writer=new PrintWriter(soc.getOutputStream(),true);
            BufferedReader reader=new BufferedReader(new InputStreamReader(soc.getInputStream()));

            Scanner sc=new Scanner(System.in);
            String line=null;

            while(!"exit".equalsIgnoreCase(line)){
                line=sc.nextLine();
                writer.println(line);
                writer.flush();

                System.out.println("server response "+reader.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
