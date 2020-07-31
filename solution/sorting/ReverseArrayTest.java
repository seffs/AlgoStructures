package solution.sorting;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.ChronoLocalDate;

import org.junit.jupiter.api.Test;

class ReverseArrayTest {

	public <E extends Comparable<E>> ReverseArray<E> reverseArray() {
		return new ReverseArray<>();
	}
	
	@Test
	void test1() {
		ReverseArray<Integer> reverse = reverseArray();
		Integer [] IN = {2, 0, 4, 7, 9, 10, 11};
		Integer [] expected = {2, 0, 11, 10, 9, 7, 4};
		reverse.reverse(IN,2,6);
		
		assertArrayEquals(expected, IN);
		
	}
	@Test
	void test2() {
		ReverseArray<Integer> reverse = reverseArray();
		Integer [] IN = {1, 2, 1, 1, 1, 1, 1};
		Integer [] expected = {1, 1, 1, 1, 1, 2, 1};
		reverse.reverse(IN,1,5);
		
		assertArrayEquals(expected, IN);
		
	}
	
	@Test
	void test3() {
		ReverseArray<Integer> reverse = reverseArray();
		Integer [] IN = {1, 2, 3, 4, 5, 6, 7};
		Integer [] expected = {7, 6, 5, 4, 3, 2, 1};
		reverse.reverse(IN,0,6);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test4() {
		ReverseArray<Integer> reverse = reverseArray();
		Integer [] IN = {1, 2, 3, 4, 5, 6, 7};
		Integer [] expected = {7, 6, 5, 4, 3, 2, 1};
		reverse.reverse(IN,0,6);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test5() {
		ReverseArray<String> reverse = reverseArray();
		String [] IN = {"a", "c", "e", "g"};
		String [] expected = {"g", "e", "c", "a"};
		reverse.reverse(IN,0,3);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test6() {
		ReverseArray<String> reverse = reverseArray();
		String [] IN = {"a", "c", "e", "g"};
		String [] expected = {"a", "e", "c", "g"};
		reverse.reverse(IN,1,2);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test7() {
		ReverseArray<String> reverse = reverseArray();
		String [] IN = {"a", "c", "e", "g"};
		String [] expected = {"a", "e", "c", "g"};
		reverse.reverse(IN,1,2);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test8() {
		ReverseArray<String> reverse = reverseArray();
		String [] IN = {"a", "c", "e", "g"};
		String [] expected = {"a", "e", "c", "g"};
		reverse.reverse(IN,1,2);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test9() {
		ReverseArray<String> reverse = reverseArray();
		String [] IN = {"The", "less", "I", "know", "the", "better"};
		String [] expected = {"The", "less", "better", "the", "know", "I"};
		reverse.reverse(IN,2,5);
		
		assertArrayEquals(expected, IN);
	}
	
	@Test
	void test10() {
		ReverseArray<ChronoLocalDate> reverse = reverseArray();
		LocalDate date = LocalDate.of(1998, Month.FEBRUARY, 11);
		LocalDate [] IN = {date.minusMonths(2), date.minusDays(5), date, date.plusDays(5), date.plusMonths(2)};
		LocalDate [] expected = {date.plusMonths(2), date.plusDays(5), date, date.minusDays(5), date.minusMonths(2)};
		reverse.reverse(IN,0,4);
		
		assertArrayEquals(expected, IN);
	}
}

