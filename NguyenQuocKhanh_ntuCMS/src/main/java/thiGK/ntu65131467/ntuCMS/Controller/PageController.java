package thiGK.ntu65131467.ntuCMS.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import thiGK.ntu65131467.ntuCMS.Model.Page;
import thiGK.ntu65131467.ntuCMS.Repository.PageRepository;

@RestController
public class PageController {
	
	@Autowired
	PageRepository pRepos;
	
	@GetMapping("restAPI/page/all")
	public ArrayList<Page> getAllPage()
	{
		ArrayList<Page> dsTrang = new ArrayList<Page>();
		dsTrang = (ArrayList<Page>) pRepos.findAll(); 
		return dsTrang;
	}
}
