package khanh.ntu.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import khanh.ntu.SpringBoot.models.LoaiTinTuc;
import khanh.ntu.SpringBoot.service.TinTucService;

@Controller
public class AdminController {

	@Autowired
	TinTucService tintucService;
	
	@GetMapping("/admin")
	public String getALL(ModelMap m)
	{
		m.addAttribute("dsTinTuc", tintucService.getAllTinTuc());
		m.addAttribute("dsLoai", tintucService.getAllLoai());
		return "admin";
	}
	
	@PostMapping("/admin/save")
	public String save(@RequestParam("name") String name,
						@RequestParam("content") String content,
						@RequestParam("loaiTT.id") LoaiTinTuc loai
						,ModelMap m)
	{
		tintucService.saveTinTuc(name, content, loai);
		return "redirect:/admin";
	}
}
