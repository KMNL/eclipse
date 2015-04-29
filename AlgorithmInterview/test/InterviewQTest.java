import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class InterviewQTest {

	@Test
	public void testHasPairWithSum() {
		int [] intArr = {3,6,4,8,9,2,5,7,11};
		boolean result = InterviewQ.hasPairWithSum(intArr, 7);
		assertEquals("testHasPairWithSum", true, result);
		result = InterviewQ.hasPairWithSum(intArr, 21);
		assertEquals("testHasPairWithSum", false, result);
	}

	@Test
	public void testCalcArrayProduct(){
		int [] intArr = {3,6,4,8,9,2};
		int [] result = InterviewQ.calcArrayProduct(intArr);
		int [] expectedResult = {3456,1728,2592,1296,1152,5184};
		Assert.assertArrayEquals(expectedResult, result);
	};
	
	@Test
	public void testFindMaxProfit(){
		int [] intArr = {5,2,4,10,3};
		int result = InterviewQ.findMaxProfit(intArr);
		assertEquals("testFindMaxProfit", 8, result);
	}
	
	@Test
	public void testGetWeightedRandomChar(){
		for(int i=0; i<20; ++i){
			System.out.println(InterviewQ.findWeightedRandomChar());
		}
	}
}
