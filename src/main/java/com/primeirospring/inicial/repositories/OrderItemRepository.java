package com.primeirospring.inicial.repositories;

import com.primeirospring.inicial.entities.OrderItem;
import com.primeirospring.inicial.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
