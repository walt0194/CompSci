
public class CD
{

	private String artist;
	private String title;
	private double price;
	private int numTrax;

	public CD(String artist, String title, double price, int numTrax)
	{
		this.artist = artist;
		this.title = title;
		this.price = price;
		this.numTrax = numTrax;
	}
	
	public double getPrice()
	{
		return price;
	}

	public String toString()
	{
		return "Title:"+title+"\nArtist: "+artist+"\nPrice"+price+"Tracks"+numTrax;
	}

}

