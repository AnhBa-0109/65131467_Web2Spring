package thiGK.ntu65131467.ntuCMS.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	//hiển thị danh sách page
	@GetMapping("/page/all")
	public String getAllPage(ModelMap m)
	{
		List<Page> dsTrang = new ArrayList<Page>();
		dsTrang = pService.getAllPage();
		m.addAttribute("ListPage", dsTrang);
		return "allPage";
	}
	
	@GetMapping("/page/new")
	public String openAddNewPage()
	{
		return "addPage";
	}
	
	@PostMapping("/savepage")
	public String addNewPage(
			@RequestParam("id") int id,
			@RequestParam("pageName") String pageName,
			@RequestParam(value = "keyword", required = false) String keyword,
			@RequestParam(value = "content", required = false) String Content,
			@RequestParam("parentPageId") int parentPageId,
			ModelMap m)
	{
		
		for(Page p : pService.getAllPage())
		{
			 if(id == p.getId())
			 {
				 m.addAttribute("err", "Id không được trùng với các Page khác");
				 return "addPage";
			 }
		}
		
		if(pageName == null || pageName.trim().isEmpty()) {
			m.addAttribute("err", "Không được để tên trang trống");
			return "addPage";
		}
		
		pService.addNewPage(id, pageName, keyword, Content, parentPageId);
		return "redirect:/page/all";
	}
}
