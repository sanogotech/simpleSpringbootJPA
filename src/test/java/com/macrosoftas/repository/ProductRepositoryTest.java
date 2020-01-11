package com.macrosoftas.repository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//New JUnit 5
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//New JUnit 5 vs JUnit 4 @RunWith(SpringRunner.class)
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.macrosoftas.domain.Product;
import com.macrosoftas.domain.ProductCategory;



@ExtendWith(SpringExtension.class)
@SpringBootTest
public class ProductRepositoryTest {
	
	
	 @Autowired
	 private ProductCategoryRepository productCategoryRepository;

	 @Test
	 public void contextLoads() {
		 
	 }
	 
	 @Test
	 public  void  testSaveACoupleOfCategories() {
		 
		 	// save a couple of categories
	        final ProductCategory categoryA = new ProductCategory("Category A");
	        Set<Product> ProductAs = new HashSet<>();
	        ProductAs.add(new Product("Product A1", categoryA));
	        ProductAs.add(new Product("Product A2", categoryA));
	        ProductAs.add(new Product("Product A3", categoryA));
	        categoryA.setProducts(ProductAs);

	        final ProductCategory categoryB = new ProductCategory("Category B");
	        Set<Product> ProductBs = new HashSet<>();
	        ProductBs.add(new Product("Product B1", categoryB));
	        ProductBs.add(new Product("Product B2", categoryB));
	        ProductBs.add(new Product("Product B3", categoryB));
	        categoryB.setProducts(ProductBs);

	        productCategoryRepository.saveAll(Arrays.asList(categoryA, categoryB));

	        // fetch all categories
	        for (ProductCategory productCategory : productCategoryRepository.findAll()) {
	           // logger.info(productCategory.toString());
	        	System.out.println(productCategory.toString());
	        }
		 
	 }
}
