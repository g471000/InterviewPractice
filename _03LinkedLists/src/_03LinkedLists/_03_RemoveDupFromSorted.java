package _03LinkedLists;

public class _03_RemoveDupFromSorted {
	public static void main(String[] args) {
		System.out.println(" --- test 1 --- ");
		Node n1 = Node.createSortedLList(0, 3);
		System.out.println(n1);
		System.out.println(remDupFromSorted(n1));
		
		System.out.println("\n --- test 2 --- ");
		Node n2 = Node.createSortedLList(1, 3);
		System.out.println(n2);
		System.out.println(remDupFromSorted(n2));
		
		System.out.println("\n --- test 3 --- ");
		Node n3 = Node.createSortedLList(7, 1);
		System.out.println(n3);
		System.out.println(remDupFromSorted(n3));

		System.out.println("\n --- test 4 --- ");
		Node n4 = Node.createSortedLList(7, 4);
		System.out.println(n4);
		System.out.println(remDupFromSorted(n4));
		
		System.out.println("\n --- test 5 --- ");
		Node n5 = Node.createSortedLList(5, 10, 4);
		System.out.println(n5);
		System.out.println(remDupFromSorted(n5));
		
		
	}

	public static Node remDupFromSorted(Node head) {
		Node curr = head;
		Node runner = curr;
		while (runner != null) {
			while (runner != null && curr.val == runner.val) {
				runner = runner.next;
			}
			curr.next = runner;
			curr = runner;
		}
		return head;
	}

}
