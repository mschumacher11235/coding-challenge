package ms.codingchallenge.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ms.codingchallenge.chargrouper.CharGrouper;

@RestController
public class CharGrouperRestController 
{
	@Autowired
	private CharGrouper charGrouper;
	
	@RequestMapping(method = RequestMethod.GET, path = "/group")
	@ResponseBody
	public String groupChars(@RequestParam(value = "chars") String chars) 
	{
		return charGrouper.sortAndCompress(chars);
	}
}
