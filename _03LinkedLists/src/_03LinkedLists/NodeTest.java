package _03LinkedLists;


import org.junit.Test;

public class NodeTest {

	@Test
	public void test() {
		System.out.println("--- test1 ---");
		System.out.println(Node.createLList(0, 10));
		
		System.out.println("--- test2 ---");
		System.out.println(Node.createLList(1, 10));
		
		System.out.println("--- test3 ---");
		System.out.println(Node.createLList(2, 1));
		
		System.out.println("--- test4 ---");
		System.out.println(Node.createLList(7, 10));
		
		System.out.println("--- test5 ---");
		System.out.println(Node.createLList(5, 3));
		
		System.out.println("--- Test Sorted LList 1 ---");
		System.out.println(Node.createSortedLList(5, 5));
		
		System.out.println("---  Test Sorted LList 2 ---");
		System.out.println(Node.createSortedLList(10, 3));
		
		System.out.println("---  Test Sorted LList 3 ---");
		System.out.println(Node.createSortedLList(0, 3));
		
		System.out.println("---  Test Sorted LList 4 ---");
		System.out.println(Node.createSortedLList(1, 9));
	}

}
