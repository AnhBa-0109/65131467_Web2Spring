package khanh.ntu.SpringBoot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import khanh.ntu.SpringBoot.models.TinTuc;
import khanh.ntu.SpringBoot.service.TinTucService;


@RestController
public class RController {
	
	@Autowired
	TinTucService tintucService;
	
	@GetMapping("/testAPI")
	public List<TinTuc> getALLTinTuc()
	{
		return tintucService.getAllTinTuc();
	}
}
