import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter?");
		
		int arrayLength = s.nextInt();
		
		int [] numbers = new int[arrayLength];
		
		System.out.println("Enter numbers to fill array");
		
		for(int i=0; i<numbers.length; i++)
		{
			numbers[i] = s.nextInt();
		}
		
		for(int i=arrayLength-1; i>=0; i--)
		{
			System.out.println(numbers[i]);
		}
		s.close();
	}

}
