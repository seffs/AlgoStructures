package solution.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;

import org.junit.jupiter.api.Test;

class ReverseMergesortTest {
	
	public <E extends Comparable<E>> ReverseMergesort<E> createReverseSort() {
		return new ReverseMergesort<>();
	}
	
	@Test
	void test1() {
		ReverseMergesort<Integer> reversemerge = createReverseSort();
		Integer [] IN = {5, 6, 3, 1, 7, 8, 4, 2};
		Integer [] expected = {1, 2, 3, 4, 5, 6, 7, 8};
		reversemerge.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test2() {
		ReverseMergesort<Integer> reversemerge = createReverseSort();
		Integer [] IN = {1, 2, 1, 1, 1, 1, 1};
		Integer [] expected = {1, 1, 1, 1, 1, 1, 2};
		reversemerge.sort(IN);
		
		assertArrayEquals(expected, IN);
		
	}
	
	@Test
	void test3() {
		ReverseMergesort<Integer> reversemerge = createReverseSort();
		Integer [] IN = {7, 6, 5, 4, 3, 2, 1};
		Integer [] expected = {1, 2, 3, 4, 5, 6, 7};
		reversemerge.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test4() {
		ReverseMergesort<Integer> reversemerge = createReverseSort();
		Integer [] IN = {20, 10, 12, 7, 9, 7, 11};
		Integer [] expected = {7, 7, 9, 10, 11, 12, 20};
		reversemerge.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test5() {
		ReverseMergesort<String> reversemerge = createReverseSort();
		String [] IN = {"a", "c", "e", "g"};
		String [] expected = {"a", "c", "e", "g"};
		reversemerge.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test6() {
		ReverseMergesort<String> reversemerge = createReverseSort();
		String [] IN = {"x", "z", "y", "x"};
		String [] expected = {"x", "x", "y", "z"};
		reversemerge.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test7() {
		ReverseMergesort<String> reversemerge = createReverseSort();
		String [] IN = {"1", "5", "3", "1"};
		String [] expected = {"1", "1", "3", "5"};
		reversemerge.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test8() {
		ReverseMergesort<String> reversemerge = createReverseSort();
		String [] IN = {"a", "B", "c", "D"};
		String [] expected = {"B", "D", "a", "c"};
		reversemerge.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test9() {
		ReverseMergesort<String> reversemerge = createReverseSort();
		String [] IN = {"The", "less", "I", "know", "ths", "the", "better"};
		String [] expected = {"I", "The", "better", "know", "less", "the", "ths"};
		reversemerge.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test10() {
		ReverseMergesort<ChronoLocalDate> reversemerge = createReverseSort();
		LocalDate date = LocalDate.of(1998, Month.FEBRUARY, 11);
		LocalDate [] IN = {date.plusMonths(2), date.plusDays(5), date, date.minusDays(5), date.minusMonths(2)};
		LocalDate [] expected = {date.minusMonths(2), date.minusDays(5), date, date.plusDays(5), date.plusMonths(2)};
		reversemerge.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test11() {
		ReverseMergesort<Integer> reversemerge = createReverseSort();
		Integer [] a = new Integer[100000];
	    for (int i = 0; i < a.length; i++) {
	    	a[i] = 0;
	    }
	    reversemerge.sort(a);
	}
	@Test
	void test12() {
		ReverseMergesort<Integer> reversemerge = createReverseSort();
		Integer [] a = new Integer[100000];
	    for (int i = a.length - 1; i >= 0; i--) {
	    	a[i] = i;
	    }
	    reversemerge.sort(a);
	}
	
	@Test
	void test15() {
		ReverseMergesort<String> reversemerge = createReverseSort();
		String _101 = new String("1");
		String _102 = new String("1");
		String [] IN = {_101, "3", "8", _102};
		String [] expected = {_102,  _101, IN[1], IN[2]};
		reversemerge.sort(IN);
		
		for (int i = 0;i<expected.length;i++) {
			assertTrue(IN[i] == expected[i]);	
		}
		
	}
}
