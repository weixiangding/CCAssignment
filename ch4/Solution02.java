
public class Solution02 {
	// TreeNode structure
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	// A function to build the tree from the array
	public static TreeNode build(int nums[]){
		int len=nums.length;
		return buildTree(nums, 0, len-1);
	}
	
	// A function to build the tree from the array
	public static TreeNode buildTree(int nums[], int begin, int end){
		if (begin>end) return null;
		int mid=begin+(end-begin)/2;
			TreeNode head= new TreeNode(nums[mid]);
			head.left=buildTree(nums,begin,mid-1);
			head.right=buildTree(nums,mid+1,end);
		return head;
	}
	
	// Main function to test
	public static void main(String args[]){
		int[] test = new int[10];
		for (int i=0; i<10; i++)
			test[i]=i;
		TreeNode ans= build(test);
		System.out.println(ans.val);
		System.out.println(ans.left.val);
		System.out.println(ans.right.val);
	}
	
}
