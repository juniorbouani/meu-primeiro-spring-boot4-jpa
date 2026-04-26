package com.primeirospring.inicial.repositories;

import com.primeirospring.inicial.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}