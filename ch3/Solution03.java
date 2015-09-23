import java.util.*;

// Because I knew little about OOP programming, I refer a lot to the textbook.
// But after that I have learned a lot.
// However, I still think the solution at textbook is too complicated and I implement it myself.
public class Solution03 {
	int num=10;
	static int max=5;
	static ArrayList<Stack<Integer>> store = new ArrayList<Stack<Integer>>();
	// popAt function
	public static void popAt(int index){
		store.get(index).pop();
	}
	
	// insert function
	public static void insert(int x){
		int size= store.size();
		for (int i=0; i<size; i++){
			if (store.get(i).size()>max){
				Stack<Integer> newstack = new Stack<Integer>();
				int temp=store.get(i).peek();
				store.get(i).pop();
				newstack.push(temp);
				store.add(newstack);
			}
		}
	}
	
	// Main function to test
	public static void main(String args[]){
		Stack<Integer> test = new Stack<Integer>();
		test.push(1);
		test.push(2);
		test.push(3);
		test.push(4);
		test.push(5);
		test.push(6);
		store.add(test);
		insert(6);
		System.out.println(store.get(0).peek());
		System.out.println(store.get(1).peek());
		popAt(0);
		System.out.println(store.get(0).peek());
	}
}

