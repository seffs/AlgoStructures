package presets.sorting;

public interface Sort<E extends Comparable<E>> {

  /**
   * Sorts the elements of a into ascending order.
   * The algorithm is stable.
   */
  public void sort(E [] a);
}
