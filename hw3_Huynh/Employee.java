package employeeDataAnalyzer;

public class Employee {
	
	private String fName, lName, dep, position;
	private double salary;
	private int years;
	private boolean lead;
	
	public Employee(String fName, String lName, String dep, String position, double salary, int years, boolean lead) {
		this.fName = fName;
		this.lName = lName;
		this.dep = dep;
		this.position = position;
		this.salary = salary;
		this.years = years;
		this.lead = lead;
	}

	//getter & setter
	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public boolean isLead() {
		return lead;
	}

	public void setLead(boolean lead) {
		this.lead = lead;
	}
	//getter & setter ^
	
	
}
