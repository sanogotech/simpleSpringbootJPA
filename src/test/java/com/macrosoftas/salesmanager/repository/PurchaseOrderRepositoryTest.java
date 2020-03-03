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

import com.macrosoftas.salesmanager.domain.Customer;
import com.macrosoftas.salesmanager.domain.OrderLineItem;
import com.macrosoftas.salesmanager.domain.Product;
import com.macrosoftas.salesmanager.domain.PurchaseOrder;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PurchaseOrderRepositoryTest {
	
	 @Autowired
	 private PurchaseOrderRepository  purchaseOrderRepository;
	 
	 @Autowired
	 private ProductRepository   productRepository;
	 
	 @Autowired
	 private OrderLineItemRepository   orderLineItemRepository;
	 
	 
	 PurchaseOrder purchaseOrder;
	 


	 @BeforeEach
	 public  void initData() {
		 
		purchaseOrder = new PurchaseOrder();
		purchaseOrder.setOrderDateTime(LocalDateTime.now());
		//Generate unique orderNumber
		String orderNumber = "286932020fax22";
		purchaseOrder.setOrderNumber(orderNumber);
		Customer  customer = new Customer();
		customer.setEmail("test@gmail.com");
		purchaseOrder.setCustomer(customer);
		
		List<OrderLineItem>   orderLineItemList = new ArrayList<OrderLineItem>();
		OrderLineItem orderLineItem1 =  new OrderLineItem();
		//  Save  Catalog
		
		Product  	productEntity = new Product();
		productEntity.setMadein("FR");
		productEntity.setAvailable(true);
		productEntity.setBrand("Louis Viton");
		productEntity.setName("Sac de Voyage");
		//Product  	product = productRepository.save(productEntity);
		
		
		///
		orderLineItem1.setQuantity(2);
		orderLineItem1.setProduct(productEntity);
		
		//OrderLineItem orderLineItem1Save = orderLineItemRepository.save(orderLineItem1);
		//
		orderLineItemList.add(orderLineItem1);
		//Add  orderLineItemList
		purchaseOrder.setOrderLineItemList(orderLineItemList);
		
		System.out.println((orderLineItemList.toString()));
	 
	 }
	 
	// @Test
	 public  void  testFindByOrderLineItemList_Product() {
		 
		    PurchaseOrder purchaseOrderResult = purchaseOrderRepository.save(purchaseOrder);
		 
		 	assertNotNull(purchaseOrderResult);
		 	
		 	Product  productCurrent = purchaseOrderResult.getOrderLineItemList().get(0).getProduct();
		 	
			assertNotNull(productCurrent);
		 	
			List<PurchaseOrder> purchaseOrderList = purchaseOrderRepository.findByOrderLineItemList_product(productCurrent);
			
			assertFalse(purchaseOrderList.isEmpty());
			assertEquals("286932020fax22",  purchaseOrderList.get(0).getOrderNumber());
	 }
	 
	// @Test
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
			//assertEquals("FR",  purchaseOrderList.get(0).getOrderLineItemList().get(0).getProduct().getMadein());
	 }
	 
	 @Test
	 public  void  testFindByCustomer_Email() {
		 
		 purchaseOrderRepository.save(purchaseOrder);
		 
		 List<PurchaseOrder> purchaseOrderList = purchaseOrderRepository.findByCustomer_Email("test@gmail.com");
		 
		 assertFalse(purchaseOrderList.isEmpty());
		 assertEquals("286932020fax22",  purchaseOrderList.get(0).getOrderNumber());
	
	 }


}
