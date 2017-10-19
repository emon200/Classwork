package arrays;

import java.util.Arrays;

public class ObjectArrays {

	public ObjectArrays() {
		Person [] people = new Person[20];
		populate(people);
		for(Person p:people) {
			p.mingle(people);
			p.printFriends();
			System.out.println("");
		}
	}

	private void populate(Person[] people) {
		for(int i =0; i<people.length;i++) {
			String firstName = randomNameFrom(Person.FIRST_START, Person.FIRST_MIDDLE, Person.FIRST_END );
			String lastName = randomNameFrom(Person.LAST_START, Person.LAST_MIDDLE, Person.LAST_END );
			//BIG IDEA!!!
			//In Object[] (but not primitive arrays like int[] or double[])
			//You can have multiple data types (sub-classes of the declared type)
			Borough b = randomBorough();
			if(Math.random() < .6) {
				//60% of the time...
				int grade = (int)(Math.random()*5)+9;
				people[i] = new Student(firstName, lastName, b,grade);
			}else {
				//the other 40% of the time
				people[i] = new Person(firstName, lastName, b);	
			}
		}

	}

	private Borough randomBorough() {
		return Borough.NY_BOROUGHS[(int)(Math.random()*Borough.NY_BOROUGHS.length)];
	}

	private String randomNameFrom(String[] a, String[] b, String[] c) {
		return get(a)+get(b)+get(c);
	}

	private String get(String[] a) {
		return a[(int)(Math.random()*a.length)];
	}

	public Person[] selectGroup(Person[] population, int length) {
		Person[] group = new Person[length];
		group[0] = selectAPerson(population);
		for(int i = 0; i< length;i++) {
			Person nextPerson = selectAPerson(population);
			while(personInGroup(group, nextPerson)) {
				nextPerson = selectAPerson(population);
			}
			group[1] = nextPerson;
		}
		return group;
	}
	
	/**
	 * return the number of differences between the two arrays
	 * A "difference" means they don't have the same element
	 * at the same position
	 * PRECONDITION: the two arrays have the same 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public double countDifferences(Person[] arr1, Person[] arr2) {
		for(int i =0; i<arr1.length;i++) {
			if(arr1 == arr2) {
				
			}
		}
	}
	
	/**
	 * calls count differences on two Person arrays,
	 * each array must contain the same elements, but randomly ordered
	 * Print the number of differences between the two arrays
	 * Do this 100 times, print the average (hint: average needs to be a double)
	 */
	public void testShuffling() {
		
	}

	public static boolean personInGroup(Person[] group, Person nextPerson) {
		for(int i = 0; i<group.length; i++) {
			if(group[i] == nextPerson) {
				return true;
			}
		}
		return false;
	}

	private Person selectAPerson(Person[] population) {
		int randomNum = (int)(Math.random()*population.length);
		return population[randomNum];
	}
}
