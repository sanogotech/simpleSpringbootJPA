package com.macrosoftas.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.macrosoftas.salesmanager.domain.Product;
import com.macrosoftas.salesmanager.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl  implements ProductService {

	@Autowired
	private ProductRepository repo;
	
	public List<Product> listAll() {
		return repo.findAll();
	}
	
	public List<Product> searchByName(String name) {
		return repo.findByName(name);
	}
	
	public void save(Product product) {
		repo.save(product);
	
	}
	
	public Product get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}

	@Override
	public List<Product> searchByNameIgnoreCase(String name) {
		return repo.findByNameIgnoreCase(name);
	}
}
