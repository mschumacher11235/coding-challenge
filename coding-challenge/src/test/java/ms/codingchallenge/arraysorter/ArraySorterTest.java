package ms.codingchallenge.arraysorter;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ms.codingchallenge.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class ArraySorterTest {

	@Autowired
	private ArraySorterInterface arraySorter;
	
	@Test
	public void testSortInt() 
	{
		int[] unsorted = {3,2,4,51,6};
		
		int[] sorted = arraySorter.sort(unsorted);
		
		assertArrayEquals(
			new int[] {2,3,4,6,51}, 
			sorted
		);
	}
	
	@Test
	public void testSortChars() 
	{
		char[] unsorted = {'a','f','c','C','b', 'a'};
		
		char[] sorted = arraySorter.sort(unsorted);
		
		assertArrayEquals(
			new char[] {'C','a','a','b','c','f'}, 
			sorted
		);
	}
}
