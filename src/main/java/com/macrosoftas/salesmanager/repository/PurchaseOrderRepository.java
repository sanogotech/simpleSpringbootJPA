package com.macrosoftas.salesmanager.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoftas.salesmanager.domain.Product;
import com.macrosoftas.salesmanager.domain.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long>{
	

	List<PurchaseOrder> findByOrderLineItemList_product(Product product);
	
	
	List<PurchaseOrder> findByOrderLineItemList_product_madein(String madein);
	
	List<PurchaseOrder> findByCustomer_Email(String email);


}
