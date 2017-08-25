package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@Autowired
	private PersonManager manager;
	
	@GetMapping
	public Iterable<Person> getAll() {
		return this.manager.findAll();
	}

	@GetMapping("/{id}")
	public Person getById(@PathVariable Long id) {
		return this.manager.findById(id);
	}

	@PostMapping
	public Person create(@RequestBody Person e) {
		return this.manager.save(e);
	}

	@PostMapping("/{id}/relate")
	public Person relatePersons(@PathVariable Long id,@RequestBody List<Person> persons) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		this.manager.remove(manager.findById(id));
	}

}
