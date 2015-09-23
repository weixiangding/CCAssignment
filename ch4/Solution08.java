
public class Solution08 {
	// Structure of TreeNode
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	// A function to test whether root include TreeNode p
	public static boolean include(TreeNode root, TreeNode p){
		if (root==p) return true;
		if (root==null) return false;
		return include(root.left,p)||include(root.right,p);
	}
	// A function to find the Lowest Common Ancestor of two TreeNodes
	public static TreeNode LowestComAncestor(TreeNode root, TreeNode p, TreeNode q){
		if (root==null) return null;
		else if (root==p) return p;
		else if (root==q) return q;
		if(include(root.left,p)!=include(root.right,q)) return root;
		if (include(root.left,p)){
			return LowestComAncestor(root.left,p,q);
		}
		else
			return LowestComAncestor(root.right,p,q);
		
	}
	// Main function to test
	public static void main(String args[]){
		TreeNode test = new TreeNode(2);
    	test.left = new TreeNode(1);
    	test.right = new TreeNode(3);
    	test.right.right = new TreeNode(7);
    	System.out.println(LowestComAncestor(test,test.left,test.right.right).val);
	}
}
