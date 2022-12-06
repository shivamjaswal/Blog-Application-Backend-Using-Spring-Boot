package com.codewithshivam.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithshivam.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	

}
