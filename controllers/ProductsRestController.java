package com.example.demo.controllers;

import com.example.demo.controllers.payloads.NewProductPayload;
import com.example.demo.models.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/products")
public class ProductsRestController {
    private final ProductService productService;

    public ProductsRestController(ProductService productService) {
        this.productService = productService;
    }
    @PostMapping
    public Product createProduct(@RequestBody NewProductPayload newProductPayload ){
        Product product = this.productService.creatProduct(newProductPayload.name(), newProductPayload.description(), newProductPayload.price());
        return product;
    }
    @GetMapping
    public Iterable<Product> findProducts(){
        return this.productService.findAllProducts();
    }
}
