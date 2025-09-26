package UABSystem;

public class Faculty extends UABPerson {
	
	//attributes
	private String dep;
	private int courses;
	
	//constructor
	public Faculty(String name, String bID, String dep, int courses) {
		super(name, bID);
		this.dep = dep;
		this.courses = courses;
	}
	
	//accessors mutators
	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public int getCourses() {
		return courses;
	}

	public void setCourses(int courses) {
		this.courses = courses;
	}
	//accessors mutators ^
	
	@Override
	public String toString() {
		return "Name: " + getName() + " BlazerID: " + getbID()
		+ " Department: " + getDep() + " Courses: " + getCourses();
	}
	
}
