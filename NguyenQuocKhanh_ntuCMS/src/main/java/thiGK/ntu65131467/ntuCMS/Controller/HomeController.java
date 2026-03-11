package thiGK.ntu65131467.ntuCMS.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/dashboard")
	public String openDB()
	{
		return "home";
	}
}
