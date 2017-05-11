
public class CollegeStudent extends Student
{
	private String major;
	private int year;
	
	public CollegeStudent(String name, int age, String gender, double gpa, int idNumber, String major, int year)
	{
		super(name, age, gender, gpa, idNumber);
		this.major = major;
		this.year = year;
	}
	
	public String toString()
	{
		return super.toString() + " Major: " + major + " Year: " + year;
	}
}
