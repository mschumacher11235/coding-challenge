package ms.codingchallenge.stringcompressor;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ms.codingchallenge.AppConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class StringCompressorTest 
{
	@Autowired
	private StringCompressorInterface stringCompressor;

	@Test
	public void testCompressSimple() {
		String uncompressed = "aaa";
		String compressed = stringCompressor.compress(uncompressed);
		assertEquals("a3", compressed);
	}

	@Test
	public void testCompressMoreComplex() {
		String uncompressed = "aabbbbcddddddd";
		String compressed = stringCompressor.compress(uncompressed);
		assertEquals("aab4cd7", compressed);
	}

	@Test
	public void testCompressWithNonOptimizedResult() {
		String uncompressed = "hello";
		String compressed = stringCompressor.compress(uncompressed);
		assertEquals(uncompressed, compressed);
	}

}
