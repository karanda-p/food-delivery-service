package com.itfb.fooddeliveryservice.repository;

import com.itfb.fooddeliveryservice.model.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}