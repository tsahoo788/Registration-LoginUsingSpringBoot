package com.girmiti.springboot.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.girmiti.springboot.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
	User findByEmail(String email);
}