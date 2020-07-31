package solution.sorting;

import presets.sorting.*;

public class ReverseMergesort<E extends Comparable<E>> extends AbstractMergesort<E> {

	ReverseArray<E> reverse = new ReverseArray<E>();
	
	@Override
	protected void mergesort(E[] a, int left, int right) {
			if (left < right) {
				int m = (left + right) / 2;
				mergesort(a,left,m);
				mergesort(a,m + 1,right);
				merge(a,left,m,right);
			}
		}
	public void merge(E[] a, int left, int middle, int right) {
		reverse.reverse(a,middle+1,right);
		int l = left;
		int r = right;
		for (int i = left; i<=right; i++) {
			if ( r <= middle || (l <= middle && a[l].compareTo(a[r]) < 0)) {
				b[i] = a[l];
				l = l + 1;
			}
			else {
				b[i] = a[r];
				r = r - 1;
			}
		}
		for (int i = left; i<=right; i++) {
			a[i] = b[i];
		}	
	}	
}
