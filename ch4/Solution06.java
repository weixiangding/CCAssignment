
public class Solution06 {
	// Structure of TreeNode
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode parent;
		TreeNode(int x) { val = x; }
	}
	// A function to find the next Node with parent pointer
	public static TreeNode next(TreeNode n){
		if (n==null) return null;
		
		if (n.right!=null){
			n=n.right;
			while (n.left!=null){
				n=n.left;
			}
			return n;
		}
		// I realized this case only after reading the textbook
		// It is possible that n do not have right tree.
		else {
			TreeNode temp = n;
			TreeNode x = temp.parent;
			while (x.left!=temp){
				temp=x;
				x=x.parent;
			}
			return x;
		}
		
	}
	// Main function to test
	public static void main(String args[]){
    	TreeNode test = new TreeNode(2);
    	test.left = new TreeNode(1);
    	test.left.parent=test;
    	test.right = new TreeNode(3);
    	test.right.parent=test;
    	System.out.println(next(test).val);
	}
}
