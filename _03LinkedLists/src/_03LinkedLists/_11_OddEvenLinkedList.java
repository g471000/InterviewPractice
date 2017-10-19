package _03LinkedLists;

public class _11_OddEvenLinkedList {
	public static void main(String[] args) {
		System.out.println(oddeven(null));
		System.out.println(oddeven(new Node(1)));
		Node node1 = Node.createLList(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		System.out.println(node1 + ", " + oddeven(node1));
		Node node2 = Node.createLList(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 });
		System.out.println(node2 + ", " + oddeven(node2));
		
		System.out.println(oddeven2(null));
		System.out.println(oddeven2(new Node(1)));
		node1 = Node.createLList(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		System.out.println(node1 + ", " + oddeven2(node1));
		node2 = Node.createLList(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 });
		System.out.println(node2 + ", " + oddeven2(node2));
	}
	
	public static Node oddeven2(Node node){
		if(node == null) return null;
		Node odd = node;
		Node even = node.next;
		Node evenhead = new Node(-1);
		evenhead.next = even;
 
		while(even != null && even.next != null){
			odd.next = odd.next.next;
			even.next = even.next.next;
			odd = odd.next;
			even = even.next;
}
		odd.next = evenhead.next;
		return node;
}


	public static Node oddeven(Node node) {
		if (node == null)
			return null;
		Node oddh = new Node(-1);
		Node evenh = new Node(-1);

		Node oddhcurr = oddh;
		Node evenhcurr = evenh;

		Node odd = node;
		Node even = node.next;

		while (even != null && even.next != null) {
			oddhcurr.next = odd;
			evenhcurr.next = even;

			oddhcurr = oddhcurr.next;
			evenhcurr = evenhcurr.next;

			odd = odd.next.next;
			even = even.next.next;
		}
		oddhcurr.next = odd;
		evenhcurr.next = even;

		oddhcurr = oddhcurr.next;
		evenhcurr = evenhcurr.next;

		oddhcurr.next = evenh.next;
		return oddh.next;
	}
}
