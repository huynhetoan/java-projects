package UABSystem;

public class ITProfessional extends UABPerson {
	
	//attributes
	private String team;
	
	//constructors
	public ITProfessional(String name, String bID, String team) {
		super (name, bID);
		this.team = team;
	}
	
	//accessors mutators
	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	//accessors mutators ^
	
	@Override
	public String toString() {
		return "Name: " + getName() + " BlazerID: " + getbID()
		+ " Team: " + getTeam();
	}
	
}
