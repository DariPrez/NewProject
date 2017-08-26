package com.everis.alicante.courses.beca.summer17.friendsnet.controller.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;

public interface GroupController {

	public Iterable<Group> getAll();
	
	public Group getById(Long id);
	
	public Group create(Group e);
	
	public Group getByPersonId(Long id);
	
	public Person relatePersons(Long id,Iterable<Long> newFriendsIds);
	
	public void remove(Long id);
	
}
