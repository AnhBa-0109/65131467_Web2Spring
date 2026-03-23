package thiGK.ntu65131467.ntuCMS.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiGK.ntu65131467.ntuCMS.Model.Post;
import thiGK.ntu65131467.ntuCMS.Repository.PostRepository;

@Service
public class PostService {
	
	@Autowired
	PostRepository postRepos;
	
	public List<Post> getAllPost()
	{
		return postRepos.findAll();
	}
}
