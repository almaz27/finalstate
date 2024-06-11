package com.example.demo.controllers;

import com.example.demo.models.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@RequestMapping("api/products/{productId:\\d+}")
public class ProductRestController {
    private final ProductService productService;

    public ProductRestController(ProductService productService) {
        this.productService = productService;
    }


    @ModelAttribute("product")
    public Product getProduct(@PathVariable("productId") int productId){
        return this.productService.findProduct(productId).orElseThrow(()-> new NoSuchElementException("errors.product.not_found"));
    }

}
