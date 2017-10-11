package _03LinkedLists;

public class _02_ReverseList {
	public static void main(String[] args) {
		System.out.println("--- test1 ---");
		Node node1 = Node.createLList(0, 10);
		System.out.println(node1);
		System.out.println(reverse(node1));

		System.out.println("\n--- test2 ---");
		Node node2 = Node.createLList(1, 10);
		System.out.println(node2);
		System.out.println(reverse(node2));

		System.out.println("\n--- test3 ---");
		Node node3 = Node.createLList(5, 10);
		System.out.println(node3);
		System.out.println(reverse(node3));

		System.out.println("\n--- test4 ---");
		Node node4 = Node.createLList(10, 10);
		System.out.println(node4);
		System.out.println(reverse(node4));

	}

	public static Node reverse(Node head) {
		Node curr = head;
		Node prev = null;
		Node tmp;
		while (curr != null) {
			tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
		}
		return prev;
	}
}
