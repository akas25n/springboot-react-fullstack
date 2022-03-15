package com.springbootreacttutorial.repository;

import com.springbootreacttutorial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
