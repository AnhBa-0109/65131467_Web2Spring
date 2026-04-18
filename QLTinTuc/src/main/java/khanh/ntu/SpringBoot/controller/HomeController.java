package khanh.ntu.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import khanh.ntu.SpringBoot.service.TinTucService;

@Controller
public class HomeController {
	
	@Autowired
	TinTucService tintucService;
	
	@GetMapping("/home")
	public String getALL(ModelMap m)
	{
		m.addAttribute("dsTinTuc", tintucService.getAllTinTuc());
		return "home";
	}
	
	@GetMapping("/home/{id}")
	public String showDetail(@PathVariable("id") int id, ModelMap m)
	{
		m.addAttribute("page", tintucService.getTinTuc(id));
		return "detail";
	}
}
