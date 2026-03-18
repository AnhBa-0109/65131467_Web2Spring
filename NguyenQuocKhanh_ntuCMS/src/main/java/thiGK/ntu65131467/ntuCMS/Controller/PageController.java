package thiGK.ntu65131467.ntuCMS.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import thiGK.ntu65131467.ntuCMS.Model.Page;

@RestController
public class PageController {

	@GetMapping("restAPI/page/all")
	public ArrayList<Page> getAllPage()
	{
		ArrayList<Page> dsTrang = new ArrayList<Page>();
		dsTrang.add(new Page(0, "Trang chủ", "từ khóa", "nội dung", 0));
		return dsTrang;
	}
}
