package _03LinkedLists;

import java.util.Random;

/**
 * 
 * @author Jieun Chon
 * @date Oct 12, 2017
 * @time 8:53:28 AM
 *
 */
public class _07_RemoveElement {
	public static void main(String[] args) {
		System.out.println("-- test 1 --");
		Node n = null;
		Node n2 = n;
		System.out.println(n + ": " + remove(n, 5));
		System.out.println(n2 + ": " + remove(n2, 5));
		
		System.out.println();
		
		System.out.println("-- test 2 --");
		n = new Node(2);
		n2 = n;
		System.out.println(n + ": " + remove(n, 5));
		System.out.println(n2 + ": " + removeRec(n2, 5));
		System.out.println();
		
		System.out.println("-- test 3 --");
		System.out.println(n + ": " + remove(n, 2));
		System.out.println(n2 + ": " + removeRec(n2, 2));
		System.out.println();
		
		Random rand = new Random();
		int size, max, val;
		for(int i = 0; i < 10; i++) {
			size = rand.nextInt(10) + 5;
			max = rand.nextInt(8);
			val = rand.nextInt(max + 1);
			System.out.println("-- test " + (4 + i) + "--");
			System.out.println("size: " + size +",max: " + max + ",val: " + val);
			n = Node.createLList(size, max);
			n2 = n;
			System.out.println(n + "\n" + remove(n, val) + " (val: " + val + ")");
			System.out.println(n2 + "\n" + removeRec(n2, val) + " (val: " + val + ")");
			System.out.println();
		}
	}
	
	public static Node removeRec(Node head, int val){
		if(head == null) return null;
		head.next = removeRec(head.next, val);
		return head.val == val ? head.next : head;
}

	
	public static Node remove(Node head, int val) {
		Node dumNode = new Node(-1);
		dumNode.next = head;
		Node prev = dumNode;
		Node curr = head;
		while (curr != null) {
			if (curr.val == val) {
				prev.next = curr.next;
			} else {
				prev = prev.next;
			}
			curr = curr.next;
		}
		return dumNode.next;
	}
}
