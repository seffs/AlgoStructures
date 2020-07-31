package solution.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;

import org.junit.jupiter.api.Test;

public class MergesortTest {

	public <E extends Comparable<E>> Mergesort<E> createSort() {
		return new Mergesort<>();
	}
	
	@Test
	void test1() {
		Mergesort<Integer> sort = createSort();
		Integer [] IN = {2, 0, 4, 7, 9, 10, 11};
		Integer [] expected = {0, 2, 4, 7, 9, 10, 11};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
		
	}
	@Test
	void test2() {
		Mergesort<Integer> sort = createSort();
		Integer [] IN = {1, 2, 1, 1, 1, 1, 1};
		Integer [] expected = {1, 1, 1, 1, 1, 1, 2};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
		
	}
	@Test
	void test3() {
		Mergesort<Integer> sort = createSort();
		Integer [] IN = {7, 6, 5, 4, 3, 2, 1};
		Integer [] expected = {1, 2, 3, 4, 5, 6, 7};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test4() {
		Mergesort<Integer> sort = createSort();
		Integer [] IN = {20, 10, 12, 7, 9, 7, 11};
		Integer [] expected = {7, 7, 9, 10, 11, 12, 20};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test5() {
		Mergesort<String> sort = createSort();
		String [] IN = {"a", "c", "e", "g"};
		String [] expected = {"a", "c", "e", "g"};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test6() {
		Mergesort<String> sort = createSort();
		String [] IN = {"x", "z", "y", "x"};
		String [] expected = {"x", "x", "y", "z"};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test7() {
		Mergesort<String> sort = createSort();
		String [] IN = {"1", "5", "3", "1"};
		String [] expected = {"1", "1", "3", "5"};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test8() {
		Mergesort<String> sort = createSort();
		String [] IN = {"a", "B", "c", "D"};
		String [] expected = {"B", "D", "a", "c"};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test9() {
		Mergesort<String> sort = createSort();
		String [] IN = {"The", "less", "I", "know", "the2", "better", "the"};
		String [] expected = {"I", "The", "better", "know", "less", "the", "the2"};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test10() {
		Mergesort<ChronoLocalDate> sort = createSort();
		LocalDate date = LocalDate.of(1998, Month.FEBRUARY, 11);
		LocalDate [] IN = {date.plusMonths(2), date.plusDays(5), date, date.minusDays(5), date.minusMonths(2)};
		LocalDate [] expected = {date.minusMonths(2), date.minusDays(5), date, date.plusDays(5), date.plusMonths(2)};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test11() {
		Mergesort<String> sort = createSort();
		String [] IN = {};
		String [] expected = {};
		sort.sort(IN);

		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test12() {
		Mergesort<String> sort = createSort();
		String [] IN = {"hola"};
		String [] expected = {"hola"};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test13() {
		Mergesort<Integer> sort = createSort();
		Integer [] IN = new Integer[100000];
		Integer [] expected = new Integer[100000];
		for (int i = 0; i < IN.length; i++) {
	    	IN[i] = IN.length - 1 - i;
	    	expected[i] = i;
	    }
	    sort.sort(IN);
	    
	    assertArrayEquals(expected, IN);
	}
	
	@Test
	void test14() {
		Mergesort<String> sort = createSort();
		String [] IN = {"hola", "chau"};
		String [] expected = {"chau", "hola"};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test15() {
		Mergesort<String> sort = createSort();
		String _101 = new String("1");
		String _102 = new String("1");
		String [] IN = {_101, "3", "8", _102};
		String [] expected = {_102,  _101, IN[1], IN[2]};
		sort.sort(IN);
		
		assertArrayEquals(expected, IN);
	}
	
}