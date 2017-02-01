public class CDMain {

	public static void main(String[] args) 
	{
		CDCollection c = new CDCollection();
		c.addACd(new CD("BB King", "Blues CLUES", 13.22, 7));
		c.addACd(new CD("Santana", "Evil Women", 7.99, 8));
		c.addACd(new CD("Michael Jackson", "dude", 5.00, 5));
		
		System.out.println(c.getTotalCds());
		System.out.println(c.getTotalCost());
		System.out.println(c.getAverageCost());
		c.printItAll();
	}

}
