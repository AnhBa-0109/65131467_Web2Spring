package khanh.ntu.SpringBoot.Controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import khanh.ntu.SpringBoot.Model.Page;

@RestController
public class APIPageController {
	ArrayList<Page> dsTrang = new ArrayList<Page>();
	
	
	public APIPageController()
	{
		Page p1 = new Page(0, "GioiThieu", "mct", "Nội dung trang ở đây", 0);
		Page p2 = new Page(1, "Trang X", "blabla", "Nội dung trang ở đây", 0);
		Page p3 = new Page(2, "Trang Y", "sth", "Nội dung trang ở đây", 0);
		
		dsTrang.add(p1);
		dsTrang.add(p2);
		dsTrang.add(p3);
	}
	
	@GetMapping("/api/pages")
	public ArrayList<Page> getAllPages()
	{
		return dsTrang;
	}
	
	
}
