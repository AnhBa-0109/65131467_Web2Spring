package khanh.ntu.SpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BMIController {
	
	@GetMapping("/BMI")
	public String index()
	{
		return "BMI";
	}

	@PostMapping("/")
	public String BMI(ModelMap m, HttpServletRequest thamso)
	{
		String chieuCao = thamso.getParameter("cao");
		String canNang = thamso.getParameter("nang");
		
		float cao = Float.parseFloat(chieuCao);
		float nang = Float.parseFloat(canNang);
		String text="";
		
		float result = nang / (float)Math.pow(cao, 2);
		
		if(result < 18.5) text = "Gầy";
		else if(result >= 18.5 && result < 25) text = "Bình thường";
		else text = "Béo phì";
		
		m.addAttribute("ketqua", result);
		m.addAttribute("ketqua2", text);
		return "BMI";
	}
}
