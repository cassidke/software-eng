public class LCA <Key extends Comparable<Key>, Value>{
	private Node root;
	
	private class Node{
		private Key key;
		private Value val;
		private Node left, right;
		private int N;
		
		public Node(Key key, Value val){
			this.val = val;
			this.key = key;
		}
	}
	
	//Is empty implementation
	public boolean isEmpty(){
		return size() == 0;
	}
	
	public int size()
	{
		return size(root);
	}
	
	public int size(Node x)
	{
		if(x == null)
		{
			return 0;
		}
		else{
			return x.N;
		}
	}
	
	//
	public void put(Key key, Value val){
		root = put(root, key, val);
	}
	
	public Node put(Node x, Key key, Value val){
		if(x == null)
		{
			return new Node(key, val);
		}
		int comp = key.compareTo(x.key);
		if(comp < 0)
		{
			x.left = put(x.left, key, val);
		}
		else if(comp > 0)
		{
			x.right = put(x.right, key, val);
		}else
		{
			x.val = val;
		}
		x.N = 1 + size(x.left) + size(x.right);
		return x;
 	}
	
	//Get method, search by key order
	public Value get(Key key){
		Node x = root;
		
		while(x != null){
			
			int comp = key.compareTo(x.key);
			if(comp < 0)
			{
				x = x.left;
			}
			else if(comp > 0)
			{
				x = x.right;
			}
			else{
				return x.val;
			}
		}
		return null;
	}
}
