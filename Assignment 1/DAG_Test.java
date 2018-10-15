import static org.junit.Assert.*;

import org.junit.Test;

public class DAG_Test {

	@Test
	public void testDAG()
	{
		DAG graph = new DAG(10);
		
		graph.addEdge(1, 2);
		graph.addEdge(2, 4);
		graph.addEdge(2, 5);
		graph.addEdge(4, 6);
		graph.addEdge(4, 7);
		
		assertEquals(1, graph.indegree(4));
		assertEquals(2, graph.outdegree(4));
		assertEquals(5, graph.E());
		assertEquals(10, graph.V());
		String adj = "[6, 7]";
		assertEquals(adj, graph.adj(4).toString());
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
	public void testOutdegree()
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
