package com.macrosoftas.salesmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoftas.salesmanager.domain.OrderLineItem;

public interface OrderLineItemRepository  extends JpaRepository<OrderLineItem, Long>{

}
