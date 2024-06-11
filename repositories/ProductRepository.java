package com.example.demo.repositories;

import com.example.demo.models.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//
import com.example.demo.models.Product;
//import org.springframework.data.repository.CrudRepository;
//
//import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}

