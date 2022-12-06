package com.codewithshivam.blog.services;

import com.codewithshivam.blog.payloads.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commenDto, Integer postId);
	
	void deleteComment(Integer commentId);
	
}
