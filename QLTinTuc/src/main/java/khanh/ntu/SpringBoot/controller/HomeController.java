package khanh.ntu.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

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
}
