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
	
	//Put method, inserts value into tree
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
	
	public Node search(Node root, Key value1, Key value2)
	{
		if(root != null &&(get(value1)!=null &&get(value2)!=null))
		{
			
			if(root.key.compareTo(value1) == 0 || root.key.compareTo(value2) == 0)
			{
				return root;
			}

			Node leftBranch = search(root.left, value1,value2);
			Node rightBranch = search(root.right,value1,value2);
			//If they both have an answer this is the LCA 
			
			if(leftBranch != null && rightBranch != null)
			{
				return root;
			}
			//Find & return node with value or return null if doesn't exist
			if(leftBranch != null) 
			{
				return leftBranch;

			}
			else if(rightBranch != null)
			{
				return rightBranch;
			}
			else 
				return null;
		}
		return null;
	}
}
