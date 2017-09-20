import java.io.*;
import java.net.*;

public class SocketTestClient {
    public static void main(String[] args) throws IOException {

        String hostName = "127.0.0.1";
        int portNumber = 1100;

        try 
        (
            Socket socket = new Socket(hostName, portNumber);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) 
        {
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            String fromServer;
            String fromUser;

            while ((fromServer = in.readLine()) != null) 
            {
                System.out.println("Server: " + fromServer);
                
                fromUser = stdIn.readLine();
                
                if (fromUser.equals("close"))
                    break;
                
                if (fromUser != null) 
                {
                    out.println(fromUser);
                }
            }
        } 
        catch (UnknownHostException e) 
        {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } 
        catch (IOException e) 
        {
            System.err.println("Couldn't get I/O for the connection to " +
                hostName);
            System.exit(1);
        }
    }
}