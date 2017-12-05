package search;

public class Hanoi {

	public static void main(String[] args) {
		TowerHanoi(3,"A","B","C");
	}
	public static void TowerHanoi(int n,String start,String help,String end) {
		if(n==1 || n==0) {
			System.out.println(start + " to " + end);
		}
		else {
			TowerHanoi(n-1,start,end,help);
			System.out.println(start + " to " + end);
			TowerHanoi(n-1,help,start,end);
		}
	}
}
