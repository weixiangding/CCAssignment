
public class Solution23 {
	/* Structure for ListNode */
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	/* A function to delete the middle node */
	 public static void deleteMid(ListNode mid){
		 /* Handle edge case */
		 if (mid.next==null) return;
		 /* copy the val of next node and delete next node */
		 ListNode temp = mid.next;
		 mid.val=temp.val;
		 mid.next=temp.next;
		 return ;
	 }
	 /* Main function to test */
	 public static void main(String args[]){
		 ListNode a1 = new ListNode(1);
		 ListNode a2 = new ListNode(2);
		 ListNode a3 = new ListNode(3);
		 ListNode a4 = new ListNode(4);
		 ListNode a5 = new ListNode(5);
		 a1.next=a2;
		 a2.next=a3;
		 a3.next=a4;
		 a4.next=a5;
		 a5.next=null;
		 /* Call the function and print the results */
		 System.out.println("The original linked list is");
		 System.out.print(a1.val+ " -> ");
		 System.out.print(a2.val+ " -> ");
		 System.out.print(a3.val+ " -> ");
		 System.out.print(a4.val+ " -> ");
		 System.out.print(a5.val);
		 System.out.println();
		 System.out.println("The linked list after middle node is deleted: ");
		 deleteMid(a3);
		 ListNode answer=a1;
		 System.out.print(answer.val+" -> ");
	     while (answer.next.next!=null){
	    		System.out.print(answer.next.val+" -> ");
	    		answer=answer.next;
	    	}
	    	System.out.print(answer.next.val);
	 }
}
