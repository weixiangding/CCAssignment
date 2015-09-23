import java.util.*;


public class Solution09 {
	// Structure of TreeNode
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	// Generate a sequence of Binary Search Tree
	// Actually, I am really confused about the problem, so I refer a lot to the textbook.
	// Even after that, I am still confused about the problem.
	public static ArrayList<LinkedList<Integer>> GenerateSeq(TreeNode root){
		ArrayList<LinkedList<Integer>> result = new ArrayList<LinkedList<Integer>>();
		
		if (root==null){
			result.add(new LinkedList<Integer>());
			return result;
		}
		
		LinkedList<Integer> prefix = new LinkedList<Integer>();
		prefix.add(root.val);
		
		ArrayList<LinkedList<Integer>> leftSeq = GenerateSeq(root.left);
		ArrayList<LinkedList<Integer>> rightSeq = GenerateSeq(root.right);
		for (LinkedList<Integer> left : leftSeq){
			for (LinkedList<Integer> right : rightSeq) {
				ArrayList<LinkedList<Integer>> weaved = new ArrayList<LinkedList<Integer>>();
				weaveLists(left, right, prefix, weaved);
				result.addAll(weaved);
			}
		}
		return result;
	}
	
	public static void weaveLists(LinkedList<Integer> first, LinkedList<Integer> second,  LinkedList<Integer> prefix, ArrayList<LinkedList<Integer>> results){
		if (first.size()==0||second.size()==0){
			LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
			result.addAll(first);
			result.addAll(second);
			results.add(result);
			return;
		}
		
		int hfirst = first.removeFirst();
		prefix.addLast(hfirst);
		weaveLists(first,second,prefix,results);
		prefix.removeLast();
		first.addFirst(hfirst);
		int hsecond = second.removeFirst();
		prefix.addLast(hsecond);
		weaveLists(first,second,prefix, results);
		prefix.removeLast();
		second.addFirst(hsecond);
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
		ArrayList<LinkedList<Integer>> answer= new ArrayList<LinkedList<Integer>>();
		answer=GenerateSeq(test1);
		System.out.println(answer.size());
		for (int i=0; i<answer.size(); i++){
			while(answer.get(i).size()!=0){
				System.out.print(answer.get(i).peek());
				answer.get(i).poll();
			}
			System.out.println();
		}
		
	}
}
