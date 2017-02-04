public class binaryTranslate {

	public static void main(String[] args) 
	{
		int [] binary = new int[8];
		
		for(int i=0; i<binary.length; i++)
		{
			binary[i] = (int)(Math.random()*2);
			System.out.print(binary[i]);
		}
		
		System.out.println();
		
		int result = 0;
		
		for(int i=0; i<binary.length; i++)
		{
			result += binary[i] * Math.pow(2,binary.length-i-1);
		}
		
		System.out.println(result);
	}
}
