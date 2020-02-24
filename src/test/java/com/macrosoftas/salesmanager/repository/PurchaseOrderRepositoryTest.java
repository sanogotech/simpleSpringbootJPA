package com.macrosoftas.salesmanager.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.macrosoftas.salesmanager.domain.OrderLineItem;
import com.macrosoftas.salesmanager.domain.PurchaseOrder;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class PurchaseOrderRepositoryTest {
	
	 @Autowired
	 private PurchaseOrderRepository  purchaseOrderRepository;
	 
	 PurchaseOrder purchaseOrder;

	 @BeforeAll
	 public void setUp() {
		 
		purchaseOrder = new PurchaseOrder();
		purchaseOrder.setOrderDateTime(LocalDateTime.now());
		//Generate unique orderNumber
		String orderNumber = "286932020fax22";
		purchaseOrder.setOrderNumber(orderNumber);
		
		List<OrderLineItem>   orderLineItemList = new ArrayList<OrderLineItem>();
		OrderLineItem orderLineItem1 =  new OrderLineItem();
		orderLineItem1.setQuantity(2);
		
		//Add  orderLineItemList
		purchaseOrder.setOrderLineItemList(orderLineItemList);
		
		 
	 }
	 
	 @Test
	 public  void  testSavePurchaseOrder() {
		 
		 PurchaseOrder purchaseOrderResult = purchaseOrderRepository.save(purchaseOrder);
		 
	 }

}
