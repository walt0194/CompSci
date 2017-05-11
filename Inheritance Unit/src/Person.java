public class Person 
{
	private String name;
	private int age;
	private String gender;
	
	public Person(String name, int age, String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String toString()
	{
		return "Name: " + name + " Age: " + age + " Gender: " + gender;
	}
}
