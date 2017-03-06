import java.util.Scanner;

public class Election {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		String[] names = new String[5];
		int[] votes = new int[5];
		
		for(int i=0; i<5; i++)
		{
			System.out.println("Enter a candidate's name:");
			names[i]=s.nextLine();
			System.out.println("Enter the number of votes they recieved:");
			votes[i]=s.nextInt();
			s.nextLine();
		}
		
		int votesTotal = 0;
		
		for(int i=0; i<5; i++)
		{
			votesTotal += votes[i];
		}
		
		System.out.println("Candidate\tVotes\tPercentage");
		System.out.println("---------------------------------------------------------------------------");
		
		for(int i=0; i<5; i++)
		{
			System.out.print(names[i]+"\t\tJoh");
			System.out.print(votes[i]+"\t\t");
			System.out.printf("%.0f", (votes[i]*100/(double)votesTotal));
			System.out.println("%");
		}
		
		System.out.println("Total Votes: "+votesTotal);
		
		int highestVotes = 0;
		int highestIndex = 0;
		
		for(int i=0; i<5; i++)
		{
			if(votes[i]>highestVotes)
			{
				highestVotes = votes[i];
				highestIndex = i;
			}
		}
		
		System.out.println("The new president is: "+names[highestIndex]);
	}

}
