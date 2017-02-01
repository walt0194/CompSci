import java.util.Scanner;

public class MagicEightBall {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		String [] responses = {"Try again later","Yes", "Probably", "Maybe", "For Certain", "Unlikely", "Definatly Not", "Impossible to say"}; 
		
		System.out.println("Ask a question");
		
		String question = s.nextLine();
		
		System.out.println(responses[(int) (Math.random()*6)]);;
		
	}

}
