
public class SixInts 
{
	public static void main(String[] args)
	{
		int[] numbers = {10,11,12,13,14,15};
		
		for(int x:numbers)
			System.out.print(x+"\t");
		System.out.println();
		
		for(int i=0; i<numbers.length; i++)
			numbers[i] = (int) Math.pow(numbers[i], 2);
			
		for(int x:numbers)
			System.out.print(x+"\t");
		System.out.println();
		
		int temp = numbers[0];
		for(int i=0; i<numbers.length-1;i++)
			numbers[i] = numbers[i+1];
		numbers[numbers.length-1] = temp;
		
		for(int x:numbers)
			System.out.print(x+"\t");
		System.out.println();
		
		for(int i=0; i<numbers.length; i++)
			numbers[i] = 10+i;
		
		for(int x:numbers)
			System.out.print(x+"\t");
		System.out.println();
		
		temp = numbers[numbers.length-1];
		for(int i=numbers.length-1; i>0; i--)
			numbers[i] = numbers[i-1];
		numbers[0] = temp;
		
		for(int x:numbers)
			System.out.print(x+"\t");
		System.out.println();
	}
}
