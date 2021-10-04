package dk.kea.adventureproject.controllers;

import dk.kea.adventureproject.models.Product;
import dk.kea.adventureproject.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Julius Panduro
 */
public class ProductController {
    @Autowired
    ProductService productService;
    //Template For ProductController
    @GetMapping("/products")
    public String readProducts(Model model){
        List<Product> productList = productService.fetchAll();
        model.addAttribute("products", productList);
        return "/products";
    }



}