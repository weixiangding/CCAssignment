
public class Solution26 {
	static ListNode last;
	/* Structure for ListNode */
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	/* A function to check if a linked list is palindrome */
	public static boolean isPalindrome(ListNode head){
		/* The conditions to return */
		if (head==null) return true;
		if (last==null) last=head;
		boolean ans = true;
		if (head.next!=null)
		{
			boolean nextpart;
			/* To check head.next recusively */
			nextpart=isPalindrome(head.next);
			ans = ans & nextpart;
		}
		/* Check head and tail whether they have the same values */
		if (head.val!=last.val){
			ans=false;
		}
		last=last.next;
		/* return answer */
		return ans;
		
	}
	/* Main function to test */
	public static void main(String args[]){
		/* Test sample */
    	ListNode a1 = new ListNode(1);
    	ListNode a2 = new ListNode(2);
    	ListNode a3 = new ListNode(3);
    	ListNode a4 = new ListNode(5);
    	ListNode a5 = new ListNode(3);
    	ListNode a6 = new ListNode(2);
    	ListNode a7 = new ListNode(1);
    	a1.next=a2;
    	a2.next=a3;
    	a3.next=a4;
    	a4.next=a5;
    	a5.next=a6;
    	a6.next=a7;
    	a7.next=null;
    	/* Call the function and print the result */
    	System.out.print(a1.val+" -> ");
    	System.out.print(a2.val+" -> ");
    	System.out.print(a3.val+" -> ");
    	System.out.print(a4.val+" -> ");
    	System.out.print(a5.val+" -> ");
    	System.out.print(a6.val+" -> ");
    	System.out.print(a7.val);
    	System.out.println();
    	System.out.println("Whether the linked list is palindrome?");
    	System.out.println(isPalindrome(a1));
	}
}
