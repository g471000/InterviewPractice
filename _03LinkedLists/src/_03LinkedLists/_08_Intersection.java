package _03LinkedLists;

public class _08_Intersection {
	public static void main(String[] args) {
		Node n1 = null;
		Node n2 = null;
		System.out.println("--- test 1: null ---");
		System.out.println(n1 + ", " + n2 + " -> " + findIntersection(n1, n2));
		n1 = Node.createLList(4, 7);
		System.out.println(n1 + ", " + n2 + " -> " + findIntersection(n1, n2));
		
		System.out.println("\n--- test 2: same length, no intersection ---");
		n2 = Node.createLList(4, 7);
		System.out.println(n1 + ", " + n2 + " -> " + findIntersection(n1, n2));
		
		System.out.println("\n--- test 3: same length, no intersection ---");
		n2 = Node.createLList(2, 7);
		n2.next.next = n1;
		System.out.println(n1 + ", " + n2 + " -> " + findIntersection(n1, n2));
		
		System.out.println("\n--- test 4: same length, no intersection ---");
		n1 = Node.createLList(8, 4);
		n2 = Node.createLList(4, 4);
		System.out.println(n1 + ", " + n2 + " -> " + findIntersection(n1, n2));
		
		System.out.println("\n--- test 4: same length, no intersection ---");
		n1 = Node.createLList(4, 4);
		n2 = n1;
		System.out.println(n1 + ", " + n2 + " -> " + findIntersection(n1, n2));
		
			
	}
	
	public static Node findIntersection(Node n1, Node n2) {
		if (n1 == null || n2 == null) {
			return null;
		}
		Node p1 = n1;
		Node p2 = n2;
		while (p1 != null || p2 != null) {
			if (p1 == p2) {
				return p1;
			}
			p1 = p1 == null ? n2 : p1.next;
			p2 = p2 == null ? n1 : p2.next;
		}
		return null;
	}
}
