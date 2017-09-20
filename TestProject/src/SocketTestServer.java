import java.net.*;
import java.io.*;

public class SocketTestServer 
{
	public static void main(String[] args) throws IOException
	{
		int port = 1100;
		BufferedReader BRInput = new BufferedReader(new InputStreamReader(System.in));
		String serverInput = "";
		String serverOutput = "Connection Established";
		
		try
		(
			ServerSocket testServer = new ServerSocket(port);
			Socket clientSocket = testServer.accept();
			PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
			BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		)
		{
			while(true)
			{
				serverOutput = in.readLine();
				System.out.println(serverOutput);
				
				serverInput = BRInput.readLine();
				
				if(serverInput != null)
				{
					out.println(serverOutput);
				}
			}
		}
		catch (IOException e)
		{
			System.err.println("IO error");
			System.exit(1);
		}
	}
}
