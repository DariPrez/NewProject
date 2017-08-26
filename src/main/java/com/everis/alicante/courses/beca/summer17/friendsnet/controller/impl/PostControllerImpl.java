package com.everis.alicante.courses.beca.summer17.friendsnet.controller.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces.PostController;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.PostManager;

@RestController
@RequestMapping("/post")
public class PostControllerImpl implements PostController{
	
	@Autowired
	private PostManager postManager;
	
	@GetMapping
	public Iterable<Post> getAll() {
		return this.postManager.findAll();
	}

	@GetMapping("/{id}")
	public Post getById(@PathVariable Long id) {
		return this.postManager.findById(id);
	}
	
	@PostMapping
	public Post create(@RequestBody Post e) {
		return this.postManager.save(e);
	}
	
	@GetMapping("/person/{id}")
	public Iterable<Post> getByPersonId(@PathVariable Long id) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		this.postManager.remove(postManager.findById(id));
	}


}
