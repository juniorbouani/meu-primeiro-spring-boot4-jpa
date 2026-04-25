package com.primeirospring.inicial.repositories;

import com.primeirospring.inicial.entities.Category;
import com.primeirospring.inicial.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
