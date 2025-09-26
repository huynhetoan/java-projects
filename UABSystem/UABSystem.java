package UABSystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UABSystem {
	
	public static void main(String[] args) {
		
		try {
			List<Faculty> fList = new ArrayList<>();
			List<Student> sList = new ArrayList<>();
			List<OfficeAssociates> oList = new ArrayList<>();
			List<Advisor> aList = new ArrayList<>();
			List<ITProfessional> iList = new ArrayList<>();
			List<Doctor> drList = new ArrayList<>();
			List<Nurse> nsList = new ArrayList<>();
			
			//Reads file and makes arraylists
			UABPerson.fileData("uabEmployee.txt", fList, sList, oList,
							aList, iList, drList, nsList);
		
			System.out.println("Welcome to the UAB Employee System");
			boolean loop = true;
			
			//Menu loop
			while (loop) {
				Scanner sc = new Scanner(System.in);
				System.out.println("\nTo Display the UAB list: Enter 1"
						+ "\nTo Add a UAB Person: Enter 2"
						+ "\nTo Update the database: Enter 3"
						+ "\nTo Delete a UAB Person: Enter 4"
						+ "\nTo Exit: Enter 5");
				
				String menuNum = sc.nextLine();
				switch (menuNum) {
				//display
				case "1": {
					UABPerson.displayLists(fList, sList, oList, aList,
									iList, drList, nsList);
					break;
				}
				//add
				case "2": {
					UABPerson.example();
					Scanner add = new Scanner(System.in);
					String type = add.nextLine();
					UABPerson.addPerson(type, fList, sList, oList, 
							aList, iList, drList, nsList);
					break;
				}
				//update
				case "3": {
					UABPerson.updateList("uabEmployee.txt", fList, 
							sList, oList, aList, iList, drList, nsList);
					break;
				}
				//delete
				case "4": {
					System.out.println("Enter the Blazer ID of the person you want to delete.");
					Scanner delete = new Scanner(System.in);
					String bID = delete.nextLine();
					UABPerson.deletePerson(bID, fList, sList, oList, 
							aList, iList, drList, nsList);
					break;
				}
				//exit
				case "5": {
					System.out.println("Thank you for using the UAB System!");
					loop = false;
					break;
				}
			
				default: {
					System.out.println("Please try again.");
				}	
				}
			}
			
		} catch (IOException e) {
			System.out.println("Error occurred.");
			e.printStackTrace();
		}
	}
}
