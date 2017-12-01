package search;

public class PrimeFactorial {

	public static void main(String[] args){
		 int value = 21;
		 System.out.println(value+"! is equal to "+factorial(value));
		 System.out.println(value+ " has "+countPrimeFactors(value, 2)+" prime factors.");
		 }

		 public static int countPrimeFactors(int value, int testPrime) {
			 if(value == 1) {
				 return 0;
			 }
			 else if(value%testPrime == 0) {
				 return countPrimeFactors(value/testPrime, testPrime) +1;
			}
			else {
				testPrime++;
				return countPrimeFactors(value, testPrime);
			}
		 }

		 public static int factorial(int value) {
				 if(value > 1) {
					return value * factorial(value-1);
				 }
				 else {
					 return 1;
				 }
			 }
}
