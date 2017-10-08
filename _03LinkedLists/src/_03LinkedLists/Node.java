package _03LinkedLists;

import java.util.Random;
public class Node{
	public int val;
	public Node next;
	public Node() {
		this(10, null);
	}
	
	public Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}
	
	public Node(int val) {
		this(val, null);
	}
	
	// 8 9 0 2
	// -1 -> 8 -> 9 -> 0 -> 2
	public static Node createLList(int size, int max) {
		Node head = new Node(-1);
		Node curr = head;
		Random rand = new Random();
		while(size > 0) {
			curr.next = new Node(rand.nextInt(max));
			size--;
			curr = curr.next;
		}
		return head.next;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node curr = this;
		while(curr != null) {
			sb.append(curr.val);
			if(curr.next != null) {
				sb.append(" -> ");
			}
			curr = curr.next;
		}
		
		sb.append("]");
		return sb.toString();
	}
}