package cn.jjdcn.leecode.subject0002;

//      给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
//		如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
//		您可以假设除了数字 0之外，这两个数都不会以 0 开头。
//
//		示例：
//		  输入：(2->4->3)+(5->6->4)
//		  输出：7->0->8
//		  原因：342+465=807

public class AddTwoNumber {

	public static void main(String[] args) {
		ListNode ln;


		ListNode l1 = new ListNode(5);
		ListNode l2 = new ListNode(5);

		ListNode result = addTwoNumbers(l1, l2);

		while (result != null) {
			System.out.print(result.val);
			result = result.next;
		}
	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode p = l1, q = l2;
		int carry = 0;
		ListNode current = result;
		while (true) {
			int r = p.val + q.val + carry;
			carry = r / 10;
			current.val = r % 10;
			if (p.next == null && q.next == null && carry != 1) break;
			current.next = new ListNode(carry);
			current = current.next;
			if (p.next == null && q.next == null) break;
			if (p.next == null) {
				q = q.next;
				p.val = 0;
				continue;
			}
			if (q.next == null) {
				p = p.next;
				q.val = 0;
				continue;
			}
			p = p.next;
			q = q.next;
		}

		return result;
	}
}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}
