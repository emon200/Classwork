package arrays;

import java.util.Arrays;

public class ArraysMain {

	private String[] testArray;
	private int[] intRay;
	
	public ArraysMain() {
		intRay = new int[100];
		//populate(intRay);
	//	checkOccurences(intRay,3,18);
		populate1ToN(intRay);
		shuffle(intRay);
		//Arrays is a Utility class included in Java for formatting output
		System.out.println(Arrays.toString(intRay));
	}
		private void shuffle(int[] arr) {
			for(int i = 0;i<arr.length;i++) {
				swap(arr,(int)(Math.random()*arr.length),
						(int)(Math.random()*arr.length));
			}
		
	}
		private void swap(int[] arr, int i, int j) {
		int x = arr[j];
		arr[j] = arr[i];
		arr[i] = x;
		
		
	}
		private void populate1ToN(int[] arr) {
			for(int i = 0;i<arr.length;i++) {
				arr[i] = i+1;
			}
		}
		private void checkOccurences(int[] arr, int start, int end) {
			int[] counter = new int[end - start +1];
			for(int value: arr) {
				counter[value - start]++;
			}
			for(int i = 0;i < counter.length; i++) {
				System.out.println("A " +(start+i) + " was rolled " + counter[i] + " times. ");
			}
	}
		private void populate(int[] intRay) { 
			for(int i = 0; i<intRay.length;i++) {
				intRay[i] = diceRoll(3);
			}
			//This does not work:
//			for(int value:intRay) {
	//			value = diceRoll(2);
//			}
	}
		public void notes() {
			//1. collection of primitives or objects
			//SPECIAL NOTE: This is the ONLY collection of primitives
			
			//2. size cannot be modified
			
			/*
			 * 3. Elements of an array are REFERENCES to objects. 
			 * In other words, changing an element of an array changes
			 * the REFERENCE, not the object (more on this later)
			 */
			
			//_____________________________________________
			
			//There are two types of constructors, the first we've seen already:
			int[] firstType = {3,14,-9,10};
			//this constructor can only be used at the declaration. Error:
			//firstType = {12,13,14,15};
			
			//the 2nd type:
			testArray = new String[50];
			/*SPECIAL NOTE: for primitive arrays, when they are instantiated,
			they are automatically populated with 0's. This is not the case with
			Object arrays, which are populated by 'null'
			*/
			//standard 'for' loop
			for(int i = 0; i<testArray.length;i++) {
				System.out.println("The #" + i + "item is" + testArray[i]);
			}
			
			//for each loop (useful only when you don't need to keep track of an index
			for(String value:testArray) {
				//"for each int in testArray..."
				System.out.println(value);
			}
		}
	
	
	public static void main(String[] args) {
		ArraysMain arrayPractice = new ArraysMain();
	}
	
	/**
	 * Returns the result from rolling "number"
	 * @param numberOfDice
	 * @return
	 */
	public int diceRoll(int numberOfDice) {
		int x = 0;
		for(int i = 0;i<numberOfDice;i++) {
				x = x + 1 + (int)(Math.random() *6);
		}
		return x;
	}
}