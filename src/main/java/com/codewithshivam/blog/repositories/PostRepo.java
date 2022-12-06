package com.codewithshivam.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithshivam.blog.entities.Category;
import com.codewithshivam.blog.entities.Post;
import com.codewithshivam.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	List<Post> findByTitleContaining(String keyword);
	
}
