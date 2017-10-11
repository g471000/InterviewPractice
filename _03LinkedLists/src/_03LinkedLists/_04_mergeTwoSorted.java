package _03LinkedLists;

public class _04_mergeTwoSorted {
	public static void main(String[] args) {
		// null case check
		System.out.println("--- test 1: nullcheck ---");
		Node n1 = Node.createSortedLList(3, 5, 4);
		Node n2 = Node.createSortedLList(3, 5, 4);
		System.out.println("Node1: " + n1);
		System.out.println("Node2: " + n2);
		System.out.println("null type 1: " + mergeSortedRec(null, null));
		System.out.println("null type 2: " + mergeSortedRec(n1, null));
		System.out.println("null type 3: " + mergeSortedRec(null, n2));

		System.out.println("\n--- test 2 ---");
		Node n3 = Node.createSortedLList(2, 7, 4);
		Node n4 = Node.createSortedLList(0, 5, 7);
		System.out.println("Node3: " + n3);
		System.out.println("Node4: " + n4);
		System.out.println("test result: " + mergeSortedRec(n3, n4));
	}

	public static Node mergeSortedRec(Node n1, Node n2) {
		if (n1 == null)
			return n2;
		if (n2 == null)
			return n1;
		if (n1.val < n2.val) {
			n1.next = mergeSortedRec(n1.next, n2);
			return n1;
		} else {
			n2.next = mergeSortedRec(n1, n2.next);
			return n2;
		}
	}

	public static Node mergeSorted(Node n1, Node n2) {
		if (n1 == null)
			return n2;
		if (n2 == null)
			return n1;
		Node head = new Node(-1);
		Node curr = head;
		while (n1 != null && n2 != null) {
			if (n1.val < n2.val) {
				curr.next = n1;
				n1 = n1.next;
			} else {
				curr.next = n2;
				n2 = n2.next;
			}
			curr = curr.next;
		}
		if (n1 != null) {
			curr.next = n1;
		} else {
			curr.next = n2;
		}
		return head.next;
	}
}
