package com.primeirospring.inicial.repositories;

import com.primeirospring.inicial.entities.Category;
import com.primeirospring.inicial.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
