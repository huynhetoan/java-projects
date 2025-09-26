package UABSystem;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class UABPerson {
	
	//attributes
	private String name, bID;
	
	//constructors
	public UABPerson(String name, String bID) {
		this.name = name;
		this.bID = bID;
	}

	//accessors mutators
	public String getName() {
		return name;
	}

	public void setName(String fName) {
		this.name = fName;
	}

	public String getbID() {
		return bID;
	}

	public void setbID(String bID) {
		this.bID = bID;
	}
	//accessors mutators ^
	
	//Methods
	//Scans file and puts it in arraylists #0
	public static void fileData(String filename, List<Faculty> fList, 
			List<Student> sList, List<OfficeAssociates> oList, 
			List<Advisor> aList, List<ITProfessional> iList, 
			List<Doctor> drList, List<Nurse> nsList) 
					throws IOException {
		
		File file = new File("uabEmployee.txt");
		Scanner sc = new Scanner(file);

		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			String [] parts = line.split(" ");
			//checks first letter
			String type = parts[0];
			
			switch (type) {
			//Faculty
			case "F": {
				String name = parts[1] + " " + parts[2];
				String bID = parts[3];
				String dep = parts[4];
				int courses = Integer.parseInt(parts[5]);
				
				Faculty f = new Faculty(name, bID, dep, courses);
				fList.add(f);
				break;
			}
			//Student
			case "S": {
				String name = parts[1] + " " + parts[2];
				String bID = parts[3];
				String level = parts[4];
				String major = parts[5];
				double gpa = Double.parseDouble(parts[6]);
				
				Student s = new Student(name, bID, level, major, gpa);
				sList.add(s);
				break;
			}
			//OfficeAssociates
			case "O": {
				String name = parts[1] + " " + parts[2];
				String bID = parts[3];
				String role = parts[4];
				String dep = parts[5];
				
				OfficeAssociates o = new OfficeAssociates(name, bID, role, dep);
				oList.add(o);
				break;
			}
			//Advisor
			case "A": {
				String name = parts[1] + " " + parts[2];
				String bID = parts[3];
				String dep = parts[4];
				String group = parts[5];
				
				Advisor a = new Advisor(name, bID, dep, group);
				aList.add(a);
				break;
			}
			//ITProfessional
			case "I": {
				String name = parts[1] + " " + parts[2];
				String bID = parts[3];
				String team = parts[4];
				
				ITProfessional i = new ITProfessional(name, bID, team);
				iList.add(i);
				break;
			}
			//Medical Staff
			case "M": {
				//Doctor
				if (parts.length == 6) {
					String name = parts[1] + " " + parts[2];
					String bID = parts[3];
					String role = parts[4];
					String dep = parts[5];
					
					Doctor dr = new Doctor(name, bID, role, dep);
					drList.add(dr);
					//Nurse
				} else if (parts.length == 7) {
					String name = parts[1] + " " + parts[2];
					String bID = parts[3];
					String role = parts[4];
					String dep = parts[5];
					String call = parts[6];
					
					Nurse ns = new Nurse(name, bID, role, dep, call);
					nsList.add(ns);
				}
				break;
			}
			}
		}
		sc.close();
	}
	
	//Displays #1
	public static void displayLists(List<Faculty> fList, 
			List<Student> sList, List<OfficeAssociates> oList, 
			List<Advisor> aList, List<ITProfessional> iList, 
			List<Doctor> drList, List<Nurse> nsList) {
		
		int total = fList.size() + sList.size() + oList.size()
			+ aList.size() + iList.size() + drList.size()
			+ nsList.size();
		int med = drList.size() + nsList.size();
		
		System.out.println("The UAB Employee System has the following"
				+ " employees:\nTotal Number of employees = " + total);
		//Prints all of Faculty list and number
		System.out.println("\nFaculty: " + fList.size());
		for (Faculty f : fList) {
			System.out.println(f);
		}
		System.out.println("\nStudents: " + sList.size());
		for (Student s : sList) {
			System.out.println(s);
		}
		System.out.println("\nOffice Associates: " + oList.size());
		for (OfficeAssociates o : oList) {
			System.out.println(o);
		}
		System.out.println("\nAdvisors: " + aList.size());
		for (Advisor a : aList) {
			System.out.println(a);
		}
		System.out.println("\nIT Professionals: " + iList.size());
		for (ITProfessional i : iList) {
			System.out.println(i);
		}
		System.out.println("\nTotal Medical Staff: " + med);
		System.out.println("Doctors: " + drList.size());
		for (Doctor dr : drList) {
			System.out.println(dr);
		}
		System.out.println("\nNurses: " + nsList.size());
		for (Nurse ns : nsList) {
			System.out.println(ns);
		}	
	}
	
	//add #2
	public static void addPerson(String line, List<Faculty> fList, 
			List<Student> sList, List<OfficeAssociates> oList, 
			List<Advisor> aList, List<ITProfessional> iList, 
			List<Doctor> drList, List<Nurse> nsList) {
		
		String[] parts = line.split(" ");
		String type = parts[0];
		
		switch (type) {
		//Faculty
		case "F": {
			String name = parts[1] + " " + parts[2];
			String bID = parts[3];
			String dep = parts[4];
			int courses = Integer.parseInt(parts[5]);
			
			Faculty f = new Faculty(name, bID, dep, courses);
			fList.add(f);
			System.out.println("New Faculty added: " + f);
			break;
		}
		//Student
		case "S": {
			String name = parts[1] + " " + parts[2];
			String bID = parts[3];
			String level = parts[4];
			String major = parts[5];
			double gpa = Double.parseDouble(parts[6]);
			
			Student s = new Student(name, bID, level, major, gpa);
			sList.add(s);
			System.out.println("New Student added: " + s);
			break;
		}
		//OfficeAssociates
		case "O": {
			String name = parts[1] + " " + parts[2];
			String bID = parts[3];
			String role = parts[4];
			String dep = parts[5];
			
			OfficeAssociates o = new OfficeAssociates(name, bID, role, dep);
			oList.add(o);
			System.out.println("New Office Associate added: " + o);
			break;
		}
		//Advisor
		case "A": {
			String name = parts[1] + " " + parts[2];
			String bID = parts[3];
			String dep = parts[4];
			String group = parts[5];
			
			Advisor a = new Advisor(name, bID, dep, group);
			aList.add(a);
			System.out.println("New Advisor added: " + a);
			break;
		}
		//ITProfessional
		case "I": {
			String name = parts[1] + " " + parts[2];
			String bID = parts[3];
			String team = parts[4];
			
			ITProfessional i = new ITProfessional(name, bID, team);
			iList.add(i);
			System.out.println("New IT Professional added: " + i);
			break;
		}
		//Medical Staff
		case "M": {
			//Doctor
			if (parts.length == 6) {
				String name = parts[1] + " " + parts[2];
				String bID = parts[3];
				String role = parts[4];
				String dep = parts[5];
				
				Doctor dr = new Doctor(name, bID, role, dep);
				drList.add(dr);
				System.out.println("New Doctor added: " + dr);
				
				//Nurse
			} else if (parts.length == 7) {
				String name = parts[1] + " " + parts[2];
				String bID = parts[3];
				String role = parts[4];
				String dep = parts[5];
				String call = parts[6];
				
				Nurse ns = new Nurse(name, bID, role, dep, call);
				nsList.add(ns);
				System.out.println("New Nurse added: " + ns);
			}
			break;
		}
		default:
			System.out.println("Unknown Object. " + line);
		}
	}
	//Example Templates
	public static void example() {
		System.out.println("Use the following Templates:\nFaculty:\n"
				+ "F FirstName LastName BlazerID Department Courses\n"
				+ "\nStudents:"
				+ "\nS FirstName LastName BlazerID Level Major GPA\n"
				+ "\nOffice Associates:"
				+ "\nO FirstName LastName BlazerID Role Department\n"
				+ "\nAdvisors:"
				+ "\nA FirstName LastName BlazerID Department Group\n"
				+ "\nIT Professionals:"
				+ "\nI FirstName LastName BlazerID Team\n"
				+ "\nDoctors:"
				+ "\nM FirstName LastName BlazerID Role Department\n"
				+ "\nNurses:"
				+ "\nM FirstName LastName BlazerID Role Department OnCall");
	}
	
	//Update #3
	public static void updateList(String filename, List<Faculty> fList,
			List<Student> sList, List<OfficeAssociates> oList, 
			List<Advisor> aList, List<ITProfessional> iList, 
			List<Doctor> drList, List<Nurse> nsList) throws IOException {
		
		PrintWriter pw = new PrintWriter(filename);
		
		for (Faculty f : fList) {
			pw.println("F " + f.getName() + " " + f.getbID() + " " + f.getDep() + " " + f.getCourses());
		}
		for (Student s : sList) {
			pw.println("S " + s.getName() + " " + s.getbID() + " " + s.getLevel() + " " + s.getMajor() + " " + s.getGpa());
			}
		for (OfficeAssociates o : oList) {
			pw.println("O " + o.getName() + " " + o.getbID() + " " + o.getRole() + " " + o.getDep());
			}
		for (Advisor a : aList) {
			pw.println("A " + a.getName() + " " + a.getbID() + " " + a.getDep() + " " + a.getGroup());
			}
		for (ITProfessional i : iList) {
			pw.println("I " + i.getName() + " " + i.getbID() + " " + i.getTeam());
			}
		for (Doctor dr : drList) {
			pw.println("M " + dr.getName() + " " + dr.getbID() + " " + dr.getRole() + " " + dr.getDep());
			}
		for (Nurse ns : nsList) {
			pw.println("M " + ns.getName() + " " + ns.getbID() + " " + ns.getRole() + " " + ns.getDep() + " " + ns.getCall());
			}
		pw.close();
		System.out.println("Updated list is saved to " + filename);
	}
	
	//Delete #4
	public static void deletePerson(String bID, List<Faculty> fList,
			List<Student> sList, List<OfficeAssociates> oList, 
			List<Advisor> aList, List<ITProfessional> iList, 
			List<Doctor> drList, List<Nurse> nsList) {
		
		boolean found = false;
		
		found |= fList.removeIf(f -> f.getbID().equalsIgnoreCase(bID));
		found |= sList.removeIf(s -> s.getbID().equalsIgnoreCase(bID));
		found |= oList.removeIf(o -> o.getbID().equalsIgnoreCase(bID));
		found |= aList.removeIf(a -> a.getbID().equalsIgnoreCase(bID));
		found |= iList.removeIf(i -> i.getbID().equalsIgnoreCase(bID));
		found |= drList.removeIf(dr -> dr.getbID().equalsIgnoreCase(bID));
		found |= nsList.removeIf(ns -> ns.getbID().equalsIgnoreCase(bID));

		if (found) {
		System.out.println("Blazer ID: " + bID + " has been deleted.");
		} else {
		System.out.println("Blazer ID: " + bID + " not found.");
		}
	}
	
}
