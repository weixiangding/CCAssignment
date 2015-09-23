import java.util.ArrayList;
import java.util.LinkedList;


public class Solution03 {
	// TreeNode structure
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	//Get nodes at each depth
	// BFS
	public static ArrayList<LinkedList<TreeNode>> creat(TreeNode root){
		ArrayList<LinkedList<TreeNode>> answer = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		
		if (root==null) return answer;
		if (root!=null)
			current.add(root);
		
		while(current.size()>0){
			answer.add(current);
			LinkedList<TreeNode> parents = current;
			current = new LinkedList<TreeNode>();
			for (TreeNode parent : parents){
				if (parent.left!=null)
					current.add(parent.left);
				if (parent.right!=null)
					current.add(parent.right);
			}
			}
		return answer;
		}
	// Main function to test
	public static void main(String args[]){
    	TreeNode test = new TreeNode(1);
    	test.left = new TreeNode(2);
    	test.right = new TreeNode(3);
    	test.right.left = new TreeNode(4);
    	test.right.right = new TreeNode(5);
    	System.out.println(creat(test).get(0).getFirst().val);
    	System.out.println(creat(test).get(1).getFirst().val);
    	System.out.println(creat(test).get(2).getFirst().val);
	}
}

