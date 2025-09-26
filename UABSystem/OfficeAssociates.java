package UABSystem;

public class OfficeAssociates extends UABPerson {
	
	//attributes
	private String role, dep;
	
	//constructors
	public OfficeAssociates(String name, String bID, String role, String dep) {
		super(name, bID);
		this.role = role;
		this.dep = dep;
	}

	//accessors mutators
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}
	//accessors mutators ^
	
	@Override
	public String toString() {
		return "Name: " + getName() + " BlazerID: " + getbID()
		+ " Role: " + getRole() + " Department: " + getDep();
	}
	
}
