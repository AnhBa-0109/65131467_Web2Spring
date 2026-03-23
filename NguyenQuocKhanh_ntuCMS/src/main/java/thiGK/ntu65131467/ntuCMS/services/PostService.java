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
	
	public void addPost(int id, String title, String content, int categoryId)
	{
		Post post = new Post();
		post.setId(id);
		post.setTitle(title);
		post.setContent(content);
		post.setCategoryId(categoryId);
		postRepos.save(post);
	}
	
	public Post getPostByID(int id)
	{
		return postRepos.getById(id);
	}
	
	public void deletePostByID(int id)
	{
		postRepos.deleteById(id);
	}
}
