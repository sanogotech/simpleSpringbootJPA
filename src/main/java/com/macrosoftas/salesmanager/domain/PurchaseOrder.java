package com.macrosoftas.salesmanager.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class PurchaseOrder {
	
	//@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
   // private long id;
	
	@Id
	//@Column(unique = true)
	private String orderNumber;
	
	@Column(columnDefinition = "TIMESTAMP") 
	private
	LocalDateTime orderDateTime;
	
	
	@ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
	
	@OneToMany(mappedBy = "purchaseOrder")
	private List<OrderLineItem>   orderLineItemList;
	
	//Default
	public PurchaseOrder (){
		
	}
	
	

	public PurchaseOrder(String orderNumber, LocalDateTime orderDateTime, Customer customer,
			List<OrderLineItem> orderLineItemList) {
		super();
		this.orderNumber = orderNumber;
		this.orderDateTime = orderDateTime;
		this.customer = customer;
		this.orderLineItemList = orderLineItemList;
	}



	

	public List<OrderLineItem> getOrderLineItemList() {
		return orderLineItemList;
	}

	public void setOrderLineItemList(List<OrderLineItem> orderLineItemList) {
		this.orderLineItemList = orderLineItemList;
	}

	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}

	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}



	public String getOrderNumber() {
		return orderNumber;
	}



	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}



	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	

}
