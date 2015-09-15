
public class Solution24 {
	/* Structure for ListNode */
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	/* A function to make partition at the value x of a Linked list */
    public static ListNode partition(ListNode head, int x) {
    	/* Handle edge case */
        if (head==null) return null;
        ListNode small = new ListNode(0);
        ListNode large = new ListNode(0);
        ListNode l=small;
        ListNode r=large;
        /* Divide the original list into two parts, left part is smaller than x */
        /* Right part is not smaller than x */
        while (head!=null){
            if (head.val<x){
                ListNode temp=small;
                temp.next=head;
                temp=temp.next;
                head=head.next;
                small=small.next;
            }
            else {
                ListNode temp=large;
                temp.next=head;
                temp=temp.next;
                head=head.next;
                large=large.next;
                
            }

        }
        small.next=r.next;
        large.next=null;
        
        return l.next;
    }
    /* Main function to test */
    public static void main(String args[]){
    	/* Test Sample */
    	ListNode a1 = new ListNode(3);
    	ListNode a2 = new ListNode(10);
    	ListNode a3 = new ListNode(8);
    	ListNode a4 = new ListNode(5);
    	ListNode a5 = new ListNode(10);
    	ListNode a6 = new ListNode(2);
    	ListNode a7 = new ListNode(1);
    	a1.next=a2;
    	a2.next=a3;
    	a3.next=a4;
    	a4.next=a5;
    	a5.next=a6;
    	a6.next=a7;
    	a7.next=null;
    	int part=5;
    	/* Call the function and print the results */
    	System.out.println("The original Linked List is ");
    	System.out.print(a1.val+" -> ");
    	System.out.print(a2.val+" -> ");
    	System.out.print(a3.val+" -> ");
    	System.out.print(a4.val+" -> ");
    	System.out.print(a5.val+" -> ");
    	System.out.print(a6.val+" -> ");
    	System.out.print(a7.val);
    	System.out.println();
    	System.out.println("The output Linked List is ");
    	ListNode answer = partition(a1, part);
    	System.out.print(answer.val+" -> ");
    	while (answer.next.next!=null){
    		System.out.print(answer.next.val+" -> ");
    		answer=answer.next;
    	}
    	System.out.print(answer.next.val);
    	
    }
}
