package com.macrosoftas.salesmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.macrosoftas.salesmanager.domain.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Long> {

}
