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
}
