package thiGK.ntu65131467.ntuCMS.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

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
}
