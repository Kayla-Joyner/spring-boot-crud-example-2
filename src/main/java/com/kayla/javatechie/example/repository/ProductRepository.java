package com.kayla.javatechie.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayla.javatechie.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	Product findByName(String name);
}
