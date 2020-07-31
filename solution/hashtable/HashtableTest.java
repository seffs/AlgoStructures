package solution.hashtable;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

import presets.dictionary.AbstractDictionary.DictionaryFullException;
import solution.hashtable.Hashtable;

class HashtableTest extends presets.dictionary.MapTest{

	@Override
	public <K extends Comparable<K>, V> Map<K, V> createMap() {
		Hashtable<K, V> hashtable = new Hashtable<K, V>(31);
		return hashtable;
	}
	
	@Test
	void testIntegers() {
		Map<Integer, Integer> map = createMap();
		map.put(0,120);
		map.put(1,240);
		map.put(2,360);
		map.put(3,480);
		map.put(4,600);
		map.put(5,720);
		map.put(6,840);
		map.put(7,960);
		
		Integer [] a = {120,240,360,480,600,720,840,960} ;
		for (int i = 0 ; i<a.length ; i++) {
			assertTrue(a[i].equals(map.get(i)));
		}
		
		Integer firstInteger = map.put(20,8000);
		assertTrue(firstInteger == null);           

		
		Integer secondInteger = map.put(7,9000);     
		assertTrue(secondInteger.equals(960));       

		assertThrows(UnsupportedOperationException.class, () -> map.remove(7));

	}
	
	@Test
	void testFloat() {
		Map<Integer, Float> map = createMap();
		map.put(0,1.55F);
		map.put(1,2.55F);
		map.put(2,3.55F);
		map.put(3,4.55F);
		map.put(4,5.55F);
		map.put(5,6.55F);
		map.put(6,7.55F);
		map.put(7,8.55F);
		Float [] b = {1.55F,2.55F,3.55F,4.55F,5.55F,6.55F,7.55F,8.55F} ;
		for (int i = 0 ; i<b.length ; i++) {
			assertTrue(b[i].equals(map.get(i)));
		}
		
		Float firstFloat = map.get(8); 
		assertTrue(firstFloat == null);
		
	}
	
	@Test
	void testDouble() {
		Map<Integer, Double> map = createMap();
		map.put(0,1.55);
		map.put(1,2.55);
		map.put(2,3.55);
		map.put(3,4.55);
		map.put(4,5.55);
		map.put(5,6.55);
		map.put(6,7.55);
		map.put(7,8.55);
		Double [] c = {1.55,2.55,3.55,4.55,5.55,6.55,7.55,8.55} ;
		for (int i = 0 ; i<c.length ; i++) {
			assertTrue(c[i].equals(map.get(i)));
		}
		
		Double firstDouble = map.get(8); 
		assertTrue(firstDouble == null);
	}
	
	@Test
	void testString() {
		Map<Integer, String> map = createMap();
		map.put(0, "Auto");
		map.put(1, "Ball");
		map.put(2, "Chips");
		map.put(3, "Drei");
		map.put(4, "Elefant");
		map.put(5, "Giraffe");
		map.put(6, "Hund");
		map.put(7, "Insel");
		
		String [] d = {"Auto","Ball","Chips","Drei","Elefant","Giraffe","Hund","Insel"} ;
		for (int i = 0 ; i<d.length ; i++) {
			assertTrue(d[i].equals(map.get(i)));
		}		
		assertThrows(UnsupportedOperationException.class, () -> map.remove(7));
		
		String firstString = map.get(8); 
		assertTrue(firstString == null);

	}
	
	@Test
	void fullCapacity() {
		Map<Integer, String> map = createMap();
		for (int i = 0 ; i<31 ; i++) {
			map.put(i," " + i*1);
		}
		assertThrows(DictionaryFullException.class, () -> map.put(31, "hola"));
	}

}
 