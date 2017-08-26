package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;

public class PersonTest {

	private Person expectedPerson;
	private Long expectedId = (long) 123;
	private String expectedName = "";
	private String expectedSurname = "";
	private byte[] expectedPicture = null;
	
	@Before
	public void init() {
		this.expectedPerson = new Person();
		this.expectedPerson.setId(expectedId);
		this.expectedPerson.setName(expectedName);
		this.expectedPerson.setSurname(expectedSurname);
		this.expectedPerson.setPicture(expectedPicture);
		}
	
	@Test
	public void testPerson() {
		// Assert
		Assert.assertNotNull(expectedPerson);
	}
	
	@Test
	public void testGetId() {
		// Act
		final Long result = this.expectedPerson.getId();
		// Assert
		Assert.assertEquals(expectedId, result);
	}
	
	@Test
	public void testSetId() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setId(expectedId);
		// Assert
		Assert.assertEquals(expectedId, Long.valueOf(person.getId()));
	}
	
	@Test
	public void testGetName() {
		// Act
		final String result = this.expectedPerson.getName();
		// Assert
		Assert.assertEquals(expectedName, result);
	}
	
	@Test
	public void testSetName() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setName(expectedName);
		// Assert
		Assert.assertEquals(expectedName, person.getName());
	}
	
	@Test
	public void testGetSurname() {
		// Act
		final String result = this.expectedPerson.getSurname();
		// Assert
		Assert.assertEquals(expectedSurname, result);
	}
	
	@Test
	public void testSetSurname() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setSurname(expectedSurname);
		// Assert
		Assert.assertEquals(expectedSurname, person.getSurname());
	}
	
	@Test
	public void testGetPicture() {
		// Act
		final byte[] result = this.expectedPerson.getPicture();
		// Assert
		Assert.assertEquals(expectedPicture, result);
	}
	
	@Test
	public void testSetPicture() {
		// Arrange
		final Person person = new Person();
		// Act
		person.setPicture(expectedPicture);
		// Assert
		Assert.assertEquals(expectedPicture, person.getPicture());
	}
	
}
