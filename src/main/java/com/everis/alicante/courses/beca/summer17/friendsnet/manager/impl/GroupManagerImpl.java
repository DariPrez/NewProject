package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.PersonGroup;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.GroupManager;

@Service
public class GroupManagerImpl implements GroupManager {

	@Autowired
	private GroupDAO groupDao;
	
	@Override
	public Iterable<PersonGroup> findAll() {
		return groupDao.findAll();
	}

	@Override
	public PersonGroup findById(Long id) {
		return groupDao.findById(id);
	}

	@Override
	public PersonGroup save(PersonGroup e) {
		return groupDao.save(e);
	}

	@Override
	public Iterable<PersonGroup> save(Iterable<PersonGroup> es) {
		return groupDao.save(es);
	}

	@Override
	public PersonGroup update(PersonGroup e) {
		return groupDao.update(e);
	}

	@Override
	public Iterable<PersonGroup> update(Iterable<PersonGroup> es) {
		return groupDao.update(es);
	}

	@Override
	public void remove(PersonGroup group) {
		groupDao.remove(group);
	}

	@Override
	public PersonGroup addPersons(Iterable<Person> persons) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
