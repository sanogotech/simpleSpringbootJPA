package com.macrosoftas.salesmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoftas.salesmanager.domain.ProductCategory;

public interface ProductCategoryRepository   extends JpaRepository<ProductCategory, Long> {

}
