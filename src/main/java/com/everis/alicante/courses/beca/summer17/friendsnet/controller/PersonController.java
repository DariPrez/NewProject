package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.PersonManager;

@RestController
@RequestMapping("/person")
public class PersonController{
	
	private PersonManager manager;
	
	@GetMapping
	public Iterable<Person> getAll() {
		return manager.findAll();
	}

	@GetMapping("/{id}")
	public Person getById(@RequestParam Long id) {
		return manager.findById(id);
	}

	@PostMapping
	public Person create(@RequestBody Person e) {
		return manager.save(e);
	}

	@PostMapping("/{id}/relate")
	public Person relatePersons(@RequestParam Long id,@RequestBody List<Person> persons) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public Long remove(@RequestParam Long id) {
		return manager.remove(id);
	}


}
