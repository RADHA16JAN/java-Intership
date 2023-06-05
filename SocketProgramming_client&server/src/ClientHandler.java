import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
public class ClientHandler implements Runnable{
private final Socket soc;
    public ClientHandler(Socket client) { this.soc=client;}
    @Override
    public void run() {
 PrintWriter writer=null;
 BufferedReader reader=null;
        try {
            writer=new PrintWriter(soc.getOutputStream(),true);
            reader=new BufferedReader(new InputStreamReader(soc.getInputStream()));
            String line;
            while((line=reader.readLine())!=null){
                System.out.printf("Send from client  %s \n",line);
                writer.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(writer!=null){
                    writer.close();
                }
                if(reader!=null){
                    reader.close();
                    soc.close();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


