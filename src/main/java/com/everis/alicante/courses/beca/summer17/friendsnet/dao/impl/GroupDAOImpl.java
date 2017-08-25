package com.everis.alicante.courses.beca.summer17.friendsnet.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

@Service
public class GroupDAOImpl extends AbstractDAO<Person, Long> implements GroupDAO{

	@Override
	public Group addPersons(Iterable<Person> persons) {
		// TODO Auto-generated method stub
		return null;
	}

}
