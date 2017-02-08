
public class DiceRollBarGraph {

	public static void main(String[] args) 
	{	
		int[] possibleSums = new int[11];
		
		for(int i=0; i<100; i++)
			for(int j=0;j<possibleSums.length;j++)
				possibleSums[(int)(Math.random()*6+1)+(int)(Math.random()*6+1)-2]++;
		
		for(int i=0; i<possibleSums.length; i++)
		{
			System.out.print((i+2)+": ");
			for(int j=0; j<possibleSums[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
