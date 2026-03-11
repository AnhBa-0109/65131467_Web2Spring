package thiGK.ntu65131467.ntuCMS.Controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import thiGK.ntu65131467.ntuCMS.Model.Page;
import thiGK.ntu65131467.ntuCMS.Model.Post;

@Controller
public class HomeController {
	
	//Danh sách Page, Post
	ArrayList<Page> dsPage = new ArrayList<Page>();
	ArrayList<Post> dsPost = new ArrayList<Post>();
	
	public HomeController() {
		dsPage.add(new Page("PG1", "Page 1", "PG01", "Page này hiển thị nội dung 1", 1));
		dsPage.add(new Page("PG2", "Page 2", "PG02", "Page này hiển thị nội dung 2", 2));
		dsPage.add(new Page("PG3", "Page 3", "PG03", "Page này hiển thị nội dung 3", 3));
		
		dsPost.add(new Post("PO1", "Post 1", "Post này hiển thị nội dung 1", 1));
		dsPost.add(new Post("PO2", "Post 2", "Post này hiển thị nội dung 2", 2));
		dsPost.add(new Post("PO3", "Post 3", "Post này hiển thị nội dung 3", 3));
	}
	
	@GetMapping("/page/all")
	public String getAllPage(ModelMap m) {
		m.addAttribute("ListPage", dsPage);
		return "allPage";
	}
	
	@GetMapping("/post/all")
	public String getAllPost(ModelMap m) {
		m.addAttribute("ListPost", dsPost);
		return "allPost";
	}
	
	@GetMapping("/dashboard")
	public String openDB()
	{
		return "home";
	}
	
	
}
