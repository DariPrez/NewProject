package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.EventDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.EventManager;

@Service
public class EventManagerImpl implements EventManager {

	@Autowired
	private EventDAO eventDao;

	@Override
	public Iterable<Event> findAll() {
		return eventDao.findAll();
	}

	@Override
	public Event findById(Long id) {
		return eventDao.findById(id);
	}

	@Override
	public Event save(Event e) {
		return eventDao.save(e);
	}

	@Override
	public Iterable<Event> save(Iterable<Event> es) {
		return eventDao.save(es);
	}

	@Override
	public Event update(Event e) {
		return eventDao.update(e);
	}

	@Override
	public Iterable<Event> update(Iterable<Event> es) {
		return eventDao.update(es);
	}

	@Override
	public void remove(Event e) {
		eventDao.remove(e);
	}

	@Override
	public Iterable<Event> findAll(Iterable<Long> ids) {
		return eventDao.findAll(ids);
	}
	


	

}
