import java.util.ArrayList;

public class DAG
{
	private int V;						//no. vertices
	private int E;						//no. edges
	private ArrayList<Integer>[] adj;   //adj[V] = adjacency list for vertex V
	private int [] indegree;			//indegree[V] = indegree of vertex V
	private boolean [] marked;			//list of visited vertices
	
	
	public DAG(int V)
	{
		if(V < 0)
		{
			throw new IllegalArgumentException("Number of vertices must be greater than 0");
		}
		
		this.V = V;
		this.E = 0;
		indegree = new int[V];
		marked = new boolean[V];
		adj = (ArrayList<Integer>[]) new ArrayList[V];
		
		for(int v = 0; v < V; v++)
		{
			adj[v] = new ArrayList<Integer>();
		}
	}
	
	//Returns current vertex
	public int V()
	{
		return V;
	}
	
	public int E()
	{
		return E;
	}
	
	//Adds directed edge from v to w
	public void addEdge(int v, int w)
	{
		if((validateVertex(v) > 0) && (validateVertex(w) > 0))
		{
			adj[v].add(w);
			indegree[w]++;
			E++;
		}
		else
		{
			System.out.println("Please enter numbers between 0 and " + (V-1));
		}		
	}
	
	private int validateVertex(int v)
	{
		if(v < 0 || v >= V)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
	//Returns number of directed edges from current vertex
	public int indegree(int v)
	{
		validateVertex(v);
		return indegree[v];
	}
	
	//Returns the adjacent vertices to v
	public Iterable<Integer> adj(int v)
	{
		return adj[v];
	}
	
}











 	

