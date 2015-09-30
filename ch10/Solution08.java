import java.util.*;

// In this problem, I also first use HashMap to solve the problem.
/* However, the solution at the textbook looks smarter.
 * Since I do not know how large is the HashMap and whether it will cause overflow, 
 * I still use HashMap to solve the problem.
 */
public class Solution08 {
	// A function to find duplicates.
	public static void findDup(int[] nums){
		int len = nums.length;
		if (len==0) return;
		// Use HashMap to store elements.
		HashMap<Integer,Integer> store = new HashMap<Integer,Integer>();
		for (int i=0; i<len; i++){
			if(!store.containsKey(nums[i]))
				store.put(nums[i], 1);
			else {
				if(store.get(nums[i])==1) {
					System.out.println(nums[i]);
					store.put(nums[i], 2);
				}
				
			}
		}
		return;
	}
	// Main function to test
	public static void main(String args[]){
		int[] test = new int[9];
		test[0]=2;
		test[1]=3;
		test[2]=2;
		test[3]=5;
		test[4]=5;
		test[5]=4;
		test[6]=2;
		test[7]=2;
		test[8]=15;
		findDup(test);
	}
}
