package ms.codingchallenge.chargrouper;

import static org.hamcrest.CoreMatchers.any;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ms.codingchallenge.AppConfig;
import ms.codingchallenge.arraysorter.ArraySorterInterface;
import ms.codingchallenge.stringcompressor.StringCompressorInterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class CharGrouperMockTest 
{
	@Autowired
	private CharGrouper charGrouper;
	
	@MockBean
	private ArraySorterInterface arraySorter;
	
	@SpyBean
	private StringCompressorInterface stringCompressor;

	@Before
	public void initMocks() 
	{
		Mockito
			.when(this.arraySorter.sort(Mockito.any(char[].class)))
			.thenReturn("".toCharArray());
		Mockito
			.when(this.arraySorter.sort("abcdef".toCharArray()))
			.thenReturn("SUCCESS".toCharArray());
	}
	
	@Test
	public void testSortAndCompressMockSuccess()
	{
		String input = "abcdef";
		String expectedOutput = "SUCCESS";
		
		assertEquals(expectedOutput, charGrouper.sortAndCompress(input));
		
		Mockito.verify(this.stringCompressor).compress("SUCCESS");
	}
	
	@Test
	public void testSortAndCompressMockEmptyString()
	{
		String input = "rosebud";
		String expectedOutput = "";
		
		assertEquals(expectedOutput, charGrouper.sortAndCompress(input));
		
		Mockito.verify(this.stringCompressor).compress("");
	}
}
