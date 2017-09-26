package attendance;

public class Student implements Attendee {
	private boolean here;
	
	public Student() {
		
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
		
	}

	
	public String getLastName() {
		
	}

	
	public boolean mathces(String first, String last) {
		
	}

	
	public boolean matches(String last) {
	
	}

	
	public String getReportString() {
		
	}

}
