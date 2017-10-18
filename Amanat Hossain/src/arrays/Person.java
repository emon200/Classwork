package arrays;

public class Person {
	
	public static final String[] FIRST_START = {"Chr","M","L","Gr","Ph","B","Th","I"};
	public static final String[] FIRST_MIDDLE = {"isti","icha","era","eta","ala","ina","ara","at","am"};
	public static final String[] FIRST_END = {"","na","n","r","tian","s","rs","mp","les","man"};

	public static final String[] LAST_START = {"Chr","M","L","Gr","Ph","B","Th","I"};
	public static final String[] LAST_MIDDLE = {"isti","icha","era","eta","ala","ina","ara","at","am"};
	public static final String[] LAST_END = {"","na","n","r","tian","s","rs","mp","les","man"};

	
	private String firstName;
	private String lastName;
	private Borough home;
	
	public Person(String firstName, String lastName, Borough home){
		this.firstName = firstName;
		this.lastName = lastName;
		this.home = home;
	}
	
	public String toString() {
		return "My name is " +firstName+" "+lastName+" and I live in "+home+".";
	}
}
