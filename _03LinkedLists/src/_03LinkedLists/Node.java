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
	
	public static Node clone(Node node) {
		Node head = new Node(-1);
		Node curr = node;
		Node newcurr = head;
		while(curr != null) {
			newcurr.next = new Node(curr.val);
			newcurr = newcurr.next;
			curr = curr.next;
		}
		return head.next;
	}
	
	public static Node createSortedLList(int start, int size, int maxGap) {
		Node head = new Node(-1);
		Node curr = head;
		int val = start; 
		Random rand = new Random();
		while(size > 0) {
			curr.next = new Node(val);
			size--;
			curr = curr.next;
			val += rand.nextInt(maxGap);
		}
		return head.next;
	}
	
	// 0 1 3 4 4 5
	public static Node createSortedLList(int size, int maxGap) {
		Node head = new Node(-1);
		Node curr = head;
		int val = 0; 
		Random rand = new Random();
		while(size > 0) {
			val += rand.nextInt(maxGap);
			curr.next = new Node(val);
			size--;
			curr = curr.next;
		}
		return head.next;
	}
	
	// 8 9 0 2
	// -1 -> 8 -> 9 -> 0 -> 2
	public static Node createLList(int size, int max) {
		Node head = new Node(-1);
		Node curr = head;
		Random rand = new Random();
		if(max == 0) {
			max = 1;
		}
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