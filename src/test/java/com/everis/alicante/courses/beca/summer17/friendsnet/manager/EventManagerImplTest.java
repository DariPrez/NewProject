package com.everis.alicante.courses.beca.summer17.friendsnet.manager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.EventDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl.EventManagerImpl;


@RunWith(MockitoJUnitRunner.class)
public class EventManagerImplTest {

	@InjectMocks
	private EventManagerImpl eventManagerImpl;

	@Mock
	private EventDAO eventDAOMock;

	private Event expectedEvent;
	
	private Iterable<Long> expectedIds;
	
	private Iterable<Event> expectedListEvents;
 
	@Before
	public void init() {
		this.expectedEvent = new Event();
		this.expectedEvent.setName("");
		this.expectedEvent.setId(1L);
		
	}

	// Test findAll
	@Test
	public void testFindAll() {
		// Arrange
		Iterable<Event> expectedEvents = new ArrayList<Event>();
		Mockito.when(eventDAOMock.findAll()).thenReturn(expectedEvents);

		// Act
		Iterable<Event> events = eventManagerImpl.findAll();
		// Assert
		Assert.assertEquals(expectedEvents, events);
	}

	// test FindById
	@Test
	public void testFindById() {
		// Arrange
		final Event event = new Event();
		Mockito.when(eventDAOMock.findById(1L)).thenReturn(event);
		// Act
		Event result = eventManagerImpl.findById(1L);
		// Assert
		Assert.assertEquals(event, result);
	}
	
	//test findByIds
	@Test
	public void testFindByIds() {
		// Arrange
		final Iterable<Event> listEvent = new ArrayList<Event>();
		Mockito.when(eventDAOMock.findAll(expectedIds)).thenReturn(listEvent);
		// Act
		Iterable<Event> result = eventManagerImpl.findAll(expectedIds);
		// Assert
		Assert.assertEquals(listEvent, result); 
	}

	//Test Save1
	@Test
	public void testSave() {
		// Arrange
		final Event event = new Event();
		Mockito.when(eventDAOMock.save(expectedEvent)).thenReturn(event);
		// Act
		Event result = eventManagerImpl.save(expectedEvent);
		// Assert
		Assert.assertEquals(event,result);
	}
	
	//test save2
	@Test
	public void testSave2() {
		// Arrange
		final Iterable<Event> listEvent = new ArrayList<Event>();
		Mockito.when(eventDAOMock.save(expectedListEvents)).thenReturn(listEvent);
		// Act
		Iterable<Event> result = eventManagerImpl.save(expectedListEvents);
		// Assert
		Assert.assertEquals(listEvent, result);
	}
	//Test Update
	@Test
	public void testUpdate() {
		// Arrange
		final Event event = new Event();
		Mockito.when(eventDAOMock.update(expectedEvent)).thenReturn(event);
		// Act
		Event result = eventManagerImpl.update(expectedEvent);
		// Assert
		Assert.assertEquals(event,result);
	}
	
	//test save
	@Test
	public void testUpdate2() {
		// Arrange
		final Iterable<Event> listEvent = new ArrayList<Event>();
		Mockito.when(eventDAOMock.update(expectedListEvents)).thenReturn(listEvent);
		// Act
		Iterable<Event> result = eventManagerImpl.update(expectedListEvents);
		// Assert
		Assert.assertEquals(listEvent, result);
	}

	// test remove
	@Test
	public void testRemove() {
		// Arrange
		final Event newEvent = new Event();
		Mockito.when(this.eventDAOMock.findById(1L)).thenReturn(this.expectedEvent);
		// Act
		eventDAOMock.remove(newEvent); 
		// Assert
		Mockito.verify(this.eventDAOMock, Mockito.times(1)).remove(newEvent);
	}
	
}