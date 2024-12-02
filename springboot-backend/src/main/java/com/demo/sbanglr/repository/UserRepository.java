package com.demo.sbanglr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.sbanglr.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
