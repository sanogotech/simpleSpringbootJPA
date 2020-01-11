package com.macrosoftas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoftas.domain.ProductCategory;

public interface ProductCategoryRepository   extends JpaRepository<ProductCategory, Long> {

}
