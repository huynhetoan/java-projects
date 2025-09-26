package UABSystem;

public class Advisor extends UABPerson {
	
	//attributes
	private String dep, group;
	
	//constructors
	public Advisor(String name, String bID, String dep, String group) {
		super(name, bID);
		this.dep = dep;
		this.group = group;
	}

	//accessors mutators
	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}
	//accessors mutators ^
	
	@Override
	public String toString() {
		return "Name: " + getName() + " BlazerID: " + getbID() + 
				" Department: " + getDep() + " Group: " + getGroup();
	}
	
}
