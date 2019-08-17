package ms.codingchallenge.chargrouper;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ms.codingchallenge.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class CharGrouperTest 
{
	@Autowired
	private CharGrouper charGrouper;

	@Test
	public void testSortAndCompressSimple()
	{
		String input = "abzuaaissna";
		String expectedOutput = "a4binssuz";
		
		assertEquals(expectedOutput, charGrouper.sortAndCompress(input));
	}
	
	@Test
	public void testSortAndCompressLonger()
	{
		String input = "abzffFuaaisfsnagAAiiIzzAafoOF";
		String expectedOutput = "A3FFIOa5bf4gi3nossuz3";
		
		assertEquals(expectedOutput, charGrouper.sortAndCompress(input));
	}
	
	@Test
	public void testSortAndCompressIdentical()
	{
		String input = "Hello";
		
		assertEquals(input, charGrouper.sortAndCompress(input));
	}
}
