
public class Teacher extends Person
{
	private double salary;
	private String subject;
	
	public Teacher(String name, int age, String gender, double salary, String subject)
	{
		super(name, age, gender);
		this.salary = salary;
		this.subject = subject;
	}
	
	public String toString()
	{
		return super.toString() + " Salary: " + salary + " Subject Taught: " + subject;
	}
}
