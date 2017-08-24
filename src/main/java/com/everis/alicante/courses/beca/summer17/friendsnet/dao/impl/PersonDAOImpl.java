package com.everis.alicante.courses.beca.summer17.friendsnet.dao.impl;

import java.io.Serializable;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

public class PersonDAOImpl extends AbstractDAO<FNEntity, Serializable> implements PersonDAO{

	@Override
	public Person relatePersons(Person person, Iterable<Person> persons) {
		// TODO Auto-generated method stub
		return null;
	}

}
