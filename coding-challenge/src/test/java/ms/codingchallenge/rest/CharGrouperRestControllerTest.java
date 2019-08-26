package ms.codingchallenge.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import ms.codingchallenge.App;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(
	webEnvironment = WebEnvironment.MOCK,
	classes = App.class
)
@AutoConfigureMockMvc
public class CharGrouperRestControllerTest 
{
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testGroupChars() throws Exception
	{
		mvc.perform(get("/group").param("chars", "abzuaaissna"))
			.andExpect(status().isOk())
			.andExpect(content().string("{\"output\":\"a4binssuz\"}"));
	}
}
