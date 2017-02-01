public class CDCollection
{
	private int totalCds;
	private double totalCost;
	private CD [] library;

	public CDCollection()
	{
		totalCds = 0;
		totalCost = 0;
		library = new CD[10];
	}
	
	public int getTotalCds()
	{ 
		return totalCds;
	}
	
	// add a Cd
	public void addACd(CD x)
	{
		library[totalCds] = x;
		totalCds ++;
	}

	public double getTotalCost()
	{
		for(int i=0; i<totalCds; i++)
		{
			totalCost += library[i].getPrice();
		}
		return totalCost;
	}
	
	public double getAverageCost()
	{
		return totalCost/(double)totalCds;
	}
	// method which will list all the Cds to the output
	public void printItAll()
	{
		for(CD x:library)
		{
			System.out.println("\n"+x);
		}
	}
}