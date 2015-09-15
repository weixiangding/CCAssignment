
public class Solution27 {
	/* Structure for ListNode */
	public static class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) {
	          val = x;
	          next = null;
	      }
	  }
   /* A function te find the intersection node of two linked list */
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        /* Handle the edge case */
    	if (headA==null||headB==null) return null;
        ListNode tempa=headA;
        ListNode tempb=headB;
        int numa=0;
        int numb=0;
        /* Find the numbers of listA and listB */
        while (tempa!=null){
            numa++;
            tempa=tempa.next;
        }
        while (tempb!=null){
            numb++;
            tempb=tempb.next;
        }
        tempa=headA;
        tempb=headB;
        /* if A is longer than B, first traverse numb-numa times to make numbers of other parts equal*/
        if (numa>numb){
            
            for (int i=1; i<=numa-numb; i++)
                tempa=tempa.next;
            for (int i=1; i<=numb; i++)
              {
            	  /* Then compare each node to find the intersertion Node */
                  if (tempa==tempb) return tempb;
                  else {
                      tempa=tempa.next;
                      tempb=tempb.next;
                  }

             }
             return null;
            }
        /* if B is longer than A, first traverse numa-numb times to make numbers of other parts equal*/
        if (numa<numb){
            for (int i=1; i<=numb-numa; i++)
                tempb=tempb.next;
            for (int i=1; i<=numb; i++)
              {
                  if (tempa==tempb) return tempb;
                  else {
                      tempa=tempa.next;
                      tempb=tempb.next;
                  }

             }
             return null;
            }
        /* If A and B have the same length, compare each node in order to find the intersection node */
        if (numa==numb){
            for (int i=1; i<=numb; i++)
              {
                  if (tempa==tempb) return tempb;
                  else {
                      tempa=tempa.next;
                      tempb=tempb.next;
                  }

             }
             return null;
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
    	a4.next=a7;
    	a6.next=a5;
    	a5.next=a4;
    	/* Call the function and print the result */
    	System.out.println("The first Linked list is ");
    	System.out.print(a1.val+" -> ");
    	System.out.print(a2.val+" -> ");
    	System.out.print(a3.val+" -> ");
    	System.out.print(a4.val+" -> ");
    	System.out.println(a7.val);
    	System.out.println("The second Linked list is ");
    	System.out.print(a6.val+" -> ");
    	System.out.print(a5.val+" -> ");
    	System.out.print(a4.val);
    	System.out.println();
    	System.out.println("The intersertion node is ");
    	System.out.println(getIntersectionNode(a1,a6).val);
    }
}