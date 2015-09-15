
public class Solution28 {
	/* Structure for ListNode */
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
	 /* A function to find the begin node of a loop */
	public static ListNode Loopbegin(ListNode head){
		  if (head==null) return null;
	        ListNode point1=head;
	        ListNode point2=head;
	        /* Point2 moves 2 steps and Point1 moves 1 step each time */
	        while(point2!=null&&point2.next!=null){
	            point2=point2.next.next;
	            point1=point1.next;
	            if (point2==point1){
	                break;
	            }
	        }
	        /* Record the place where they meet */
	        if (point2==null||point2.next==null) return null;
	        /* Set point1 to head */
	        point1=head;
	        /* When they meet again, the meeting point is the begin node of the loop */
	        while(point2!=point1){
	            point2=point2.next;
	            point1=point1.next;
	        }
	        return point1;
	  }
	/* Main function to test */
	 public static void main (String args[]){
		 /* Test Sample */
		  ListNode a1 =new ListNode(1);
		  ListNode a2 =new ListNode(2);
		  ListNode a3 =new ListNode(3);
		  ListNode a4 =new ListNode(4);
		  a1.next=a2;
		  a2.next=a3;
		  a3.next=a4;
		  a4.next=a2;
		  System.out.print(a1.val+" -> ");
		  System.out.print(a2.val+" -> ");
		  System.out.print(a3.val+" -> ");
		  System.out.print(a4.val+" -> ");
		  System.out.print(a2.val+" -> ");
		  System.out.print(a3.val);
		  System.out.println();
		  System.out.println("The loop begins at node");
		  /* Call the function and print the result */
		  System.out.println(Loopbegin(a1).val);
	  }
}

