package ms.codingchallenge.stringcompressor;

import org.springframework.stereotype.Service;

/**
 * @author manuel
 */
@Service
public class StringCompressor implements StringCompressorInterface
{
	/**
	 * @param uncompressed
	 * @return
	 */
	public String compress(String uncompressed)
	{
		char[] uncompressedChars = uncompressed.toCharArray();
		String compressedString = "";
		String currentCompressedSubString = "";
		
		for (char currentChar : uncompressedChars) {
			if (currentCompressedSubString.isEmpty()) {
				// starts a new compressed substring
				currentCompressedSubString += currentChar;
			} else if (currentCompressedSubString.substring(0, 1).equals(String.valueOf(currentChar))) {
				// add the next char to the current compressed substring if it's still the same one
				currentCompressedSubString = addCharToCompressedString(currentCompressedSubString, currentChar);
			} else {
				// otherwise add to the result and start a new substring
				compressedString += currentCompressedSubString;
				currentCompressedSubString = String.valueOf(currentChar);
			}
		}
		compressedString += currentCompressedSubString;
		
		return compressedString;
	}
	
	/**
	 * @param compressedString
	 * @param newChar
	 * @return
	 */
	private String addCharToCompressedString(String compressedString, Character newChar) 
	{
		if (compressedString.length() == 1) {
			// "a" just becomes "aa"
			compressedString += newChar.toString();
			return compressedString;
		} 
		
		String letterToCompress = compressedString.substring(0, 1);
		String compressedSuffix = compressedString.substring(1);
		if (!compressedSuffix.matches("[0-9]")) {
			// "aa" with another "a" becomes "a3"
			return letterToCompress + "3";
		}
		
		// from "a3" the number just gets increased
		Integer suffixNumber = Integer.parseInt(compressedSuffix);
		suffixNumber++;
		
		return letterToCompress + suffixNumber.toString();
	}
}
