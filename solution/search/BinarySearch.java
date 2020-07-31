package solution.search;

public class BinarySearch<E extends Comparable<E>> implements presets.search.Search<E> {
	
	
	public int searchBinary(E[] a, E key, int left, int right) {
		
		if (right < left) {			
				return right + 1;
		}
		
		int mid = left + ((right - left) / 2);	
		
		if (key.compareTo(a[mid]) <= 0) {
			return searchBinary(a, key, left, mid - 1);
		}
		else {
			return searchBinary(a, key, mid + 1, right);
		}
		
	}
	
	@Override
	public int search(E[] a, E key, int left, int right) {
				
				if (key.compareTo(a[left]) < 0) {
					return left - 1;
				}
				else if (key.compareTo(a[right]) > 0) {
					return right + 1;
				}
				else {
					return searchBinary(a, key, left, right);
			}
	}
}
