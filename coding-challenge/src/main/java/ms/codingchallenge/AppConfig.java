package ms.codingchallenge;

import org.springframework.context.annotation.*;

import ms.codingchallenge.c003.ArraySorterBean;

@Configuration
public class AppConfig {
	
	@Bean
	public ArraySorterBean arraySorter()
	{
		return new ArraySorterBean();
	}

}
