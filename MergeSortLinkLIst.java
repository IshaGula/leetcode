package leetcode;

public class MergeSortLinkLIst {

	ListNode head;
	 public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
		  }
	 
	public static void main(String[] args) {
		MergeSortLinkLIst list = new MergeSortLinkLIst();
		list = insert(list,1);
		list = insert(list,8);
		list = insert(list,5);
		list = insert(list,9);
		list = insert(list,6);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,7);
		list = insert(list,1);
		
		traverse(list.head);
		
		
		System.out.println("sorted");
		
		list.head=sortList(list.head);
		
		traverse(list.head);
	}
	
	public static MergeSortLinkLIst insert(MergeSortLinkLIst list,int value) {
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
	
public static ListNode sortList(ListNode head) {
	if(head==null || head.next==null) {
		return head;
	} 
	ListNode middle = getMiddle(head);
	ListNode middleNext = middle.next;
	middle.next=null;
	ListNode left=sortList(head);
	ListNode right=sortList(middleNext);
	ListNode sorted = sortedMerge(left, right);
	return sorted;
    }
private static ListNode sortedMerge(ListNode left, ListNode right) {
	ListNode result=null;
	if(left==null) {
		return right;
	}else if(right==null) {
		return left;
	}
	
	if(left.val<=right.val) {
		result=left;
		result.next=sortedMerge(left.next, right);
	}else {
		result=right;
		result.next=sortedMerge(left, right.next);
	}
	return result;
}
private static ListNode getMiddle(ListNode head) {
	ListNode a = head;
	ListNode b=head;
	while(b.next!=null && b.next.next!=null) {
		a=a.next;
		b=b.next.next;
	}
	
	return a;
	
}
}
