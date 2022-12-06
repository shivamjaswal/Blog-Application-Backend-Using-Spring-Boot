package com.codewithshivam.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithshivam.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
