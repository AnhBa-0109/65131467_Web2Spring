package thiGK.ntu65131467.ntuCMS.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import thiGK.ntu65131467.ntuCMS.Model.Page;
import thiGK.ntu65131467.ntuCMS.Repository.PageRepository;
import thiGK.ntu65131467.ntuCMS.services.PageService;

@Controller
public class PageController {	
	
	@Autowired
	PageService pService;
	
	@GetMapping("/dashboard")
	public String Home()
	{
		return "home";
	}
	
	@GetMapping("/page/all")
	public String getAllPage(ModelMap m)
	{
		List<Page> dsTrang = new ArrayList<Page>();
		dsTrang = pService.getAllPage();
		m.addAttribute("ListPage", dsTrang);
		return "allPage";
	}
	
}
