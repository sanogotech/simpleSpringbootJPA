package com.macrosoftas.salesmanager.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.macrosoftas.salesmanager.domain.Customer;
import com.macrosoftas.salesmanager.domain.PurchaseOrder;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CustomerRepositoryTest {
	
	 @Autowired
	 private CustomerRepository   customerRepository;
	
	 @BeforeEach
	 public  void initData() {
		 
		Customer  customer = new Customer();
		customer.setEmail("test@gmail.com");
		
		PurchaseOrder purchaseOrder = new PurchaseOrder();
		purchaseOrder.setOrderDateTime(LocalDateTime.now());
		//Generate unique orderNumber
		String orderNumber = "286932020fax22";
		purchaseOrder.setOrderNumber(orderNumber);
		
		List<PurchaseOrder> purchaseOrderList = new ArrayList<PurchaseOrder>();
		purchaseOrderList.add(purchaseOrder);
		
		customer.setPurchaseOrderList(purchaseOrderList );
		
		customerRepository.save(customer);

	 }
	 
	 
	 @Test
	 public  void testFindByPurchaseOrderList_OrderNumber() {
		 
		 Customer  customer =customerRepository.findByPurchaseOrderList_OrderNumber("286932020fax22");
		 
		 assertEquals("test@gmail.com",  customer.getEmail());
	 }

}
