package UABSystem;

public class Student extends UABPerson {
	
	//attributes
	private String level, major;
	private double gpa;
	
	//constructors
	public Student(String name, String bID, String level, String major, double gpa) {
		super(name, bID);
		this.level = level;
		this.major = major;
		this.gpa = gpa;
	}

	//accessors mutators
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}	
	//accessors mutators ^
	
	@Override
	public String toString() {
		return "Name: " + getName() + " BlazerID: " + getbID()
		+ " Level: " + getLevel() + " Major: " + getMajor()
		+ " GPA: " + getGpa();
	}
	
}
