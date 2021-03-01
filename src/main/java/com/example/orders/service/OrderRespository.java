package com.example.orders.service;

import com.example.orders.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRespository extends JpaRepository<Order, Integer> {
}
