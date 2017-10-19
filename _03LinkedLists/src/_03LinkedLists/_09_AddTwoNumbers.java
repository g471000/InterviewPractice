package _03LinkedLists;

public class _09_AddTwoNumbers {
	/**
	 * null, null -> null
	 * 
	 * null, (5 -> 6 -> 4) -> (5 -> 6 -> 4)
	 * 
	 * (2 -> 4 -> 3) + (5 -> 6 -> 4) -> (7 -> 0 -> 8)
	 * 
	 * (5 -> 6 -> 9 -> null), (5 -> 6 -> 4 -> 8 -> 7 -> 6 -> null) -> 0, 3, 4, 9, 7, 6
	 * 
	 * (5 -> 6 -> 9 -> null) (5 -> 6 -> 9 -> 9 -> null) -> 0, 3, 9, 0, 1
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("--- test1: null ---");
		Node n1 = null;
		Node n2 = null;
		System.out.println(n1 + ", " + n2 + ": " + addTwoNumbers(n1, n2));
		n2 = Node.createLList(new int[] {5, 6, 4});
		System.out.println(n1 + ", " + n2 + ": " + addTwoNumbers(n1, n2));
		
		System.out.println("\n--- test2 ---");
		n1 = Node.createLList(new int[] {2, 4, 3});
		n2 = Node.createLList(new int[] {5, 6, 4});
		System.out.println(n1 + ", " + n2 + ": " + addTwoNumbers(n1, n2));
		
		System.out.println("\n--- test3 ---");
		n1 = Node.createLList(new int[] {5, 6, 9});
		n2 = Node.createLList(new int[] {5, 6, 4, 8, 7, 6});
		System.out.println(n1 + ", " + n2 + ": " + addTwoNumbers(n1, n2));
		
		System.out.println("\n--- test4 ---");
		n1 = Node.createLList(new int[] {5, 6, 9});
		n2 = Node.createLList(new int[] {5, 6, 9, 9});
		System.out.println(n1 + ", " + n2 + ": " + addTwoNumbers(n1, n2));
	}

	public static Node addTwoNumbers(Node n1, Node n2) {
		Node head = new Node(-1);
		Node curr = head;
		int val1, val2, carry = 0;
		while (n1 != null || n2 != null) {
			val1 = n1 == null ? 0 : n1.val;
			val2 = n2 == null ? 0 : n2.val;

			int sum = carry + val1 + val2;
			carry = sum / 10;
			curr.next = new Node(sum % 10);
			curr = curr.next;

			n1 = n1 == null ? null : n1.next;
			n2 = n2 == null ? null : n2.next;
		}
		if (carry != 0) {
			curr.next = new Node(carry);
		}

		return head.next;
	}
}
