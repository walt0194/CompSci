import java.io.*;
import java.net.*;

public class EchoClient {
    public static void main(String[] args) throws IOException {

        String hostName = "10.0.0.35";
        int portNumber = 443;

        try (
            Socket echoSocket = new Socket(hostName, portNumber);
            PrintWriter out = new PrintWriter(echoSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))
        ) 
        {
            String userInput = stdIn.readLine();    
            while (!userInput.equals("close")) 
            {
                out.println(userInput);
                System.out.println("echo: " + in.readLine());
                userInput = stdIn.readLine();
            }           
        } 
        catch (UnknownHostException e) 
        {
            System.err.println("Don't know about host " + hostName);
            System.exit(1);
        } 
        catch (IOException e) 
        {
            System.err.println("Couldn't get I/O for the connection to " + hostName);
            System.exit(1);
        } 
    }
}