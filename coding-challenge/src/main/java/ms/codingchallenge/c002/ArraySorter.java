/**
 * 
 */
package ms.codingchallenge.c002;

import java.util.Arrays;

/**
 * @author manuel
 *
 */
public class ArraySorter 
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
