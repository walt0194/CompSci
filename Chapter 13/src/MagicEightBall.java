import java.util.Scanner;

public class MagicEightBall {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		String [] responses = {"Try again later",""}; //add responses
		
		System.out.println("Ask a question");
		
		String question = s.nextLine();
		
		System.out.println(responses[(int) (Math.random()*6)]);;
		
	}

}
