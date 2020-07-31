package solution.search;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import presets.search.Search;

class BinarySearchTest extends presets.search.SearchTest {
	
	@Override
	public <E extends Comparable<E>> Search<E> createSearch() {
		return new BinarySearch<>();
	}
	
	@Test
	  void newTest1() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {1, 1, 1, 1, 1, 1, 1};
	    
	    assertEquals(0, search.search(a, 1));
	  }

	  @Test
	  void newTest2() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {0, 2, 4, 7, 9, 10, 11};
	    
	    assertThrows(ArrayIndexOutOfBoundsException.class , () -> search.search(a, 6,-1,-1));
	    
	  }
	  @Test
	  void newTest3() {
	    Search<Integer> search = createSearch();
	    Integer [] a = {-1, 1, -1, 1, -1, 1, -1}; 
	    
	    assertEquals(7, search.search(a, 1)); // if (key.compareTo(a[right]) > 0) --> right + 1
	  }
	  
	  @Test
	  void newTest4() {
		Search<Integer> search = createSearch();
		Integer [] a = new Integer[99483647];
		    for (int i = 0; i < a.length; i++) {
		    	a[i] = i + 1;
		    }
		assertEquals(2, search.search(a, 3));
	  }
	  @Test
	  void newTest5() {
		Search<Integer> search = createSearch();
		Integer [] a = new Integer[1];
		    for (int i = 0; i < a.length; i++) {
		    	a[i] = i + 1;
		    }
		assertEquals(0, search.search(a, 1));
	  }
	  @Test
	  void newTest6() {
		Search<Integer> search = createSearch();
		Integer [] a = {-4,-3,-1,0};
		assertEquals(2, search.search(a, -2));
	  }
	  @Test
	  void newTest7() {
		Search<Integer> search = createSearch();
		Integer [] a = {-4,-3,-1,0};
		assertEquals(2, search.search(a, -2));
	  } 
	  @Test
	  void newTest8() {
		Search<Integer> search = createSearch();
		Integer [] a = {0,0,1,2,2};
		assertEquals(2, search.search(a, 1));
	  }
	  
	  
}
