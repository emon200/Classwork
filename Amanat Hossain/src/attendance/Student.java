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
		return first.toLowerCase().equals(firstName.toLowerCase()) && last.toLowerCase().equals(lastName.toLowerCase());
	}

	
	public boolean matches(String last) {
		return last.toLowerCase().equals(lastName.toLowerCase());
	}

	
	public String getReportString() {
		String line = lastName;
		if(lastName.length() > 20 && firstName.length() > 20) {
			line = lastName.substring(0,17) + ("...") + firstName.substring(0,17) + ("...") + isPresent() + "\n";
		}
		return line;
	}

}
