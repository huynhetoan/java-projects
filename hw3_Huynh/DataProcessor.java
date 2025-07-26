package employeeDataAnalyzer;

import java.io.*;
import java.util.*;

public class DataProcessor {
	
	private ArrayList<Employee> employees = new ArrayList<>();
	private Map<String, Department> departments = new HashMap<>();
//reader
	public void readData(String filePath) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		String line;
		//error handling BOM
		while ((line = br.readLine()) != null) {
			 if (line.startsWith("\uFEFF")) {
	                line = line.substring(1);
	            }
			 //skip header
			if(line.startsWith("First Name")) continue;
			//split
			String[] parts = line.split(",");
			//parse
			Employee emp = new Employee(parts[0], parts[1], parts[2], parts[3], 
					Double.parseDouble(parts[4]), 
					Integer.parseInt(parts[5]), 
					parts [6].equalsIgnoreCase("Yes"));
			employees.add(emp);
			//makes new departments mapping
			departments.computeIfAbsent(emp.getDep(), Department::new).addEmployee(emp);
		}
		br.close();
	}
	//2
	public List<Employee> getEmployeeLessThanFourYears() {
		ArrayList<Employee> result = new ArrayList<>();
		for (Employee emp : employees) {
			if (emp.getYears() < 4) result.add(emp);
		}
		return result;
	}
	//4
	public ArrayList<Employee> getLongestTenuredEmployee() {
		ArrayList<Employee> result = new ArrayList<>();
		int maxYears = 0;
		for (Employee emp : employees) {
			if (emp.getYears() > maxYears) {
				maxYears = emp.getYears();
				result.clear();
				result.add(emp);
			} else if (emp.getYears() == maxYears) {
				result.add(emp);
			}
		}
		return result;
	}
	
	//getter & setter
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	public Map<String, Department> getDepartments() {
		return departments;
	}
	public void setDepartments(Map<String, Department> departments) {
		this.departments = departments;
	}
	//^
	
	
	
}


