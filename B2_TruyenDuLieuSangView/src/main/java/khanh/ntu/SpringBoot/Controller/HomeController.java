package khanh.ntu.SpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index(ModelMap m)
	{
		String mssv = "65131467";
		String hoten = "Nguyễn Quốc Khánh";
		int namsinh = 2005;
		String gioitinh = "Nam";
		
		m.addAttribute("id", mssv);
		m.addAttribute("name", hoten);
		m.addAttribute("year", namsinh);
		m.addAttribute("sex", gioitinh);
		
		return "index";
	}
	
}
