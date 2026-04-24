package thigk2.NguyenQuocKhanh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
	
	@GetMapping("/home/tin/{id}")
	public String viewTin(@PathVariable("id") int id, ModelMap m)
	{
		m.addAttribute("tin", tinService.getById(id));
		return "view";
	}
	
	@GetMapping("/login")
	public String login()
	{
		return "login";
	}
}
