package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.PersonGroup;


public class GroupTest {

	private PersonGroup expectedGroup;
	private Long expectedId = (long) 123;
	private String expectedName = "";
	private byte[] expectedPicture = null;
	
	@Before
	public void init() {
		this.expectedGroup = new PersonGroup();
		this.expectedGroup.setId(expectedId);
		this.expectedGroup.setName(expectedName);
		this.expectedGroup.setPicture(expectedPicture);
		}
	
	@Test
	public void testPerson() {
		// Assert
		Assert.assertNotNull(expectedGroup);
	}
	
	@Test
	public void testGetId() {
		// Act
		final Long result = this.expectedGroup.getId();
		// Assert
		Assert.assertEquals(expectedId, result);
	}
	
	@Test
	public void testSetId() {
		// Arrange
		final PersonGroup group = new PersonGroup();
		// Act
		group.setId(expectedId);
		// Assert
		Assert.assertEquals(expectedId, Long.valueOf(group.getId()));
	}
	
	@Test
	public void testGetName() {
		// Act
		final String result = this.expectedGroup.getName();
		// Assert
		Assert.assertEquals(expectedName, result);
	}
	
	@Test
	public void testSetName() {
		// Arrange
		final PersonGroup group = new PersonGroup();
		// Act
		group.setName(expectedName);
		// Assert
		Assert.assertEquals(expectedName, group.getName());
	}
		
	@Test
	public void testGetPicture() {
		// Act
		final byte[] result = this.expectedGroup.getPicture();
		// Assert
		Assert.assertEquals(expectedPicture, result);
	}
	
	@Test
	public void testSetPicture() {
		// Arrange
		final PersonGroup group = new PersonGroup();
		// Act
		group.setPicture(expectedPicture);
		// Assert
		Assert.assertEquals(expectedPicture, group.getPicture());
	}
	
}
