package com.promineotech.inventoryManagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.inventoryManagement.entity.Orders;

public interface OrderRepository extends CrudRepository<Orders, Long>{

}
