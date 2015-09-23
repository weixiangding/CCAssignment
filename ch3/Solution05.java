import java.util.Stack;


public class Solution05 {
	// A function to sort the stack
	public static Stack<Integer> sort (Stack<Integer> s){
		Stack<Integer> temp = new Stack<Integer>();
		while (!s.empty()){
		int num=s.pop();
		// Use another stack to store the minimum element.
	while(!temp.isEmpty()&&num>temp.peek()){
			int k=temp.pop();
			s.push(k);
		}
		temp.push(num);
		}
		return temp;
	}
	
	// Main function to test
	public static void main(String args[]){
		Stack<Integer> a = new Stack<Integer>();
		a.push(4);
		a.push(8);
		a.push(9);
		a.push(-2);
		a.push(3);
		a.push(5);
		Stack<Integer> ans=sort(a);
		while(!ans.isEmpty()){
			System.out.println(ans.pop());
		}
	}
}
