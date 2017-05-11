
public class Payroll {
	
	public static void main(String[] args) {

		Employee[] staff = new Employee[3];

		staff[0] = new Employee("Jo Schmoe", "Warehouse", 14.50);
		staff[1] = new UnionEmployee("Jim Hoff", "Transport", 17.25, 45.00);
		staff[2] = new CommissionedEmployee("Fast Eddy", "Sales", 12.90, 0.025, 3500);

		int total = 0;
		System.out.println("35 hours each");
		for (int i = 0; i < staff.length; i++) {
			System.out.println(staff[i] + "\tPay: " + staff[i].getWeeklyPay(35));
			total += staff[i].getWeeklyPay(35);
		}
		System.out.println("Payroll total for the week: " + total);

		total = 0;
		System.out.println("\n\n40 hours each");
		for (int i = 0; i < staff.length; i++) {
			System.out.println(staff[i] + "\tPay: " + staff[i].getWeeklyPay(40));
			total += staff[i].getWeeklyPay(40);
		}
		System.out.println("Payroll total for the week: " + total);

		total = 0;
		System.out.println("\n\n > than 45 hours each");
		for (int i = 0; i < staff.length; i++) {
			System.out.println(staff[i] + "\tPay: " + staff[i].getWeeklyPay(45));
			total += staff[i].getWeeklyPay(45);
		}
		System.out.println("Payroll total for the week: " + total);
		
		total = 0;
		System.out.println("\n\nEmployee gets promotion + raise");
		staff[0].setDepartment("Management");
		staff[0].setPay(16.00);
		System.out.println(staff[0].toString() + "\tPay Rate: " + staff[0].getPayRate());
				
		
		System.out.println("\n\nUnion gets lower dues");
		((UnionEmployee) staff[1]).setDues(35.00);
		System.out.println(staff[1].toString());
		
		System.out.println("\n\nCommissioned gets higher rate and sales");
		((CommissionedEmployee) staff[2]).setCommission(0.03);
		((CommissionedEmployee) staff[2]).setSales(4000);
		System.out.println(staff[2].toString());
		
	}
}
