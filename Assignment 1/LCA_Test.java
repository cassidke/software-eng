import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LCA_Test 
{
 	@Test
	public void testIsEmpty() 
 	{
 		LCA<Integer, Integer> test = new LCA<Integer, Integer>();
		boolean isEmpty = test.isEmpty();
		assertEquals(isEmpty, true);
		test.put(1, 2);
		test.put(2, 4);
		test.put(3, 6);
		test.put(4, 8);
		isEmpty = test.isEmpty();
		assertEquals(isEmpty, false);
	}
 	
 	@Test
	public void testSize(){
		LCA<Integer, Integer> test = new LCA<Integer, Integer>();
		assertEquals(test.size(), 0);
		test.put(4, 1);
		assertEquals(test.size(), 1);
		test.put(2, 4);
		test.put(3, 6);
		test.put(4, 8);
		assertEquals(test.size(), 3);
	}
 	
 	@Test
	public void testOneNode()
	{
		LCA<Integer, Integer> test = new LCA<Integer, Integer>();
		test.put(7, 1);
		assertNull(test.search(test.root, 1, 5));
	}
	
	@Test
	public void testFullTree()
	{
		LCA<Integer, Integer> test = new LCA<Integer, Integer>();
		test.put(8, 2);
		test.put(2, 1);
		test.put(5, 3);
		test.put(18, 4);
		test.put(7, 6);
		test.put(14, 5);
		test.put(3, 7);
		test.put(1, 8);
		test.put(15, 11);
		test.put(12, 10);
		test.put(16, 9);
		
		assertSame(test.search(test.root,18,1).key,8);
		assertSame(test.search(test.root,18,7).key,8);
		assertSame(test.search(test.root,12,16).key,14);
		
	}
 }