package com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.PersonGroup;

public interface GroupController {

	public Iterable<PersonGroup> getAll();
	
	public PersonGroup getById(Long id);
	
	public PersonGroup create(PersonGroup e);
	
	public PersonGroup getByPersonId(Long id);
	
	public Person relatePersons(Long id,Iterable<Long> newFriendsIds);
	
	public void remove(Long id);
	
}
