
public class Employee 
{
	private String name;
	private String department;
	private double payRate;
	
	public Employee(String name, String department, double payRate)
	{
		this.name = name;
		this.department = department;
		this.payRate = payRate;
	}
	
	public void setPay(double payRate)
	{
		this.payRate = payRate;
	}
	
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public double getPayRate()
	{
		return payRate;
	}
	
	public String toString()
	{
		return "\tName: " + name + "\tDepartent: " + department;
	}
	
	public double getWeeklyPay(int hours)
	{
		return hours*payRate;
	}
}
