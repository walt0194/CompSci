
public class CommissionedEmployee extends Employee
{
	public double commission;
	public double sales;
	
	public CommissionedEmployee(String name, String department, double payRate, double commission, double sales)
	{
		super(name, department, payRate);
		this.commission = commission;
		this.sales = sales;
	}
	
	public void setCommission(double commission)
	{
		this.commission = commission;
	}
	
	public void setSales(double sales)
	{
		this.sales = sales;
	}
	
	public double getWeeklyPay(int hours)
	{
		return hours*super.getPayRate() + sales*commission;
	}
	
	public String toString()
	{
		return super.toString() + "\tCommission: " + commission + "\tSales: " + sales;
	}
}
