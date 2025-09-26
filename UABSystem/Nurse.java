package UABSystem;

public class Nurse extends MedicalStaff {
	
	//attributes
	private String call;
	
	//constructors
	public Nurse(String name, String bID, String role, String dep, String call) {
		super(name, bID, role, dep);
		this.call = call;
	}
	
	//accessors mutators
	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}
	//accessors mutators ^
	
	@Override
	public String toString() {
		return "Name: " + getName() + " BlazerID: " + getbID() + 
				" Role: " + getRole() + " Department: " + getDep() + 
				" On Call: " + getCall();
	}
	
}
