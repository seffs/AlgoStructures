package solution.list;

import presets.dictionary.AbstractDoubleLinkedList;

public class DoubleLinkedList<K extends Comparable<K>, V> extends AbstractDoubleLinkedList<K,V>  {
	
	
	@Override
	public V get(Object o) {
		@SuppressWarnings("unchecked")
		K k = (K) o;
		if (searchElement(k) != null) {
			return searchElement(k).entry.getValue();
		}
		return null;
	}
	
	@Override
	public V put(K key, V value) {
		ListElement actual = searchElement(key);
		if (actual == null) {
			SimpleEntry<K, V> entry = new SimpleEntry<K, V>(key, value);
			ListElement temp = new ListElement(entry, null, head);
			if (head != null) {
				head.previous = temp;
			}
			head = temp;
			size++;
			return null;
		}
		else {
			V old = get(key); 
			actual.entry.setValue(value);
			return old;
		}
	}
	
	private ListElement searchElement (K key) {
		ListElement current = head;
		while (current != null) {
			if (current.entry.getKey().compareTo(key) == 0) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
}
