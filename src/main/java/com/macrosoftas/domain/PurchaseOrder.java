package com.macrosoftas.domain;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PurchaseOrder {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
	
	@Column(columnDefinition = "TIMESTAMP") 
	private
	LocalDateTime orderDateTime;
	
	@OneToMany
	private List<OrderLineItem>   orderLineItemList;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	
	

}
