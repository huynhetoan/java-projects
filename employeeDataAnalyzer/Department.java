package employeeDataAnalyzer;

import java.util.ArrayList;

public class Department {

	private String name;
	private ArrayList<Employee> depEmployees = new ArrayList<>();
	
	public Department(String name) {
		this.name = name;
	}
	//add
	public void addEmployee(Employee emp) {
		depEmployees.add(emp);
	}
	//1
	public Employee getLowestPaidEmployee() {
		Employee lowest = null;
		for (Employee emp : depEmployees) {
			if (lowest == null || emp.getSalary() < lowest.getSalary()) {
				lowest = emp;
			}
		}
		return lowest;
	}
	//3
	public double getAverageSalary() {
		double total = 0;
		for (Employee emp : depEmployees) {
			total += emp.getSalary();
		}
		return total / depEmployees.size();
	}
	//5
	public int getLeadCount() {
		int count = 0;
		for (Employee emp : depEmployees) {
			if (emp.isLead()) count ++;
		}
		return count;
	}
	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Employee> getDepEmployees() {
		return depEmployees;
	}

	public void setDepEmployees(ArrayList<Employee> depEmployees) {
		this.depEmployees = depEmployees;
	}
	//^
	
}
