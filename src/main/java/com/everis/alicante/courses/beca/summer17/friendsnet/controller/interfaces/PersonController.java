package com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces;


import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;

public interface PersonController {

	public Iterable<Person> getAll();
	
	public Person getById(Long id);
	
	public Person create(Person e);
	
	public Person relatePersons(Long id,Iterable<Long> newFriendsIds);
	
	public void remove(Long id);
	
}
