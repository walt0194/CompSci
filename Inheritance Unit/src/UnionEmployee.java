
public class UnionEmployee extends Employee
{
	private double dues;
	
	public UnionEmployee(String name, String department, double payRate, double dues)
	{
		super(name, department, payRate);
		this.dues = dues;
	}
	
	public void setDues(double dues)
	{
		this.dues = dues;
	}
	
	public double getWeeklyPay(int hours)
	{
		int overtime = hours - 40;
		
		if(overtime <= 0)
			overtime = 0;
		
		hours -= overtime;
		
		return hours*super.getPayRate() + overtime*(super.getPayRate()*1.5) - dues;
	}
	
	public String toString()
	{
		return super.toString() + "\tDues: " + dues;
	}
}
