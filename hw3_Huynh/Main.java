package employeeDataAnalyzer;

public class Main {
	
	public static void main(String[] args) {
		DataProcessor dp = new DataProcessor();
		//reads file
		try {
			dp.readData("employee_data.csv");			
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		//1
		System.out.println("1.) The lowest-paid employee in each department:");
		for (Department d : dp.getDepartments().values()) {
			Employee low = d.getLowestPaidEmployee();
			System.out.println(low.getfName() + " " + low.getlName() + ", " + d.getName() + ", " + low.getPosition() + ", $" + String.format("%.0f", low.getSalary()));
		}
		//2
		System.out.println("\n2.) Employees who have been with the company for less than 4 years:");
		for (Employee emp : dp.getEmployeeLessThanFourYears()) {
			System.out.println(emp.getfName() + " " + emp.getlName() + ", " + emp.getDep() + ", " + emp.getPosition() + ", $" + String.format("%.0f", emp.getSalary()) + ", " + emp.getYears() + ", " + (emp.isLead() ? "Yes" : "No"));
		}
		//3
		Department average = dp.getDepartments().get("Marketing");
		if (average != null) {
			System.out.println("\n3.) The average salary of employees in the Marketing department: $" + String.format("%.2f", average.getAverageSalary()));
		}
		//4
		System.out.println("\n4.) The employee with the longest tenure in the company:");
		for (Employee emp : dp.getLongestTenuredEmployee()) {
			System.out.println(emp.getfName() + " " + emp.getlName() + ", " + emp.getDep() + ", " + emp.getPosition() + ", $" + String.format("%.0f", emp.getSalary()) + ", " + emp.getYears() + ", " + (emp.isLead() ? "Yes" : "No"));
		}
		//5
		System.out.println("\n5.) Number of leads in each department:");
		for (Department d : dp.getDepartments().values()) {
			System.out.println(d.getName() + ": " + d.getLeadCount());
		}
		//6
		System.out.println("\n6.) Average salary per department:");
		for (Department d : dp.getDepartments().values()) {
			System.out.println(d.getName() + ": $" + String.format("%.2f", d.getAverageSalary()));
		}
		
	}
}
