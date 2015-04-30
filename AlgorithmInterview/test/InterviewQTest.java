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
	public void testFlattenLinkList(){
		System.out.println("start testFlattenLinkList");
		// build list
		// A->B->C
		MyLinkList g = new MyLinkList('g', null, null);
		MyLinkList f = new MyLinkList('f', g, null);
		MyLinkList e = new MyLinkList('e', null, null);
		MyLinkList d = new MyLinkList('d', f, e);
		MyLinkList c = new MyLinkList('c', d, null);
		MyLinkList b = new MyLinkList('b', null, c);
		MyLinkList a = new MyLinkList('a', b,null);
		MyLinkList newLL = InterviewQ.flattenLinkList(a);
		MyLinkList temp = newLL;
		while(temp != null)
		{
			System.out.println(temp.value);
//			assertNull("down object should be null", temp.down);
			temp = temp.next;
		}
	}
	
	
	@Test
	public void testGetWeightedRandomChar(){
		for(int i=0; i<20; ++i){
			System.out.println(InterviewQ.findWeightedRandomChar());
		}
	}
}
