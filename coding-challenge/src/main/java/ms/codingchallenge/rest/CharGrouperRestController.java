package ms.codingchallenge.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ms.codingchallenge.chargrouper.CharGrouper;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CharGrouperRestController 
{
	@Autowired
	private CharGrouper charGrouper;
	
	@RequestMapping(method = RequestMethod.GET, path = "/group")
	@ResponseBody
	public Result groupChars(@RequestParam(value = "chars") String chars) 
	{
		return new Result(
			charGrouper.sortAndCompress(chars)
		);
	}
	
	public class Result {
		private String output;
		
		public Result(String output)
		{
			this.output = output;
		}
		
		public String getOutput() {
			return output;
		}
	}
}
