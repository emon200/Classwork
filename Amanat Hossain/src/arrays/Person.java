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
	private Hobby hobby;
	private Person[] friends;
	
	public Person(String firstName, String lastName, Borough home){
		this.firstName = firstName;
		this.lastName = lastName;
		this.home = home;
		this.hobby = Hobby.randomHobby();
		friends = new Person[3];
	}
	
	/**
	 * chooses friends from people based on who is on same class 
	 * as this instance and who has the same hobbies
	 * @param people
	 */
	public void mingle(Person[] people) {
		System.out.println("");
		for(Person p:people) {
			if(p != this) {
				//reassign p to the better of the two friends your current best friend or p
				p = betterFriend(p,friends[0]);
				
				addFriendToFirstPlace(p);
			}
		}
	}
	
	private Person betterFriend(Person p, Person q) {
		//having a friend is better than no friend at all
		if(p == null) {
			return q;
		}
		if(q == null) {
			return p;
		}
		if(p.getClass() == this.getClass() && q.getClass() == this.getClass()) {
			if(p.hobby == this.hobby) {
				return p;
			}
			else if(q.hobby == this.hobby) {
				return q;
			}
		}
		if(p.getClass() == this.getClass()) {
			return p;
		}
		if(q.getClass() == this.getClass()) {
			return q;
		}
		//if none of these are true, just take p
		return p;
	}

	public void printFriends() {
		System.out.println("My name is " +firstName+lastName+" and these are my friends" );
		for(Person f:friends) {
			if(f!= null) {
				System.out.println(f);
			}
		}
	}
	
	/**
	 * Moves all Person in friends back one index and puts p at index 0
	 * @param p
	 */
	public void addFriendToFirstPlace(Person p) {
		//this for loop goes backwards...
		for(int i =friends.length-1;i>0;i--) {
			//..and moves each friend back a position
			friends[i] = friends[i-1];		
			}
		friends[0] = p;
	}
	
	public String toString() {
		return "My name is " +firstName+" "+lastName+" and I live in "+home+"." + "I like " +hobby;
	}
	
}
