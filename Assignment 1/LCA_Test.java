import org.Junit.test;

public class LCA_Test 
{
 	@Test
	public void testIsEmpty() 
 	{
		LCA test = new LCA();
		boolean isEmpty = test.isEmpty();
		assertEquals(isEmpty, true);
		test.put(1, 2);
		test.put(2, 4);
		test.put(3, 6);
		test.put(4, 8);
		isEmpty = test.isEmpty();
		assertEquals(isEmpty, false);
	}
 }