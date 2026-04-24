package thigk2.NguyenQuocKhanh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import thigk2.NguyenQuocKhanh.services.TinService;

@Controller
public class HomeController {
	
	@Autowired
	TinService tinService;
	
	
	@GetMapping("/home")
	public String home(ModelMap m)
	{
		m.addAttribute("listTheLoai", tinService.getAllTheLoai());
		m.addAttribute("listTin", tinService.getAllTin());
		return "home";
	}
}
