import java.util.*;


public class Solution10 {
	// A function to get the rank of an element.
	public static int getRankOfNumber(int[] nums, int x){
		int len = nums.length;
		if (len==0) return -1;
		// Sort the array
		Arrays.sort(nums);
		if (x==nums[len-1]) return len-1;
		for (int i=0; i<len-1; i++){
			if (nums[i]==x&&nums[i+1]!=nums[i]) return i;
		}
		return -1;
	}
	// Main function to test
	public static void main(String args[]){
		int[] test = new int[9];
		test[0]=5;
		test[1]=1;
		test[2]=4;
		test[3]=4;
		test[4]=5;
		test[5]=9;
		test[6]=7;
		test[7]=13;
		test[8]=3;
		System.out.println(getRankOfNumber(test, 1));
		System.out.println(getRankOfNumber(test, 3));
		System.out.println(getRankOfNumber(test, 4));
		System.out.println(getRankOfNumber(test, 5));
		System.out.println(getRankOfNumber(test, 13));
		System.out.println(getRankOfNumber(test, 12));
	}
}
