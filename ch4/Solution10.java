
public class Solution10 {
	// Structure of TreeNode
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	// A function to check if a tree is a subtree of another tree
	public static boolean isSubtree(TreeNode root, TreeNode p){
		if (root==null&&p!=null) return false;
		if (p==null) return true;
		if (isSub(root,p)) return true;
		return isSubtree(root.left,p)||isSubtree(root.right,p);
	}
	// A function to check if a tree is a subtree of another tree
	public static boolean isSub(TreeNode root, TreeNode p){
		if (root==null&&p==null) return true;
		if (root==null&&p!=null) return false;
		if (root!=null&&p==null) return false;
		if (root.val!=p.val) return false;
		return isSub(root.left,p.left)&&isSub(root.right,p.right);
	}
	
	// Main function to test
	public static void main(String args[]){
		TreeNode test = new TreeNode(1);
    	test.left = new TreeNode(2);
    	test.left.left = new TreeNode(4);
    	test.left.right = new TreeNode(5);
    	test.right = new TreeNode(3);
    	test.right.left = new TreeNode(6);
    	test.right.right = new TreeNode(7);
    	TreeNode k = new TreeNode(3);
    	k.left = new TreeNode(6);
    	k.right = new TreeNode(7);
    	System.out.println(isSubtree(test,k));
	}
}
