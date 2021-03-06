package com.macrosoftas.salesmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoftas.salesmanager.domain.Product;

// https://www.baeldung.com/spring-data-derived-queries
// https://www.baeldung.com/spring-data-jpa-query-by-date

// Note that the findById() method is already defined in CrudRepository / Spring boot 2.x

// https://medium.com/@milan.brankovic/spring-advanced-search-filtering-5ee850f9458c

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	//Condition Keywords
	
	List <Product>  findByName(String name);
	
	//to perform a case-insensitive search to find all products with a given name.
	 List<Product> findByNameIgnoreCase(String name);
	 
	 List<Product> findByMadeinIgnoreCase(String madein);
	
	
	List<Product> findByNameIsNotNull();
	
	List<Product> findByNameIsNot(String name);
	
	List<Product> findByNameStartingWith(String prefix);
	
	List<Product> findByNameEndingWith(String suffix);
	
	List<Product> findByNameContaining(String infix);
	
	//Sorting the Results
	List<Product> findByNameOrderByNameDesc(String name);
	
	// String likePattern = "a%b%c";
	List<Product> findByNameLike(String likePattern);
	
	List <Product>  findByBrand(String brand);
	
	List<Product> findByBrandIsNot(String brand);
	
	List <Product>  findByMadein(String madein);

	List<Product>   findByPriceGreaterThanOrderByPriceDesc(float price);

	//expects at least 1 arguments but only found 0. This leaves an operator of type SIMPLE_PROPERTY for property price unbound
	//List<Product> findTop3ByPrice();
	
	//List<Product> findByAvailableTrue();
	

	

}
