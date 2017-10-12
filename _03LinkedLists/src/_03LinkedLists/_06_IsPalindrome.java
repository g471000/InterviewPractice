package _03LinkedLists;

import java.util.Stack;
public class _06_IsPalindrome {
	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		n1.next.next.next = new Node(4);
		n1.next.next.next.next = new Node(3);
		n1.next.next.next.next.next = new Node(2);
		n1.next.next.next.next.next.next = new Node(1);
		System.out.println(n1);
		System.out.println(isPalindrome(n1));
		System.out.println(isPalindromNoSpace(n1));
		
		n1 = new Node(1);
		n1.next = new Node(2);
		n1.next.next = new Node(3);
		n1.next.next.next = new Node(4);
		n1.next.next.next.next = new Node(3);
		n1.next.next.next.next.next = new Node(0);
		n1.next.next.next.next.next.next = new Node(1);
		System.out.println(n1);
		System.out.println(reverse(n1));
		System.out.println(isPalindrome(n1));
		System.out.println(isPalindromNoSpace(n1));
	}
	
	public static boolean isPalindromNoSpace(Node head) {
		Node curr = head;
		Node rev = reverse(curr);
		while(rev != null && curr != null) {
			if(rev.val != curr.val) {
				return false;
			}
			rev = rev.next;
			curr = curr.next;
		}
		return true;
	}
	
    public static boolean isPalindrome(Node head) {
        Stack<Node> stack = new Stack<>();
        Node curr = head;
        while(curr != null){
            stack.push(curr);
            curr = curr.next;
        }
        
        curr = head;
        while(curr != null){
            if(stack.pop().val != curr.val){
                return false;
            }
            curr = curr.next;
        }
        return true;
    }
  
    public static Node reverse(Node head) {
    	Node curr = head;
    	Node prev = null;
    	Node temp;
    	while(curr != null) {
    		temp = curr.next;
    		curr.next = prev;
    		prev = curr;
    		curr = temp;
    	}
    	return prev;
    }
}
