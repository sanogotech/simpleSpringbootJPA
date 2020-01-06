package com.macrosoftas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoftas.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
