/**
 * 
 */
package adaptive;

/**
 * @author Kevin
 *
 */
public class TechScreen {


	/**
	 * Find the integer closest to 1000 from the input.
	 * Assumption: if same result is found for both integers, the first one is returned.
	 * @param int1: the first input integer
	 * @param int2: the 2nd input integer
	 * @return the integer closest to 1000.  
	 */
	public static int findIntCloseTo1000(int int1, int int2){
		int tempInt1 = Math.abs(1000-int1);
		int tempInt2 = Math.abs(1000-int2);
		return tempInt1 > tempInt2 ? int2 : int1;
		
	}
	
	/**
	 * duplicate the characters in a string
	 * @param input string
	 * @return each character in input is duplicated
	 */
	public static String doubleString(String input){
		// return original string if it is null or empty
		if(input == null || input.isEmpty())
			return input;
		int strLength = input.length();
		// create StringBuilder with the desired capacity
		StringBuilder strBuilder = new StringBuilder(strLength * 2);
		for(int i=0; i<strLength; ++i){
			char c = input.charAt(i);
			strBuilder.append(c).append(c);
		}
		return strBuilder.toString();
	}
	
	/**
	 * split an integer array into 2 array and both arrays have the same sum
	 * @param intArr input integer array
	 * @return true: the input array can be split 2 arrays which have equal sum.
	 */
	public static boolean splitIntArray(int[] intArr){
	
		// calculate the sum of the original array
		int sum = 0;
		for(int i=0; i<intArr.length; ++i){
			sum += intArr[i];
		}
		// if the sum is odd, this array can't be split
		if(sum%2 == 1) return false;
		
		// get the new targeted sum of split array
		int splitSum = sum/2;
		sum = 0;
		for(int i=0; i<intArr.length; ++i){
			sum += intArr[i];
			// if the sum in split array is equal to the expected sum, return true
			if(splitSum == sum)
				return true;
			// if the sum in split array is larger than the expected sum, return false;
			else if(sum > splitSum)
				return false;
		}
		return false;
	}
	
	/**
	 * add * between 2 characters of a string
	 * @param input input String
	 * @return a new string with * between characters.
	 */
	public static String insertAsterisk(String input){
		if(input == null || input.length() == 1)
			return input;
		return insertAsteriskImpl(input);
	}
	/**
	 * recursive method to insert * between characters.
	 * @param input the input string
	 * @return new string with * between characters.
	 */
	private static String insertAsteriskImpl(String input){

		// if it is the last character, just return it
		if(input.length() == 1){
			return input;
		}
		else{
			// remove the first character from string
			char c = input.charAt(0);
			// recursive the remaining string.
			String str = input.substring(1, input.length());
			// add * before the return string
			return new StringBuilder().append(c).append("*").append(insertAsteriskImpl(str)).toString();
		}
	}
}
