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

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.GroupDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Event;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Group;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl.GroupManagerImpl;

@RunWith(MockitoJUnitRunner.class)
public class GroupManagerImplTest {

	@InjectMocks
	private GroupManagerImpl groupManagerImpl;

	@Mock
	private GroupDAO groupDAOMock;

	private Group expectedGroup;
	
	private Iterable<Long> expectedIds;
	
	private Iterable<Group> expectedListGroup;
 
	@Before
	public void init() {
		this.expectedGroup = new Group();
		this.expectedGroup.setName("");
		this.expectedGroup.setId(1L);
		
	}

	// Test findAll
	@Test
	public void testFindAll() {
		// Arrange
		Iterable<Group> expectedGroups = new ArrayList<Group>();
		Mockito.when(groupDAOMock.findAll()).thenReturn(expectedGroups);

		// Act
		Iterable<Group> events = groupManagerImpl.findAll();
		// Assert
		Assert.assertEquals(expectedGroups, events);
	}

	// test FindById
	@Test
	public void testFindById() {
		// Arrange
		final Group group = new Group();
		Mockito.when(groupDAOMock.findById(1L)).thenReturn(group);
		// Act
		Group result = groupManagerImpl.findById(1L);
		// Assert
		Assert.assertEquals(group, result);
	}
	
	//test findByIds
	@Test
	public void testFindByIds() {
		// Arrange
		final Iterable<Group> listGroup = new ArrayList<Group>();
		Mockito.when(groupDAOMock.findAll(expectedIds)).thenReturn(listGroup);
	// Act
		Iterable<Group> result = groupManagerImpl.findAll(expectedIds);
		// Assert
		Assert.assertEquals(listGroup , result); 
	}

	//Test Save1
	@Test
	public void testSave() {
		// Arrange
		final Group group = new Group();
		Mockito.when(groupDAOMock.save(expectedGroup)).thenReturn(group);
		// Act
		Group result = groupManagerImpl.save(expectedGroup);
		// Assert
		Assert.assertEquals(group, result);
	}
	
	//test save2
	@Test
	public void testSave2() {
		// Arrange
		final Iterable<Group> listEvent = new ArrayList<Group>();
		Mockito.when(groupDAOMock.save(expectedListGroup)).thenReturn(listEvent);
		// Act
		Iterable<Group> result = groupManagerImpl.save(expectedListGroup);
		// Assert
		Assert.assertEquals(listEvent, result);
	}
	//Test Update
	@Test
	public void testUpdate() {
		// Arrange
		final Group group = new Group();
		Mockito.when(groupDAOMock.update(expectedGroup)).thenReturn(group);
		// Act
		Group result = groupManagerImpl.update(expectedGroup);
		// Assert
		Assert.assertEquals(group,result);
	}
	
	//test save
	@Test
	public void testUpdate2() {
		// Arrange
		final Iterable<Group> listGroup = new ArrayList<Group>();
		Mockito.when(groupDAOMock.update(expectedListGroup)).thenReturn(listGroup);
		// Act
		Iterable<Group> result = groupManagerImpl.update(expectedListGroup);
		// Assert
		Assert.assertEquals(listGroup, result);
	}

	// test remove
	@Test
	public void testRemove() {
		// Arrange
		final Group newGroup = new Group();
		Mockito.when(this.groupDAOMock.findById(1L)).thenReturn(this.expectedGroup);
		// Act
		groupDAOMock.remove(newGroup); 
		// Assert
		Mockito.verify(this.groupDAOMock, Mockito.times(1)).remove(newGroup);
	}
	
}