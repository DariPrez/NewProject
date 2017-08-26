package com.everis.alicante.courses.beca.summer17.friendsnet.dao.impl;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;

@Service
public class GroupDAOImpl extends AbstractDAO<Group, Long> implements GroupDAO{
	
	@Override
	public Group addPersons(Iterable<Person> persons) {
		
		return null;
	}

}
