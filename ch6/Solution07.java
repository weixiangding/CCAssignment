import java.util.*;

// The gender ratio after many generations should be very closed to 50%.
public class Solution07 {
	// A function to simulate the gender ratio after several generations.
	public static double Ngenerations(int n){
		int boys=0;
		int girls=0;
		for (int i=0; i<n; i++){
			// For each family, randomly generate boy or girl
			Random random = new Random();
			int boy=0;
			int girl=0;
			while(girl==0){
				if (random.nextBoolean()){
					boy++;
				}
				else girl++;
			}
			int[] people = {boy,girl};
			girls+=people[1];
			boys+=people[0];
		}
		// Calculate the ratio
		return (double)girls/(girls+boys);
	}
	// Main function to test
	public static void main(String argsp[]){
		System.out.println(Ngenerations(5));
		System.out.println(Ngenerations(50));
		System.out.println(Ngenerations(500));
		System.out.println(Ngenerations(5000));
	}
}
