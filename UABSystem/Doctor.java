package UABSystem;

public class Doctor extends MedicalStaff {
		
	//constructors
	public Doctor(String name, String bID, String role, String dep) {
		super(name, bID, role, dep);
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + " BlazerID: " + getbID()
		+ " Role: " + getRole() + " Department: " + getDep();
	}
	
}
