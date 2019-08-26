package ms.codingchallenge.bonus;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ms.codingchallenge.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class BonusATest 
{
	@Test
	public void test() 
	{
		String s = "1";
		Integer i = 1;
		
		s = add(s, 1);
		assertEquals("2", s);
		s = add(s, 5);
		assertEquals("7", s);
		
		i = add(i, 2);
		assertEquals((Integer) 3, i);
		i = add(i, 1);
		assertEquals((Integer) 4, i);
	}

	private <S> S add(S s, Integer i) 
	{
		if (s instanceof String) {
			Integer si = Integer.parseInt((String) s);
			Integer result = si + i;
			return (S) Integer.toString(result);
		} else if (s instanceof Integer) {
			Integer result = (Integer) s + i;
			return (S) result;
		}
		return s;
	}
}
