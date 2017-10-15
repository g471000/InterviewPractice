package _03LinkedLists;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeCloneTestTest {

	@Test
	public void test() {
		Node n1 = Node.createLList(7, 9);
		System.out.println(n1);
		Node n2 = Node.clone(n1);
		System.out.println(n2);
	}

}
