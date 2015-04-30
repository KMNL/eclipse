import java.util.HashMap;


public class InterviewQ {
	/**
	 * Given an array of integers return true if the array contains a pair of integers 
	 * whose sum is a given value and false otherwise
	 * The method would return true given the following array and the sum 15
	 * 4,7,2,9,9,1,4,8,3,11
	 * @param arr the integer array
	 * @param sum the sum to be found for a pair of integer
	 * @return
	 */
	public static boolean hasPairWithSum(int[] arr, int sum){
		HashMap<Integer, Integer> intValueMap = new HashMap<Integer, Integer>();
		// put integer as key and index as value
		for(int i=0; i<arr.length; ++i){
			intValueMap.put(arr[i], i);
		}
		boolean result;
		for(int i=0; i<arr.length; ++i){
			result = intValueMap.containsKey(sum - arr[i]);
			if(result)
				return result;
		}
		
		return false;
	}
	
	/**
	 * Given an array of integers return a new array where the value at every index 
	 * is the product of all of the integers in the input array except the one at that index
	 * without using division
	 * Given the following array the program would return the following output:
	 * Input:    5,  2,  4, 10,  3
	 * Output: 240,600,300,120,400
	 * @param arr integer array
	 * @return integer array
	 */
	public static int[] calcArrayProduct(int[] arr){
		int [] intArray = new int[arr.length];
		
		int product = 1;
		// get the product for the index below 
		for(int i=0; i< arr.length; ++i){
			intArray[i] = product;
			product *= arr[i];
		}
		// get the product for the index above
		product = 1;
		for(int i=arr.length - 1; i>= 0; --i){
			intArray[i] = intArray[i] * product;
			product *= arr[i];
		}
		
		return intArray;
	}
	
	/**
	 * Given an array that represents the prices of a stock over time write a method 
	 * that returns the maximum profit that can be obtained from a single purchase and 
	 * sale of the stock
	 * For the following input the program would return 8. The maximum profit is obtained
	 * by buying at $2 and selling at $10
	 * 5,2,4,10,3
	 * @param arr
	 * @return
	 */
	public static int findMaxProfit(int[] arr){
		// assumption, at least 2 prices needed
		if(arr.length < 2) 
			return -1;
		int maxProfit = 0;
		int minPrice = arr[0];
		
		for(int i=1; i<arr.length; ++i){
			if(arr[i] - minPrice > maxProfit){
				maxProfit = (arr[i] - minPrice);
			}
			if(arr[i] < minPrice){
				minPrice = arr[i];
			}
			
		}
		return maxProfit;
	}
	
	/**
	 * Flatten link list which has a down pointer.
	 * Flatten rule: get the down pointer first then the next
	 * @param root
	 * @return
	 */
	public static MyLinkList flattenLinkList(MyLinkList root){
		// the last object
		if(root.next == null && root.down == null){
			return root;
		}
		MyLinkList lastObj = null;
		MyLinkList flattenList = new MyLinkList(root.value, root.next, root.down);
		if(root.down != null){
			flattenList.next = flattenLinkList(root.down);
			// look for the end of link list and add root.next to the end
			MyLinkList tempObj = flattenList.next;
			while ( tempObj != null){
				lastObj = tempObj;
				tempObj = tempObj.next;
			}
		}
		if(root.next != null){
			if(lastObj == null)
				flattenList.next = flattenLinkList(root.next);
			else{
				lastObj.next = flattenLinkList(root.next);
			}
		}
		
		return flattenList;
	}
	/**
	 * Write a program that prints the following strings with the given probability
	 * Output string   Probability
	 *      A			15%
	 *		B			25%
	 *		C			50%
	 *		D			10%
	 * @return A,B,C,or D based on the weighted probability
	 */
	public static char findWeightedRandomChar(){
		char [] charArray= {'A','B','C','D'};
		double [] weightedNumber = {0.15d,0.25d,0.5d, 0.1d};
		double randomNumber = Math.random();
		for(int i=0;i<charArray.length; ++i){
			randomNumber -= weightedNumber[i];
			if(randomNumber < 0.0d){
				return charArray[i];
			} 
		}
		// the random number is 1.0
		return charArray[3];
	}
}
