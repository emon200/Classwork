package arrays2d;

public class Main {

	public static void main(String[] args) {

	}

	/**
	 * increases the element in arr at index psn
	 * and decreases the elements at psn -1 and psn +1, if they exist
	 *
	 *THIS idea is another major topic in AP CSA.
	 *It is the idea of avoiding an ArrayIndexoutOfBoundsException
	 *you will see it on quizzes, tests, and project rubrics
	 *SO ALWAYS BE MINDFUL!
	 *@param arr
	 *@param psn
	 */
	public static void changeNeighbors(int[] arr, int psn) {
		int x = 0;
		int y = 0;
		int z = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[psn] <0) {
				
			}
			if(arr[i] == psn) {
			x=	arr[i] + 1;
			y = arr[i-1] -1;
			z= arr[i+1] -1;
			}
		}
	}
	
}
