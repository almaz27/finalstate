package com.example.demo.service;

import com.example.demo.models.Product;
import com.example.demo.repositories.ProductRepository;
import com.fasterxml.jackson.core.PrettyPrinter;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DefaultProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    public DefaultProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Iterable<Product> findAllProducts() {
        return this.productRepository.findAll();
    }

    @Override
    public Product creatProduct(String name, String description, double price) {
        return this.productRepository.save(new Product(null,name,description,price));
    }

    @Override
    public Optional<Product> findProduct(Integer productId) {
        return this.productRepository.findById(productId);
    }
}
