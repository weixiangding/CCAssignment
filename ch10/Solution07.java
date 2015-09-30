import java.util.*;

// In this problem, I first use HashMap to store the data. 
/* However, the solution at the textbook looks smarter.
 * Since I do not have 4 billion non-negative integers, I still use HashMap to solve the problem.
 */
public class Solution07 {
	static HashMap store = new HashMap();
	public static void findmiss(int[] nums){
		int len = nums.length;
		int max=0;
		for (int i=0; i<len; i++){
			// Use HashMap to store and check
			if (!store.containsKey(nums[i])){
				store.put(nums[i], 1);
				if (nums[i]>max)
					max=nums[i];
			}
		}
		// Output
		for (int i=0; i<=max; i++){
			if (!store.containsKey(i))
				System.out.println(i);
		}
		return;
		}
	// Main function to test
	public static void main(String args[]){
		int[] test = new int[7];
		test[0]=2;
		test[1]=1;
		test[2]=6;
		test[3]=2;
		test[4]=3;
		test[5]=3;
		test[6]=2;
		findmiss(test);
	}
}
