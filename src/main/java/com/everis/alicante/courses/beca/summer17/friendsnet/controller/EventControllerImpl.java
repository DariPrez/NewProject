package com.everis.alicante.courses.beca.summer17.friendsnet.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces.EventController;
import com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces.GroupController;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.EventManager;

@RestController
@RequestMapping("/event")
public class EventControllerImpl implements EventController{
	
	@Autowired
	private EventManager eventManager;
	
	@GetMapping
	public Iterable<Event> getAll() {
		return this.eventManager.findAll();
	}

	@GetMapping("/{id}")
	public Event getById(@PathVariable Long id) {
		return this.eventManager.findById(id);
	}

	
	@PostMapping("/{id}/relate")
	public Event addPerson(Long idEvent, Long idPerson) {
		return null;
	}
	
	@GetMapping("/person/{id}")
	public Iterable<Event> getByPersonId(@PathVariable Long id) {
		return null;
	}
	
	@PostMapping
	public Event create(@RequestBody Event e) {
		return this.eventManager.save(e);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable Long id) {
		this.eventManager.remove(eventManager.findById(id));
	}


}
