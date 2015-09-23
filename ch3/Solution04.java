import java.util.Stack;


public class Solution04 {
    // Push element x to the back of queue.
    Stack<Integer> temp= new Stack<Integer>();
    Stack<Integer> temp1= new Stack<Integer>();
    public void push(int x) {
        temp.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {

        int t=0;
        while(!temp.empty()){
            t=temp.pop();
            temp1.push(t);
        }
        if (!temp1.empty()) temp1.pop();
        while(!temp1.empty()){
            t=temp1.pop();
            temp.push(t);
        }
    }

    // Get the front element.
    public int peek() {
        int t=0;
        while(!temp.empty()){
            t=temp.pop();
            temp1.push(t);
        }
        int ans=temp1.peek();
        while(!temp1.empty()){
            t=temp1.pop();
            temp.push(t);
        }
        return ans;
    }

    // Return whether the queue is empty.
    public boolean empty() {
        return temp.empty();
    }
    
    // Main function to test
    public static void main(String args[]){
    	Solution04 a = new Solution04();
    	a.push(5);
    	a.push(4);
    	a.push(3);
    	a.push(2);
    	a.push(1);
    	System.out.println(a.peek());
    	System.out.println(a.empty());
    	a.pop();
    	a.pop();
    	System.out.println(a.peek());
    	System.out.println(a.empty());
    }
}
