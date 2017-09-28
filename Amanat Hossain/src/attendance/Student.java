package attendance;

public class Student implements Attendee {
	private boolean present;
	private String firstName;
	private String lastName;
	
	public Student(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		present = false;
	}

	
	public boolean isPresent() {
		return present;
	}

	
	public void setPresent(boolean present) {
		this.present = present;
	}

	
	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}

	
	public boolean mathces(String first, String last) {
		if(first.toLowerCase().equals(firstName.toLowerCase())) {
			if(last.toLowerCase().equals(lastName.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

	
	public boolean matches(String last) {
		if(last.toLowerCase().equals(lastName.toLowerCase())) {
			return true;
		}
			return false;
	}

	
	public String getReportString() {
		String line = lastName;
		if(lastName.length() < 20 && firstName.length() < 20) {
			line = lastName.substring(0,17) + ("...") + firstName.substring(0,17) + ("...") + isPresent();
		}
		return line;
	}

}
