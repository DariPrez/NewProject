package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.PersonManager;

@Service
public class PersonManagerImpl implements PersonManager {

	@Autowired
	private PersonDAO personDao;
	
	@Override
	public Iterable<Person> findAll() {
		return personDao.findAll();
	}

	@Override
	public Person findById(Long id) {
		return personDao.findById(id);
	}

	@Override
	public Person save(Person e) {
		return personDao.save(e);
	}

	@Override
	public Iterable<Person> save(Iterable<Person> es) {
		return personDao.save(es);
	}

	@Override
	public Person update(Person e) {
		return personDao.update(e);
	}

	@Override
	public Iterable<Person> update(Iterable<Person> es) {
		return personDao.update(es);
	}

	@Override
	public void remove(Person person) {
		personDao.remove(person);
	}

	@Override
	public Person relatePersons(Long id, Iterable<Long> newFriendsIds) {
		Person person = personDao.findById(id);
		Set<Person> friends = (Set<Person>) personDao.findByIds(newFriendsIds);
		person.getPersons().addAll(friends);
		return person;
	}

}
