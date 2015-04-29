package adaptive;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TechScreenTest {

	@Test
	public void testCloseTo1000() {
		// test normal case
		int result = TechScreen.findIntCloseTo1000(1003, 94);
		assertEquals("testCloseTo1000 normal case", 1003, result);
		
		//test both integers are the same
		result = TechScreen.findIntCloseTo1000(544, 1456);
		assertEquals("testCloseTo1000 equal case", 544, result);
	
		
	}

	@Test
	public void testDoubleString(){
		String str = "asdf";
		String result = TechScreen.doubleString(str);
		assertEquals("testDoubleString", "aassddff", result);
		
		// test empty string
		result = TechScreen.doubleString("");
		assertEquals("testDoubleString with empty string", "", result);
		
		// test null string
		result = TechScreen.doubleString(null);
		assertEquals("testDoubleString with empty string", null, result);
	}
	
	@Test
	public void testSplitIntArray(){
		int [] intArray = new int[10];
		intArray[0] = 1;
		intArray[2] = 2;
		intArray[3] = 3;
		intArray[4] = 4;
		intArray[5] = 5;
		intArray[6] = 6;
		intArray[7] = 7;
		intArray[8] = 8;
		intArray[9] = 9;
		
		//  array with odd sum can't be split
		boolean result = TechScreen.splitIntArray(intArray);
		assertEquals("testSplitIntArray odd sum", false, result);
		
		// array with even sum, but can't be split to 2 arrays with the same sum
		intArray[0] = 2;
		result = TechScreen.splitIntArray(intArray);
		assertEquals("testSplitIntArray even sum but can't split", false, result);
		
		// array can be split to 2 arrays with same sum
		intArray[7] = 6;
		intArray[6] = 7;
		result = TechScreen.splitIntArray(intArray);
		assertEquals("testSplitIntArray even sum but can't split", true, result);
		
		
	}
	
	@Test
	public void testInsertAsterisk(){
		// normal case
		String str = "asdf";
		String result = TechScreen.insertAsterisk(str);
		assertEquals("testInsertAsterisk",  "a*s*d*f", result);
		
		// test string with only one character
		str = "f";
		result = TechScreen.insertAsterisk(str);
		assertEquals("testInsertAsterisk",  "f", result);
		
		
	}
}
