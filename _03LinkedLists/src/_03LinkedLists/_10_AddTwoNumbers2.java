package _03LinkedLists;

import java.util.Stack;

/**
 * (9 -> 2 -> 4 -> 3) + (5 -> 6 -> 4) 9 -> 8 -> 0 -> 7
 * 
 * @author Jieun Chon
 * @date Oct 16, 2017
 * @time 11:00:32 PM
 *
 */
public class _10_AddTwoNumbers2 {
	public static void main(String[] args) {
		Node n1 = Node.createLList(new int[] { 9, 2, 4, 3 });
		Node n2 = Node.createLList(new int[] { 5, 6, 4 });
		System.out.println(n1 + ", " + n2 + ": " + addRev(n1, n2));

		n1 = Node.createLList(new int[] { 9, 2, 4, 3 });
		n2 = Node.createLList(new int[] { 5, 6, 4 });
		System.out.println(n1 + ", " + n2 + ": " + addRev2(n1, n2));

		n1 = Node.createLList(new int[] { 9, 2, 4, 3 });
		n2 = Node.createLList(new int[] { 5, 6, 4 });
		System.out.println(n1 + ", " + n2 + ": " + addRevStack(n1, n2));

	}

	public static Node addRevStack(Node n1, Node n2) {
		if (n1 == null || n2 == null) {
			return n1 == null ? n2 : n1;
		}

		Stack<Integer> s1 = new Stack<>();
		Stack<Integer> s2 = new Stack<>();

		Node head = null;

		while (n1 != null) {
			s1.push(n1.val);
			n1 = n1.next;
		}

		while (n2 != null) {
			s2.push(n2.val);
			n2 = n2.next;
		}

		int val1 = 0, val2 = 0;
		int sum = 0, carry = 0;
		Node curr;
		while (!s1.isEmpty() || !s2.isEmpty()) {
			val1 = s1.isEmpty() ? 0 : s1.pop();
			val2 = s2.isEmpty() ? 0 : s2.pop();
			sum = carry + val1 + val2;
			carry = sum / 10;
			curr = new Node(sum % 10);
			curr.next = head;
			head = curr;
		}
		if (carry != 0) {
			curr = new Node(carry);
			curr.next = head;
			head = curr;
		}
		return head;
	}

	public static Node addRev2(Node n1, Node n2) {
		int val1 = 0;
		int val2 = 0;

		while (n1 != null) {
			val1 *= 10;
			val1 += n1.val;
			n1 = n1.next;
		}

		while (n2 != null) {
			val2 *= 10;
			val2 += n2.val;
			n2 = n2.next;
		}

		int sum = val1 + val2;
		Node head = null;

		while (sum != 0) {
			Node newNode = new Node(sum % 10);
			newNode.next = head;
			head = newNode;
			sum /= 10;
		}
		return head;
	}

	public static Node addRev(Node n1, Node n2) {
		if (n1 == null || n2 == null) {
			return n1 == null ? n2 : n1;
		}
		Node rn1 = reverse(n1);
		Node rn2 = reverse(n2);

		return add(rn1, rn2);
	}

	public static Node add(Node n1, Node n2) {
		Node head = null;
		if (n1 == null || n2 == null) {
			return n1 == null ? n2 : n1;
		}
		int val1, val2, carry = 0, sum = 0;
		while (n1 != null || n2 != null) {
			val1 = n1 == null ? 0 : n1.val;
			val2 = n2 == null ? 0 : n2.val;

			sum = val1 + val2 + carry;
			carry = sum / 10;
			Node newNode = new Node(sum % 10);
			newNode.next = head;
			head = newNode;

			n1 = n1 == null ? null : n1.next;
			n2 = n2 == null ? null : n2.next;
		}
		return head;
	}

	public static Node reverse(Node n) {
		Node curr = n;
		Node prev = null;
		Node temp = null;
		while (curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}

}
