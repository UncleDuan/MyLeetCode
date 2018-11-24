/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode c1=l1;
		ListNode c2=l2;
		
		ListNode head= new ListNode(0);
		ListNode currenthead = head;
		int sum=0;
		boolean carry=false;
		//当不为null时 一直往后加
		while(c1!=null||c2!=null) {
			if (c1==null) {
                sum= currenthead.val+c2.val;
				c2=c2.next;
			}
			else if (c2==null) {
				sum= currenthead.val+c1.val;
				c1=c1.next;
			}
			else {
				sum=c1.val+c2.val+currenthead.val;
				c1=c1.next;
				c2=c2.next;
			}
			if(sum>=10) {
				sum-=10;
                currenthead.val=sum;
                currenthead.next = new ListNode(1);
                currenthead=currenthead.next;
			}
			else{
                currenthead.val=sum;
                //判断结束条件
                if(c1 == null && c2 == null)
                    currenthead.next=null;
                else
                currenthead.next = new ListNode(0);
			    currenthead=currenthead.next;
            }
			
		}
		
	return head;
    }
}
