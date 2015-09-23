
public class Solution05 {
	// structure of TreeNode
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	// A function to check whether is a binary search tree
	public static boolean isBinarySearch(TreeNode root){
		if (root==null) return true;
		return isBST(root, null, null);
	}
	// Use max and min to check
	public static boolean isBST(TreeNode root, Integer max, Integer min){
        if (root==null) return true;
        
        if ((min!=null && root.val<=min)||(max!=null && root.val>=max))
            return false;
		return (isBST(root.left,root.val,min)&&isBST(root.right,max,root.val));
	}
	// Main function to test
	public static void main(String args[]){
    	TreeNode test = new TreeNode(2);
    	test.left = new TreeNode(1);
    	test.right = new TreeNode(3);
    	test.right.right = new TreeNode(2);


    	System.out.println(isBinarySearch(test));
	}
}
