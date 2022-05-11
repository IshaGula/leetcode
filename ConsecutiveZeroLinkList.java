package leetcode;

import java.util.HashMap;

public class ConsecutiveZeroLinkList {

	ListNode head;
	 public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	 
	 public static void main(String[] args) {
		 ConsecutiveZeroLinkList list = new ConsecutiveZeroLinkList();
		 
			list = insert(list,0);
//			list = insert(list,4);
//			list = insert(list,2);
//			list = insert(list,-6);
//			list = insert(list,1);
//			list = insert(list,1);
//			list = insert(list,5);
//			list = insert(list,-6);
//			list = insert(list,1);
			
			traverse(list.head);
			
			System.out.println("Removed");
			
			list.head=removeZeroSumSublists(list.head);
			
			traverse(list.head);
			
	 }
	 
	 public static ConsecutiveZeroLinkList insert(ConsecutiveZeroLinkList list,int value) {
			ListNode node = new ListNode(value);
			node.next=null;
			if(list.head==null) {
				list.head=node;
			}else {
				ListNode h = list.head;
				while(h.next!=null) {
					h=h.next;
				}
				h.next=node;
			}
			return list;
		}
		
		public static void traverse(ListNode head) {
			ListNode j = head;
			while(j!=null) {
				System.out.println(j.val);
				j=j.next;
			}
		}
		
//		public static ListNode removeZeroSumSublists(ListNode head) {
//	        ListNode p=null,q=null,x=null;
//			p=head;
//			x=head;
//			int sum = 0,count=0;
//			while(p.next!=null) {
//				
//				sum = 0;
//				sum=sum+p.val;
//				q=p.next;
//				if(count<=1) {
//					count++;
//					p=p.next;
//				}else {
//					x=x.next;
//					p=p.next;
//				}
//				while(q!=null) {
//					sum=sum+q.val;
//					if(sum==0) {
//						if(count==1) {
//							x=q.next;
//							head=x;
//							count=0;
//						}else {
//							x.next=q.next;
//							count=1;
//						}
//						if(q.next==null) {
//							p.next=null;
//						}else {
//							p=q.next;	
//						}
//						
//						break;
//					}
//					q=q.next;
//				}
//				
//			}
//			
//			return head;
//	    }
		
		
		public static ListNode removeZeroSumSublists(ListNode head) {
	        ListNode dum = new ListNode(0);
	        ListNode curr = dum;
	        dum.next=head;
	        int checkSum=0;
	        HashMap<Integer, ListNode> currMap = new HashMap<>();
	        while(curr!=null) {
	        	checkSum=checkSum+curr.val;
	        	if(currMap.containsKey(checkSum)) {
	        		ListNode del = currMap.get(checkSum).next;
	        		int sum = checkSum;
	        		while(del!=curr) {
	        			sum=sum+del.val;
	        			currMap.remove(sum);
	        			del=del.next;
	        		}
	        		currMap.get(checkSum).next=curr.next;
	        	}else {
	        		currMap.put(checkSum, curr);
	        	}
	        	curr=curr.next;
	        }
			return dum.next;
	    }
}
