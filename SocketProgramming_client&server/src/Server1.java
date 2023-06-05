import java.io.*;
import java.net.*;
class Server1 {
    public static void main(String[] args) {
    ServerSocket socket=null;
        try {
            System.out.println("waiting for client...");
            socket=new ServerSocket(9806);
            while(true){
                Socket client=socket.accept();
                System.out.println("new client connected "+client.getInetAddress().getHostAddress());
                ClientHandler clients=new ClientHandler(client);
                new Thread(clients).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                   e.printStackTrace();
                }
            }
        }
    }
}
