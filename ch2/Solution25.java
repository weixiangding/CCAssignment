/* For the follow up question, To follow OOP principal,
 * what we need to do is to first reverse each linked list and
 * and then call the AddTwo function.
 */
public class Solution25 {
	/* Structure for ListNode */
	public static class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	/* A function to add two numbers represented by linked list */
	public static ListNode AddTwo(ListNode l1, ListNode l2){
		/* Handle edge cases */
        if (l1==null&l2==null) return null;
        if (l1==null&l2!=null) return l2;
        if (l1!=null&l2==null) return l1;
        ListNode pre= new ListNode(0);
        ListNode ans=pre;
        ListNode temp2= new ListNode(0);
        int cal=0;
        /* Add two numbers by digits */
        while (l1!=null&&l2!=null){
            int temp=cal+l1.val+l2.val;
            if (temp>=10)
            {
                temp=temp-10;
                cal=1;
            }
            else cal=0;
            ListNode temp1=new ListNode(temp);
            
            pre.next=temp1;
            pre=pre.next;
            l1=l1.next;
            l2=l2.next;
            temp2=temp1;
        }
        /* If there is a carry then deal with the carry */
        if (cal==1){
        	/* if all digits have been added then open a new node to save carry 1*/
            if (l1==null&l2==null){
            ListNode temp1=new ListNode(cal);
            pre.next=temp1;
            }
            /* if l1 is shorter than l2 then deal with the carry of l2 */
            else if (l1==null&l2!=null){
                while (l2!=null)
                	{
                    	int temp=cal+l2.val;
                    	if (temp>=10)
                    	{
                    		temp=temp-10;
                    		cal=1;
                    	}
                    	else cal=0;
                    	ListNode temp1=new ListNode(temp);
                    	pre.next=temp1;
                    	pre=pre.next;
                    	l2=l2.next;
                    	if (l2==null&&cal==1)
                    	{
                    		ListNode temp3=new ListNode(1);
                    		pre.next=temp3;
                
                    	}
                	}
            }
            /* if l2 is shorter than l1 then deal with the carry of l1 */
            else if (l2==null&l1!=null){
                while (l1!=null)
                	{
                    	int temp=cal+l1.val;
                    	if (temp>=10)
                    	{
                    		temp=temp-10;
                    		cal=1;
                    	}
                    	else cal=0;
                    	ListNode temp1=new ListNode(temp);
                    	pre.next=temp1;
                    	pre=pre.next;
                    	l1=l1.next;
                    	if (l1==null&&cal==1)
                    	{
                    		ListNode temp3=new ListNode(1);
                    		pre.next=temp3;
                    	}
                	}
                }
        }
        /* If carry is 0, then add last part of longer linked list */
        if (cal==0){
        	if (l1==null&l2!=null) 
        		temp2.next=l2;
        	if (l2==null&l1!=null) 
        		temp2.next=l1;
        }
        return ans.next;
        
    }
	/* Main function to test */
	public static void main(String args[]){
		/* Test sample */
    	ListNode a1 = new ListNode(3);
    	ListNode a2 = new ListNode(1);
    	ListNode a3 = new ListNode(7);
    	ListNode a4 = new ListNode(5);
    	ListNode a5 = new ListNode(9);
    	ListNode a6 = new ListNode(2);
    	a1.next=a2;
    	a2.next=a3;
    	a3.next=null;
    	a4.next=a5;
    	a5.next=a6;
    	a6.next=null;
    	/* Call the function and print the result */
    	System.out.println("The first Linked List is ");
    	System.out.print(a1.val+" -> ");
    	System.out.print(a2.val+" -> ");
    	System.out.print(a3.val);
    	System.out.println();
    	System.out.println("The second Linked List is ");
    	System.out.print(a4.val+" -> ");
    	System.out.print(a5.val+" -> ");
    	System.out.print(a6.val);
    	System.out.println();
    	System.out.println("Their sum is ");
    	ListNode answer = AddTwo(a1, a4);
    	System.out.print(answer.val+" -> ");
    	while (answer.next.next!=null){
    		System.out.print(answer.next.val+" -> ");
    		answer=answer.next;
    	}
    	System.out.print(answer.next.val);
	}
    	
}
			

