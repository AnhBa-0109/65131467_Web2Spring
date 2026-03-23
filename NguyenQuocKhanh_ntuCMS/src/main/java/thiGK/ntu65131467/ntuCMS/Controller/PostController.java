package thiGK.ntu65131467.ntuCMS.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import thiGK.ntu65131467.ntuCMS.Model.Post;
import thiGK.ntu65131467.ntuCMS.services.PostService;

@Controller
public class PostController {

	@Autowired
	PostService postService;
	
	@GetMapping("/post/all")
	public String getAllPost(ModelMap m)
	{
		List<Post> dsPost = new ArrayList<Post>();
		dsPost = postService.getAllPost();
		m.addAttribute("ListPost", dsPost);
		return "allPost";
	}
	
	@GetMapping("post/new")
	public String openForm()
	{
		return "addPost";
	}
	
	@PostMapping("savePost")
	public String savePost(@RequestParam("id") int id,
							@RequestParam("title") String title,
							@RequestParam("content") String content,
							@RequestParam("cateID") int cateId)
	{
		for(Post p : postService.getAllPost())
		{
			if(id == p.getId())
				return "addPost";
		}
		postService.addPost(id, title, content, cateId);
		return "redirect:/post/all";
	}
	
}
