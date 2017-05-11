
public class Student extends Person
{
	private double gpa;
	private int idNumber;
	
	public Student(String name, int age, String gender, double gpa, int idNumber)
	{
		super(name, age, gender);
		this.gpa = gpa;
		this.idNumber = idNumber;
	}
	
	public String toString()
	{
		return super.toString() + " GPA: " + gpa + " idNumber: " + idNumber;
	}
}
