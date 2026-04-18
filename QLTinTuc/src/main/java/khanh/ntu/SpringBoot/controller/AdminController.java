package khanh.ntu.SpringBoot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import khanh.ntu.SpringBoot.models.LoaiTinTuc;
import khanh.ntu.SpringBoot.models.TinTuc;
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
	public String save(@ModelAttribute("tintuc") TinTuc tintuc)
	{
		tintucService.saveTinTuc(tintuc);
		return "redirect:/admin";
	}
	
	@PostMapping("/admin/loai/save")
	public String save(@ModelAttribute("loai") LoaiTinTuc loai)
	{
		tintucService.saveLoai(loai);
		return "redirect:/admin";
	}
	@GetMapping("/admin/delete/{id}")
	public String delete(@PathVariable("id") int id)
	{
		tintucService.deleteTinTuc(id);
		return "redirect:/admin"; 
	}
	
	@GetMapping("/admin/edit/{id}")
	public String editTinTuc(@PathVariable("id") int id, ModelMap m)
	{
		m.addAttribute("tinTuc", tintucService.getTinTuc(id));
		m.addAttribute("dsLoai", tintucService.getAllLoai());
		
		return "updateTinTuc";
	}
}
