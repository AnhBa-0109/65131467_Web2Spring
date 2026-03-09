package khanh.ntu.SpringBoot.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;


import khanh.ntu.SpringBoot.Model.Product;

@Controller
public class HomeController {
	@GetMapping("/danhsach")
	public String LayDanhSach(ModelMap m)
	{
		List<Product> dsachSP = Arrays.asList(
				new Product(1, "Fenrir 1/72", 19000),
				new Product(2, "Ma Lễ Thanh", 1230),
				new Product(3, "Lữ Bố", 1350)
				);
		m.addAttribute("products", dsachSP);
		return "danhsach";
	}
}
