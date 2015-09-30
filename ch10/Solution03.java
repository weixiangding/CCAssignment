
public class Solution03 {
	// A function to search a number is a rotated sorted array.
	public static int RotateIndex(int[] nums, int x){
		int len = nums.length;
		if (len==0) return -1;
		int begin=0;
		int left=0;
		int right=0;
		// Find the place where rotation begins.
		for (int i=0; i<len-1; i++)
		{
			if (nums[i]>nums[i+1])
			{
				begin=i+1;
				break;
			}
		}
		if (nums[len-1]>nums[0])
				begin=len-1;
		if (x<=nums[len-1]){
			left=begin;
			right=len-1;
		}
		else {
			left=0;
			right=begin-1;
		}
		// Divide it into two parts and use binary search.
		while (left<=right){
			int mid=left+(right-left)/2;
			if (nums[mid]==x)
				return mid;
			if (nums[mid]<x)
				left=mid+1;
			if (nums[mid]>x)
				right=mid-1;
		}
		return -1;
	}
	// Main function to test
	public static void main(String args[]){
		int[] test = new int[12];
		test[0]=15;
		test[1]=16;
		test[2]=19;
		test[3]=20;
		test[4]=25;
		test[5]=1;
		test[6]=3;
		test[7]=4;
		test[8]=5;
		test[9]=7;
		test[10]=10;
		test[11]=14;
		System.out.println(RotateIndex(test, 7));
		System.out.println(RotateIndex(test, 19));
		System.out.println(RotateIndex(test, 3));
	}
}
