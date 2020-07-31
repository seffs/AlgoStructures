package solution.sorting;


public class ReverseArray<E extends Comparable<E>> implements presets.sorting.Reverse<E> {

	@Override
	public void reverse(E[] a, int from, int to) {
		int mid = (to - from - 1) / 2;
		E temp;
		for (int i = 0; i<=mid; i++) {
			temp = a[i+from];
			a[i+from] = a[to - i];
			a[to-i] = temp;
		}
	}

}
