package _03LinkedLists;

public class _01_DeleteNode {
	public static void main(String[] args) {
		Node n = Node.createLList(5, 10);
		System.out.println(n);
		deleteNode(n.next.next);
		System.out.println(n);

	}

	public static void deleteNode(Node node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
