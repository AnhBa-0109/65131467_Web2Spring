package thiGK.ntu65131467.ntuCMS.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import thiGK.ntu65131467.ntuCMS.Model.Page;
import thiGK.ntu65131467.ntuCMS.Repository.PageRepository;
import thiGK.ntu65131467.ntuCMS.services.PageService;

@RestController
public class PageController {
	
	@Autowired
	PageService pService;
	
	@GetMapping("restAPI/page/all")
	public List<Page> getAllPage()
	{
		List<Page> dsTrang = new ArrayList<Page>();
		dsTrang = pService.getAllPage();
		return dsTrang;
	}
}
