package ms.codingchallenge.bonus;

import static org.junit.Assert.*;

import java.lang.reflect.Field;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ms.codingchallenge.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class BonusBTest
{
	@Test
	public void testChangeFooBar() throws NoSuchFieldException, IllegalAccessException {
		TestClass testClass = new TestClass();
		assertEquals("test", testClass.getFoobar());

		Field foobarField;
		foobarField = testClass.getClass().getDeclaredField("foobar");
		foobarField.setAccessible(true);
		foobarField.set(testClass, "SUCCESS");
		
		assertEquals("SUCCESS", testClass.getFoobar());
	}

	private class TestClass
	{
		private String foobar = "test";
		public String getFoobar() {
			return foobar;
		}
	}
}
