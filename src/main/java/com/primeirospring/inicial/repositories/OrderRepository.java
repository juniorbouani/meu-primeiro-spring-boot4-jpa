package com.primeirospring.inicial.repositories;

import com.primeirospring.inicial.entities.Order;
import com.primeirospring.inicial.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
