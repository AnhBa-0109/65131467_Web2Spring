package thiGK.ntu65131467.ntuCMS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu65131467.ntuCMS.Model.Page;
import thiGK.ntu65131467.ntuCMS.Repository.PageRepository;

@Service
public class PageService {

	@Autowired
	PageRepository pRepos;
	
	public List<Page> getAllPage(){
		return pRepos.findAll();
	}
	
	public Page getPageByID(int id)
	{
		return pRepos.getById(id);
		//return pRepos.findById(id).orElse(null);
	}
	
	public void addNewPage(int id, String pageName, String keyword, String content, int parentPageId)
	{
		Page newPage = new Page();
		newPage.setId(id);
		newPage.setPageName(pageName);
		newPage.setKeyWord(keyword);
		newPage.setContent(content);
		newPage.setParentPageId(parentPageId);
		
		pRepos.save(newPage);
	}
}
