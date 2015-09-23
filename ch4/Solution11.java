import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Solution11 {
	static List<TreeNode> answer= new ArrayList<TreeNode>();
	static int size=0;
	// Structure of TreeNode
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	// To get a random TreeNode
	public static TreeNode getRanNode(TreeNode root){
		// Save all the nodes in a array and get a random node;
		// It is slow but working.
		// The solution in the textbook is pretty good!
		if(root==null) return root;
		store(root);
		Random random = new Random();
		int i = random.nextInt(size);
		return answer.get(i);
	}
	public static void store(TreeNode root){
		if (root==null) {
			return;
		}
		else {
			answer.add(root);
			size++;
		}
		store(root.left);
		store(root.right);
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
		TreeNode ans = getRanNode(test1);
		System.out.println(ans.val);
		
	}
}