package solution.tree;

public class BinarySearchTree<K extends Comparable<K>, V> extends presets.dictionary.AbstractBinaryTree<K, V> {
	
	@Override
	public V get(Object o) {
		@SuppressWarnings("unchecked")
		K k = (K) o;
		if (searchElement(root,k) != null) {
			return searchElement(root,k).entry.getValue();
		}
		return null;
	}
	
	@Override
	public V put(K key, V value) {
		Node y = null;
		Node x = root;
		Node newNode = new Node(key,value);
		while (x != null) {
			if (newNode.entry.getKey().compareTo(x.entry.getKey()) == 0) {
				V old = x.entry.getValue();
				x.entry.setValue(value);
				return old;
			}
			y = x;
			if (newNode.entry.getKey().compareTo(x.entry.getKey()) <= 0) {
				x = x.left;				
			}
			else {
				x = x.right;	
			}
		}
		if (y == null) {
			root = newNode;
		}
		else if (newNode.entry.getKey().compareTo(y.entry.getKey()) <= 0) {
			y.left = newNode;
		}
		else {
			y.right = newNode;
		}
		size++;
		return null;
	}
	
	private Node searchElement (Node node, K key) {
		Node current = node;
		if (current == null || current.entry.getKey() == key) {
			return current;
		}
		else if (key.compareTo(current.entry.getKey()) <= 0 ) {
			return searchElement(current.left,key);
		}
		else {
			return searchElement(current.right,key);
		}
	}

}
