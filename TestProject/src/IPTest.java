import java.io.IOException;
import java.net.*;

public class IPTest {

	public static void main(String[] args) throws IOException
	{
		InetAddress inet = InetAddress.getByAddress( new byte[] {5,73,12,63});
		System.out.println(inet.isReachable(5000));
		
	}

}
