package ms.codingchallenge.c003;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ms.codingchallenge.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class ArraySorterBeanTest {

	@Autowired
	private ArraySorterBean arraySorter;
	
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
