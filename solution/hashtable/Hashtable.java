package solution.hashtable;


public class Hashtable<K extends Comparable<K>, V> extends presets.dictionary.AbstractHashMap<K,V> {

	private int capacity;
	
	public Hashtable(int capacity) {
		super(capacity);
		this.capacity = capacity;
	}
	
	@Override
	public V get(Object o) {
		@SuppressWarnings("unchecked")
		K k = (K) o;
		if (searchElement(k) != null) {
			return searchElement(k).getValue();
		}
		return null;
	}
	
	@Override
	public V put(K key, V value) {
		Entry<K,V> actual = searchElement(key);
        if (actual == null) {
        		SimpleEntry<K, V> entry = new SimpleEntry<K, V>(key, value);
        		hashtable[hashFunction(key)] = entry;
                size++;
                return null;
            }
        else {
        		V old = get(key); 
        		actual.setValue(value);
        		return old;
            }
	}
	
	private int hashFunction(K key) {
		int i = hashCode(key), h = 1;
		while (hashtable[i] != null && i < capacity) {
			//quadratisches sondieren
			i = (i + h * h++) % capacity;
		}
		return i;
	}
	
	private int hashCode(K key) {
		return key.hashCode() % capacity;
	}
	
	private Entry<K, V> searchElement (K key) {
		int i = hashCode(key), h = 1;
		while (hashtable[i] != null && i < capacity) {
			if (hashtable[i].getKey().compareTo(key) == 0) {
				return hashtable[i];
			}
			if (size >= capacity) {
				throw new DictionaryFullException();
			}
			//quadratisches sondieren
			i = (i + h * h++) % capacity;
		}
		return null;
	}
}
