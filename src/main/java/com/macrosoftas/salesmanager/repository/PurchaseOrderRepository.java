package com.macrosoftas.salesmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoftas.salesmanager.domain.PurchaseOrder;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long>{

}
