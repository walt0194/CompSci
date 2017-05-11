
public class Test {

	public static void main(String[] args) 
	{
		int score = 93;
		String grade = "";
		
		if (score >= 93) 
			grade = "A";
		if (84 <= score && score <= 92) 
			grade = "B";
		if (75 <= score && score <= 83) 
			grade = "C";
		if (score < 75) 
			grade = "F";
		
		System.out.println(grade);
	}

}
