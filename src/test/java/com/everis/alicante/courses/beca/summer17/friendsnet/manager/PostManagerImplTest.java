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

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PostDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl.PostManagerImpl;


@RunWith(MockitoJUnitRunner.class)
public class PostManagerImplTest {

	@InjectMocks
	private PostManagerImpl postManagerImpl;

	@Mock
	private PostDAO postDAOMock;

	private Post expectedPost;
 
	@Before
	public void init() {
		this.expectedPost = new Post();
		this.expectedPost.setText("");
		this.expectedPost.setId(1L);
	}

	// Test findAll
	@Test
	public void testFindAll() {
		// Arrange
		Iterable<Post> expectedEvents = new ArrayList<Post>();
		Mockito.when(postDAOMock.findAll()).thenReturn(expectedEvents);

		// Act
		Iterable<Post> events = postManagerImpl.findAll();
		// Assert
		Assert.assertEquals(expectedEvents, events);
	}

	// test FindById
	@Test
	public void testFindById() {
		// Arrange
		final Post post = new Post();
		Mockito.when(postDAOMock.findById(1L)).thenReturn(post);
		// Act
		Post result = postManagerImpl.findById(1L);
		// Assert
		Assert.assertEquals(post, result);
	}
	
	//test findByIds
	@Test
	public void testFindByIds() {
		// Arrange
		final Iterable<Post> listEvent = new ArrayList<Post>();
		final Iterable<Long> expectedIds = new ArrayList<Long>();
		Mockito.when(postDAOMock.findAll(expectedIds)).thenReturn(listEvent);
		// Act
		Iterable<Post> result = postManagerImpl.findAll(expectedIds);
		// Assert
		Assert.assertEquals(listEvent, result); 
	}

	//Test Save1
	@Test
	public void testSave() {
		// Arrange
		final Post post = new Post();
		Mockito.when(postDAOMock.save(expectedPost)).thenReturn(post);
		// Act
		Post result = postManagerImpl.save(expectedPost);
		// Assert
		Assert.assertEquals(post,result);
	}
	
	//test save2
	@Test
	public void testSave2() {
		// Arrange
		final Iterable<Post> listPost = new ArrayList<Post>();
		Mockito.when(postDAOMock.save(listPost)).thenReturn(listPost);
		// Act
		Iterable<Post> result = postManagerImpl.save(listPost);
		// Assert
		Assert.assertEquals(listPost, result);
	}
	//Test Update
	@Test
	public void testUpdate() {
		// Arrange
		final Post post = new Post();
		Mockito.when(postDAOMock.update(expectedPost)).thenReturn(post);
		// Act
		Post result = postManagerImpl.update(expectedPost);
		// Assert
		Assert.assertEquals(post,result);
	}
	
	//test save
	@Test
	public void testUpdate2() {
		// Arrange
		final Iterable<Post> listPost = new ArrayList<Post>();
		Mockito.when(postDAOMock.update(listPost)).thenReturn(listPost);
		// Act
		Iterable<Post> result = postManagerImpl.update(listPost);
		// Assert
		Assert.assertEquals(listPost, result);
	}

	// test remove
	@Test
	public void testRemove() {
		// Arrange
		final Post newPost = new Post();
		Mockito.when(this.postDAOMock.findById(1L)).thenReturn(this.expectedPost);
		// Act
		postDAOMock.remove(newPost); 
		// Assert
		Mockito.verify(this.postDAOMock, Mockito.times(1)).remove(newPost);
	}
	
}