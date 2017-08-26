package com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;

public interface PostController {

	public Iterable<Post> getAll();
	
	public Post getById(Long id);
	
	public Post create(Post e);
	
	public Iterable<Post> getByPersonId(Long id);
	
	public void remove(Long id);
	
}
