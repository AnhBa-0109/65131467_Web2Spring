package khanh.ntu.SpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import khanh.ntu.SpringBoot.Model.Product;

@Controller
public class HomeController {
	
	@GetMapping("/product")
	public String showProduct(ModelMap model)
	{
		Product product = new Product(001, "Fenrir 1/72", 1900000.0);
		
		model.addAttribute("product", product);
		return "product";
	}
}
