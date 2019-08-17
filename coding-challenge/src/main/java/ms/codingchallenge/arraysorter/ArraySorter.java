package ms.codingchallenge.arraysorter;

import java.util.Arrays;

import org.springframework.stereotype.Service;

/**
 * @author manuel
 *
 */
@Service
public class ArraySorter implements ArraySorterInterface
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

	/**
	 * @param unsorted
	 * @return
	 */
	public char[] sort(char[] unsorted) {
		char[] copy = Arrays.copyOf(unsorted, unsorted.length);
		Arrays.sort(copy);
		return copy;
	}
}
