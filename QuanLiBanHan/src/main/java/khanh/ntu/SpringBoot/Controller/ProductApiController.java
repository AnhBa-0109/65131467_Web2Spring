package khanh.ntu.SpringBoot.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductApiController {

    @GetMapping
    @PreAuthorize("hasRole('USER')")
    public String getAllProducts() {
        return "List of products (JWT protected)";
    }
}
