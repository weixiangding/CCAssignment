import java.util.Stack;

// A stack structure to perform all operations and getMin()
public class Solution02 {
    Stack<Integer> ans= new Stack<Integer>();
    Stack<Integer> ans1= new Stack<Integer>();
    // push function
    public void push(int x) {
        ans.add(x);
        if (ans1.empty()) ans1.add(x);
        else {
            if (x<=ans1.peek()){
                ans1.add(x);
            }
        }
    }
    
    // pop function
    public void pop() {
        int temp=ans.peek();
        if (temp==ans1.peek())
        ans1.pop();
        ans.pop();
    }
    
    // return the top element
    public int top() {
        return ans.peek();
    }
    
    // get the minimum element
    public int getMin() {
        return ans1.peek();
    }
    
    // main function to test
    public static void main (String args[]){
    	Solution02 a = new Solution02();
    	a.push(4);
    	a.push(7);
    	a.push(3);
    	a.push(9);
    	System.out.println(a.getMin());
    	System.out.println(a.top());
    }
}
