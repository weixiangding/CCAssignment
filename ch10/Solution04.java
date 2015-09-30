import java.util.ArrayList;


public class Solution04 {
	// A function to find element x.
	public static int findX(ArrayList<Integer> nums, int x){
	int index=1;
	while (nums.get(index)!=-1&&nums.get(index)<x)
		index*=2;
   	return BS(nums, index/2, index, x);
}
	// Use binary search to search the element.
	public static int BS(ArrayList<Integer> nums, int begin, int end, int x){
		while(begin<=end){
			int mid=begin+(end-begin)/2;
			if (nums.get(mid)==x)
				return mid;
			if (nums.get(mid)>x||nums.get(mid)==-1)
				end=mid-1;
			if (nums.get(mid)<x)
				begin=mid+1;
		}
		return -1;
	}
	
	
	// O(n) algorithm 
	/*public static int findX(ArrayList<Integer> nums, int x){
		int len = nums.size();
		int index=0;
		while(true){
			if(nums.get(index)==x)
				return index;
			if(nums.get(index)==-1)
				return -1;
			index++;
		}
	}*/
	// Main function to test
	public static void main(String args[]){
		ArrayList<Integer> test = new ArrayList<Integer>();
		test.add(2);
		test.add(4);
		test.add(6);
		test.add(9);
		test.add(-1);
		test.add(-1);
		test.add(-1);
		System.out.println(findX(test,9));
	}
}
