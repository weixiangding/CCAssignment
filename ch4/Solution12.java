
public class Solution12 {
	static int bigsum=0;
	static int count=0;
	// Structure of TreeNode
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	// In this problem, I used brute search to solve. 
	// However, the solution in textbook is quite elegant and efficient,
	// Then I modify to the solution in the textbook.
	public static int count(TreeNode root, int sum){
		if (root==null) return 0;
		bigsum=sum;
		search(root, root.val);
		return count;
	}
	// A function to search path
	public static void search(TreeNode root, int val) {
		if (val==bigsum) {
			count++;
		}
		if (root.left==null&&root.right==null) return;
		if (root.left!=null)
			search(root.left, val+root.left.val);
		if (root.right!=null)
			search(root.right, val+root.right.val);
		return;
	}
	// Main function to test
	public static void main(String args[]){
		TreeNode test1 = new TreeNode(1);
		TreeNode test2 = new TreeNode(2);
		TreeNode test3 = new TreeNode(3);
		TreeNode test4 = new TreeNode(4);
		TreeNode test5 = new TreeNode(5);
		TreeNode test6 = new TreeNode(6);
		test1.left=test2;
		test1.right=test3;
		test2.left=test4;
		test2.right=test5;
		test3.left=test6;
		System.out.println(count(test1, 7));
	}
}
