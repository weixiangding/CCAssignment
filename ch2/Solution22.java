
public class Solution22 {
	/* Structure for ListNode */
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	/* A function to find the kth to last element of a linked list */
	/* Assumption: k is not larger than the number of nodes in the linked list 
	 * and k is larger than 0 */
	public static ListNode findKth(ListNode head, int k){
		/* Handle edge case */
		if (head==null) return null;
		int num=0;
		/* Use num to count, when num=k, return answer */
		while (head!=null){
			num++;
			if (num==k) return head;
			head=head.next;
		}
		return null;
	}
	/* Main function to test */
	public static void main(String args[]){
		/* Test sample */
		ListNode a1 = new ListNode(1);
    	ListNode a2 = new ListNode(2);
    	ListNode a3 = new ListNode(3);
    	ListNode a4 = new ListNode(4);
    	ListNode a5 = new ListNode(5);
    	ListNode a6 = new ListNode(6);
    	ListNode a7 = new ListNode(7);
    	a1.next=a2;
    	a2.next=a3;
    	a3.next=a4;
    	a4.next=a5;
    	a5.next=a6;
    	a6.next=a7;
    	a7.next=null;
    	int k=4;
    	/* Call the function and print the results */
    	ListNode answer = findKth(a1, k);
    	System.out.println("The original Linked List is ");
    	System.out.print(a1.val+" -> ");
    	System.out.print(a2.val+" -> ");
    	System.out.print(a3.val+" -> ");
    	System.out.print(a4.val+" -> ");
    	System.out.print(a5.val+" -> ");
    	System.out.print(a6.val+" -> ");
    	System.out.print(a7.val);
    	System.out.println();
    	System.out.println("The number k is "+k);
    	System.out.println("The result is ");
    	System.out.print(answer.val+" -> ");
    	while (answer.next.next!=null){
    		System.out.print(answer.next.val+" -> ");
    		answer=answer.next;
    	}
    	System.out.print(answer.next.val);
	}
}
