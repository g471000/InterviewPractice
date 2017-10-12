package _03LinkedLists;

import java.util.HashSet;

public class _05_LinkedListCycle {
	public static void main(String[] args) {
		System.out.println("--- test1 ---");
		System.out.println(isCycle(null));
		System.out.println(isCycleNoSpace(null));
		System.out.println();
		
		System.out.println("--- test2 ---");
		System.out.println(isCycle(new Node(-1)));
		System.out.println(isCycleNoSpace(new Node(-1)));
		System.out.println();
		
		System.out.println("--- test2 ---");
		Node n1 = Node.createLList(7, 4);
		System.out.println(n1 + ": " + isCycle(n1));

		Node n2 = Node.createLList(10, 4);
		Node curr = n2;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = n2.next.next.next;
		System.out.println("cycle1: " + isCycle(n2));
		System.out.println("cycle1: " + isCycleNoSpace(n2));

		Node n3 = Node.createLList(115, 5);
		curr = n3;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = n3.next.next.next;
		System.out.println("cycle2: " + isCycle(n3));
		System.out.println("cycle2: " + isCycleNoSpace(n3));		

	}

	public static boolean isCycleNoSpace(Node head) {
		if (head == null)
			return false;
		Node slow = head;
		Node fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}

	public static boolean isCycle(Node head) {
		HashSet<Node> set = new HashSet<>();
		while (head != null) {
			if (set.contains(head)) {
				return true;
			} else {
				set.add(head);
				head = head.next;
			}
		}
		return false;
	}
}
