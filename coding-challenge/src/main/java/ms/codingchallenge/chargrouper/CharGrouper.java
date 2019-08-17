package ms.codingchallenge.chargrouper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ms.codingchallenge.arraysorter.ArraySorterInterface;
import ms.codingchallenge.stringcompressor.StringCompressorInterface;

@Service
public class CharGrouper implements CharGrouperInterface 
{
	@Autowired
	private ArraySorterInterface arraySorter;
	
	@Autowired
	private StringCompressorInterface stringCompressor;

	public String sortAndCompress(String original) 
	{
		char[] sortedCharArray = arraySorter.sort(original.toCharArray());
		String sortedString = String.valueOf(sortedCharArray);
		return stringCompressor.compress(sortedString);
	}

}
