package _03LinkedLists;

public class _12_SwapNodesParis {
	public static void main(String[] args) {
		System.out.println(swapNodes(null));
		System.out.println(swapNodes(new Node(9)));
		Node node = Node.createLList(new int[] {1, 2, 3, 4, 5, 6});
		Node node2 = Node.createLList(new int[] {1, 2, 3, 4, 5});
		System.out.println(node + " " + swapNodes(node));
		System.out.println(node2 + " " + swapNodes(node2));
		
	}
	
	public static Node swapNodes(Node node) {
		if (node == null || node.next == null)
			return node;
		Node temp = swapNodes(node.next.next);
		Node newHead = node.next;
		node.next = temp;
		newHead.next = node;
		return newHead;
	}
}
