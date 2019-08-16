/**
 * 
 */
package ms.codingchallenge.c002;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author manuel
 *
 */
public class ArraySorterTest 
{
	private static ArraySorter arraySorter;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void initArraySorter() throws Exception 
	{
		arraySorter = new ArraySorter();
	}

	@Test
	public void testSort() 
	{
		int[] unsorted = {3,2,4,51,6};
		
		int[] sorted = arraySorter.sort(unsorted);
		
		assertArrayEquals(
			new int[] {2,3,4,6,51}, 
			sorted
		);
	}

}
