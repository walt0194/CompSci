
public class People 
{
	public static void main(String[] args) 
	{
		Person[] people = new Person[4];
		
		people[0] = new Person("Dave", 16, "Male");
		people[1] = new Student("Rich", 12, "Male", 4.0, 842834);
		people[2] = new Teacher("Khaled", 16, "Male", 40800, "Math");
		people[3] = new CollegeStudent("Walt", 17, "Male", 3.0, 374953, "Comp Sci", 1);
		
		for(int i=0; i<people.length; i++)
		{
			System.out.println(people[i].toString());
		}
	}

}
