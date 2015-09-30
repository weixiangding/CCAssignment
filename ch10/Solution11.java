
public class Solution11 {
	// A function to sort the array into an alternating sequence of peaks and valleys.
	public static int[] adjust(int[] nums){
		int len = nums.length;
		if(len==0) return nums;
		for (int i=1; i<len; i+=2){
			if(nums[i]<nums[i-1]||nums[i]<nums[i+1])
			{ 
				if (nums[i-1]>=nums[i+1])
				{
					int temp=nums[i-1];
					nums[i-1]=nums[i];
					nums[i]=temp;
				}
				else{
					int temp=nums[i+1];
					nums[i+1]=nums[i];
					nums[i]=temp;
				}
			}
		}
		return nums;
	}
	
	public static void main(String args[]){
		int[] test = new int[7];
		test[0]=5;
		test[1]=8;
		test[2]=6;
		test[3]=2;
		test[4]=3;
		test[5]=4;
		test[6]=6;
		int[] ans = adjust(test);
		for (int i=0; i<ans.length; i++)
			System.out.println(ans[i]);
		
	}
}
