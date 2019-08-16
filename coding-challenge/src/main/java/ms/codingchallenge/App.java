/**
 * 
 */
package ms.codingchallenge;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ms.codingchallenge.c003.ArraySorterBean;

public class App 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ArraySorterBean arraySorter = appContext.getBean(ArraySorterBean.class);
		int[] unsorted = {3,1,2};
		int[] sorted = arraySorter.sort(unsorted);
		
		for (int i : sorted) {
			System.out.println(i);
		}
	}

}
