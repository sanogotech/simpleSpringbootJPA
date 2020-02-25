package com.macrosoftas.salesmanager.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.macrosoftas.salesmanager.domain.OrderLineItem;
import com.macrosoftas.salesmanager.domain.Product;
import com.macrosoftas.salesmanager.domain.PurchaseOrder;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PurchaseOrderRepositoryTest {
	
	 @Autowired
	 private PurchaseOrderRepository  purchaseOrderRepository;
	 
	 PurchaseOrder purchaseOrder;

	 @BeforeEach
	 public  void initData() {
		 
		purchaseOrder = new PurchaseOrder();
		purchaseOrder.setOrderDateTime(LocalDateTime.now());
		//Generate unique orderNumber
		String orderNumber = "286932020fax22";
		purchaseOrder.setOrderNumber(orderNumber);
		
		List<OrderLineItem>   orderLineItemList = new ArrayList<OrderLineItem>();
		OrderLineItem orderLineItem1 =  new OrderLineItem();
		//
		Product product = new Product();
		product.setMadein("FR");
		product.setAvailable(true);
		product.setBrand("Louis Viton");
		product.setName("Sac de Voyage");
		///
		orderLineItem1.setQuantity(2);
		orderLineItem1.setProduct(product);
		//
		orderLineItemList.add(orderLineItem1);
		//Add  orderLineItemList
		purchaseOrder.setOrderLineItemList(orderLineItemList);
		
	 
	 }
	 
	 @Test
	 public  void  testFindByOrderLineItemList_Product_Madein() {
		 
		    PurchaseOrder purchaseOrderResult = purchaseOrderRepository.save(purchaseOrder);
		 
		 	assertNotNull(purchaseOrderResult);
		 	
		 	
			List<PurchaseOrder> purchaseOrderList = purchaseOrderRepository.findByOrderLineItemList_Product_Madein("FR");
			
			assertFalse(purchaseOrderList.isEmpty());
			assertEquals("286932020fax22",  purchaseOrderList.get(0).getOrderNumber());
	 }
	 
	 
	 @Test
	 public  void  testFindAllPurchaseOrder() {
		 
		    PurchaseOrder purchaseOrderResult = purchaseOrderRepository.save(purchaseOrder);
		 
		 	assertNotNull(purchaseOrderResult);
		 	
		 	List<PurchaseOrder> purchaseOrderList = purchaseOrderRepository.findAll();
			
		
			assertFalse(purchaseOrderList.isEmpty());
			assertEquals("286932020fax22",  purchaseOrderList.get(0).getOrderNumber());
	 }


}
