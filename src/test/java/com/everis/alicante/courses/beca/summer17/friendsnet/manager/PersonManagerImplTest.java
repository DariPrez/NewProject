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

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl.PersonManagerImpl;

@RunWith(MockitoJUnitRunner.class)
public class PersonManagerImplTest {

	@InjectMocks
	private PersonManagerImpl personManagerImpl;

	@Mock
	private PersonDAO personDAOMock;

	private Person expectedPerson;
	
 
	@Before
	public void init() {
		this.expectedPerson = new Person();
		expectedPerson.setName("");
		expectedPerson.setId(1L);
	}

	// Test findAll
	@Test
	public void testFindAll() {
		// Arrange
		Iterable<Person> expectPersons = new ArrayList<Person>();
		Mockito.when(personDAOMock.findAll()).thenReturn(expectPersons);

		// Act
		Iterable<Person> persons = personManagerImpl.findAll();
		// Assert
		Assert.assertEquals(expectPersons, persons);
	}

	// test FindById
	@Test
	public void testFindById() {
		// Arrange
		final Person person = new Person();
		Mockito.when(personDAOMock.findById(1L)).thenReturn(person);
		// Act
		Person result = personManagerImpl.findById(1L);
		// Assert
		Assert.assertEquals(person, result);
	}
	
	//test findByIds
	@Test
	public void testFindByIds() {
		// Arrange
		final Iterable<Person> listPerson = new ArrayList<Person>();
		final Iterable<Long> expectedIds = new ArrayList<Long>();
		Mockito.when(personDAOMock.findAll(expectedIds)).thenReturn(listPerson);
		// Act
		Iterable<Person> result = personManagerImpl.findAll(expectedIds);
		// Assert
		Assert.assertEquals(listPerson, result);
	}

	//Test Save1
	@Test
	public void testSave() {
		// Arrange
		final Person person = new Person();
		Mockito.when(personDAOMock.save(expectedPerson)).thenReturn(person);
		// Act
		Person result = personManagerImpl.save(expectedPerson);
		// Assert
		Assert.assertEquals(person,result);
	}
	
	//test save2
	@Test
	public void testSave2() {
		// Arrange
		final Iterable<Person> listPerson = new ArrayList<Person>();
		Mockito.when(personDAOMock.save(listPerson)).thenReturn(listPerson);
		// Act
		Iterable<Person> result = personManagerImpl.save(listPerson);
		// Assert
		Assert.assertEquals(listPerson, result);
	}
	//Test inutil Save
	@Test
	public void testUpdate() {
		// Arrange
		final Person person = new Person();
		Mockito.when(personDAOMock.update(expectedPerson)).thenReturn(person);
		// Act
		Person result = personManagerImpl.update(expectedPerson);
		// Assert
		Assert.assertEquals(person,result);
	}
	
	//test save
	@Test
	public void testUpdate2() {
		// Arrange
		final Iterable<Person> listPerson = new ArrayList<Person>();
		Mockito.when(personDAOMock.update(listPerson)).thenReturn(listPerson);
		// Act
		Iterable<Person> result = personManagerImpl.update(listPerson);
		// Assert
		Assert.assertEquals(listPerson, result);
	}

	// test remove
	@Test
	public void testRemove() {
		// Arrange
		final Person newPerson = new Person();
		Mockito.when(this.personManagerImpl.findById(1L)).thenReturn(this.expectedPerson);
		// Act
		personDAOMock.remove(newPerson); 
		// Assert
		Mockito.verify(this.personDAOMock, Mockito.times(1)).remove(newPerson);
	}
	
	// test remove
	@Test
	public void testRelatePersons() {
//		// Arrange
//		final Person person = new Person();
//		Mockito.when(personDAOMock.update(expectedPerson)).thenReturn(person);
//		// Act
//		Person result = personManagerImpl.update(expectedPerson);
//		// Assert
//		Assert.assertEquals(person,result);
		}
}