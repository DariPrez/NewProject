package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.PersonGroup;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.GroupManager;

@RestController
@RequestMapping("/group")
public class GroupController{
	
	@Autowired
	private GroupManager groupManager;
	
	@GetMapping
	public Iterable<PersonGroup> getAll() {
		return this.groupManager.findAll();
	}

	@GetMapping("/{id}")
	public PersonGroup getById(@PathVariable Long id) {
		return this.groupManager.findById(id);
	}

	@PostMapping
	public PersonGroup create(@RequestBody PersonGroup e) {
		return this.groupManager.save(e);
	}
	
	@GetMapping("/{idperson}")
	public PersonGroup getByPersonId(@PathVariable Long id) {
		return null;
	}
	
	@PostMapping("/{id}/relate")
	public Person relatePersons(@PathVariable Long id,@RequestBody List<Person> persons) {
		return null;
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		this.groupManager.remove(groupManager.findById(id));
	}

}
