
public class SumArray {

	public static void main(String[] args) 
	{
		int [] numbers = {4,3,5,11,2,13};
		
		int totalEvenElements=0, totalOddElements=0, totalEvenIndices=0, totalOddIndices=0;
		
		for(int x:numbers)
		{
			if(x/2.0 == x/2)
				totalEvenElements += x;
			
			else
				totalOddElements +=x;	
		}
		
		System.out.println("Sum of even elements: " + totalEvenElements);
		System.out.println("Sum of odd elements: " + totalOddElements);
		
		for(int i=0; i<numbers.length; i++)
		{
			if(i/2.0==i/2)
				totalEvenIndices += numbers[i];
			else
				totalOddIndices += numbers[i];
		}
		
		System.out.println("\nSum of even indices: " + totalEvenIndices);
		System.out.println("Sum of odd indices: " + totalOddIndices);
	}

}
