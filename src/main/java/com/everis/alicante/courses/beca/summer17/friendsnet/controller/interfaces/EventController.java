package com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;

public interface EventController {

	public Iterable<Event> getAll();
	
	public Event getById(Long id);
	
	public Event addPerson(Long idEvent, Long idPerson);
	
	public Iterable<Event> getByPersonId(Long id);
	
	public Event create(Event e);
	
	public void remove(Long id);
	
}
