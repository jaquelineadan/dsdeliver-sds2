package com.jaqueline.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaqueline.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
