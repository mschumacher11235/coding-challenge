/**
 * 
 */
package ms.codingchallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ms.codingchallenge.c004.StringCompressor;

public class App 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		StringCompressor stringCompressor = appContext.getBean(StringCompressor.class);
		
		System.out.println("Input: aafffrtttTddd");
		System.out.println("Output: " + stringCompressor.compress("aafffrtttTddd"));
	}
}
