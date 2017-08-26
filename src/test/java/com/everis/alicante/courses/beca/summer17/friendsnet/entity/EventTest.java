package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.EventType;

public class EventTest {

	private Event expectedEvent;
	private Long expectedId = (long) 123;
	private String expectedName = "";
	private Date expectedStartingDate = null;
	private Date expectedEndingDate = null;
	private EventType expectedType = EventType.PARTY;
	private byte[] expectedPicture = null;
	
	@Before
	public void init() {
		this.expectedEvent = new Event();
		this.expectedEvent.setId(expectedId);
		this.expectedEvent.setName(expectedName);
		this.expectedEvent.setStartingDate(expectedStartingDate);
		this.expectedEvent.setEndingDate(expectedEndingDate);
		this.expectedEvent.setType(expectedType);
		this.expectedEvent.setPicture(expectedPicture);
		}
	
	@Test
	public void testEvent() {
		// Assert
		Assert.assertNotNull(expectedEvent);
	}
	
	@Test
	public void testGetId() {
		// Act
		final Long result = this.expectedEvent.getId();
		// Assert
		Assert.assertEquals(expectedId, result);
	}
	
	@Test
	public void testSetId() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setId(expectedId);
		// Assert
		Assert.assertEquals(expectedId, Long.valueOf(event.getId()));
	}
	
	@Test
	public void testGetName() {
		// Act
		final String result = this.expectedEvent.getName();
		// Assert
		Assert.assertEquals(expectedName, result);
	}
	
	@Test
	public void testSetName() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setName(expectedName);
		// Assert
		Assert.assertEquals(expectedName, event.getName());
	}
	
	@Test
	public void testGetStartingDate() {
		// Act
		final Date result = this.expectedEvent.getStartingDate();
		// Assert
		Assert.assertEquals(expectedStartingDate, result);
	}
	
	@Test
	public void testSetStartingDate() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setStartingDate(expectedStartingDate);
		// Assert
		Assert.assertEquals(expectedStartingDate, event.getStartingDate());
	}
	
	@Test
	public void testGetEndingDate() {
		// Act
		final Date result = this.expectedEvent.getEndingDate();
		// Assert
		Assert.assertEquals(expectedEndingDate, result);
	}
	
	@Test
	public void testSetEndingDate() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setEndingDate(expectedEndingDate);
		// Assert
		Assert.assertEquals(expectedEndingDate, event.getEndingDate());
	}
	
	@Test
	public void testGetType() {
		// Act
		final EventType result = this.expectedEvent.getType();
		// Assert
		Assert.assertEquals(expectedType, result);
	}
	
	@Test
	public void testSetType() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setType(expectedType);
		// Assert
		Assert.assertEquals(expectedType, event.getType());
	}
	
	@Test
	public void testGetPicture() {
		// Act
		final byte[] result = this.expectedEvent.getPicture();
		// Assert
		Assert.assertEquals(expectedPicture, result);
	}
	
	@Test
	public void testSetPicture() {
		// Arrange
		final Event event = new Event();
		// Act
		event.setPicture(expectedPicture);
		// Assert
		Assert.assertEquals(expectedPicture, event.getPicture());
	}
	
}
