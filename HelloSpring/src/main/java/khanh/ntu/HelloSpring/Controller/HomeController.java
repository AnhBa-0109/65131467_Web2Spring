package khanh.ntu.HelloSpring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	@GetMapping("/vd1")
	public String getVD1(ModelMap m)
	{
		String kq = "Dữ liệu này đến từ Controller";
		m.addAttribute("tb", kq);
		return "index";
	}
	
	//Lấy giá trị (tham số URL) tại controller
	//http://.../vd2?ten=NguyenQuocKhanh&mk=Khanh0109
	@GetMapping("/vd2")
	public String getVD2(HttpServletRequest thamso, ModelMap m)
	{
		String ten = thamso.getParameter("ten");
		String mk = thamso.getParameter("mk");
		m.addAttribute("name", ten);
		m.addAttribute("mk", mk);
		return "index2";
	}
	
	//Lấy giá trị (tham số URL) tại controller cách khác
	//http://.../vd3?ten=NguyenQuocKhanh&mk=Khanh0109
	@GetMapping("/vd3")
	public String getVD3(@RequestParam("ten") String tenP, @RequestParam("mk") String mkP, ModelMap m)
	{
		m.addAttribute("name", tenP);
		m.addAttribute("pass", mkP);
		return "index2";
	}
	
	@GetMapping("/login")
	public String DangNhap()
	{
		return "login";
	}
	
	@PostMapping("/vd4")
	public String postMethodName(HttpServletRequest thamso, ModelMap m)
	{
		String tenDN = thamso.getParameter("username");
		String mk = thamso.getParameter("pass");
		m.addAttribute("username", tenDN);
		m.addAttribute("pass", mk);
		return "index4";
	}
}
