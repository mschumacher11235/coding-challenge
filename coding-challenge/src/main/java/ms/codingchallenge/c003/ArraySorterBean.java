/**
 * 
 */
package ms.codingchallenge.c003;

import java.util.Arrays;

/**
 * @author manuel
 *
 */
public class ArraySorterBean 
{
	/**
	 * @param unsorted
	 * @return sorted
	 */
	public int[] sort(int[] unsorted) {
		int[] copy = Arrays.copyOf(unsorted, unsorted.length);
		Arrays.sort(copy);
		return copy;
	}

}
