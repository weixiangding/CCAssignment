
public class Solution21 {
	/* Structure for ListNode */
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	/* A function to remove duplicate nodes */
	 public static ListNode Remove(ListNode head){
		 /* Handle edge cases */
		 if (head==null) return head;
		 /* Set two pointers point1 and point2, campare each two nodes and remove deplicates */
		 ListNode point1=head;
		 if (head.next==null) return head;
		 
		 while (point1.next!=null){
			 ListNode point2=point1.next;
			 while(point2.next!=null){
				 /* if they have the same value then remove the latter one */
				 if (point1.val==point2.val){
					 ListNode temp=point2.next;
					 point2.val = temp.val;
					 point2.next = temp.next;
				 }
				 else point2=point2.next;
			 }

			 point1=point1.next;
		 }
		 return head;
	 }
	 /* Main function to test */
	 public static void main(String args[]){
		 /* Test sample */
		 ListNode a1 = new ListNode(4);
		 ListNode a2 = new ListNode(2);
		 ListNode a3 = new ListNode(4);
		 ListNode a4 = new ListNode(4);
		 ListNode a5 = new ListNode(9);
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
		 System.out.println("The linked list without duplicates is ");
		 ListNode answer=Remove(a1);
	    	System.out.print(answer.val+" -> ");
	    	while (answer.next.next!=null){
	    		System.out.print(answer.next.val+" -> ");
	    		answer=answer.next;
	    	}
	    	System.out.print(answer.next.val);
	 }
}
