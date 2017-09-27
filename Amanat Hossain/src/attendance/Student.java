package attendance;

public class Student implements Attendee {
	private static final String first = null;
	private static final String last = null;
	private boolean here;
	private String firstName = this.first;
	private String lastName = this.last;
	public Student(String firstName, String lastName) {
		
	}

	
	public boolean isPresent() {
		if(here==true) {
			return true;
		}
		else
			return false;
	}

	
	public void setPresent(boolean present) {
		if(isPresent()==true) {
			present=true;
		}
		else {
			present=false;
		}
		this.here=present;
	}

	
	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	
	public boolean mathces(String first, String last) {
		
	}

	
	public boolean matches(String last) {
	
	}

	
	public String getReportString() {
		String line = lastName;
		if(lastName.length() < 20 && first.length() < 20) {
			line = lastName.substring(0,17) + ("...") + first.substring(0,17) + ("...") + isPresent();
		}
		return line;
	}

}
