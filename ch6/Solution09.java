
public class Solution09 {
	// A program to simulate the openning and closing of 100 lockers
	public static void main(String args[]){
		boolean[] lockers = new boolean[100];
		for (int i=0; i<100; i++){
			for (int j=i; j<100; j=j+i+1)
				lockers[j]=!lockers[j];
		}
		// Print the results.
		for (int i=0; i<100; i++)
			if (lockers[i])
				System.out.println(i);
	}
}
