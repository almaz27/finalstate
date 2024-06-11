package com.example.demo.service;

import com.example.demo.models.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;


public interface ProductService {

    Iterable<Product> findAllProducts();
    Product creatProduct(String name, String description, double price);
    Optional <Product> findProduct(Integer productId);




}
