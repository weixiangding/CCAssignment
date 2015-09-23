
public class Solution04 {
	// Structure of treenode
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	// A function to find the height of a node
    public static int Height(TreeNode root){
        if (root==null) return 0;
        return Math.max(Height(root.left),Height(root.right))+1;
    }
    
    // A function to check whether a tree is balanced.
    public static boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        // If the height of root.left is larger the height of root.right more than 2, return false;
        int temp=Math.abs(Height(root.left)-Height(root.right));
        if (temp>1) return false;
        else return isBalanced(root.left)&&isBalanced(root.right);
    }
    // Main function to test
    public static void main(String args[]){
    	TreeNode test = new TreeNode(1);
    	test.left = new TreeNode(2);
    	test.right = new TreeNode(3);
    	test.right.right = new TreeNode(3);
    	test.right.right = new TreeNode(3);
    	System.out.println(isBalanced(test));
    }
}
