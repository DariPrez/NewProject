package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.GroupManager;

@Service
public class GroupManagerImpl implements GroupManager {

	@Autowired
	private GroupDAO groupDao;
	
	@Override
	public Iterable<Group> findAll() {
		return groupDao.findAll();
	}

	@Override
	public Group findById(Long id) {
		return groupDao.findById(id);
	}

	@Override
	public Group save(Group e) {
		return groupDao.save(e);
	}

	@Override
	public Iterable<Group> save(Iterable<Group> es) {
		return groupDao.save(es);
	}

	@Override
	public Group update(Group e) {
		return groupDao.update(e);
	}

	@Override
	public Iterable<Group> update(Iterable<Group> es) {
		return groupDao.update(es);
	}

	@Override
	public void remove(Group group) {
		groupDao.remove(group);
	}

	@Override
	public Group addPersons(Iterable<Person> persons) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Group> findAll(Iterable<Long> ids) {
		return groupDao.findAll(ids);
	}

	

}
