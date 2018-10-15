import static org.junit.Assert.*;

import org.junit.Test;

public class DAGTest {

	@Test
	public void testDAG()
	{
		fail("Not yet implemented");
	}
	
	@Test
	public void addEdge()
	{
		DAG graph = new DAG(5);
		
		graph.addEdge(1,2);

		//As negative, will print a system error and not addEdge
		graph.addEdge(-1, -6);
		
		//This will not addEdge as 12 > 5
		graph.addEdge(3, 12);
		
		assertEquals(1, graph.E());
	}
	
	@Test
	public void testIndegree()
	{
		
	}
	
	@Test 
	public void testV()
	{
		
	}
	
	@Test
	public void testAdj()
	{
		
	}

}
