package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Like;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.LikeType;

public class LikeTest {

	private Like expectedLike;
	private Long expectedId = (long) 123;
	private Date expectedCreationDate = null;
	private LikeType expectedType = LikeType.COOL;
	private Person expectedLikeOfPerson = new Person();
	private Post expectedLikeOfPost = new Post();
	
	@Before
	public void init() {
		this.expectedLike = new Like();
		this.expectedLike.setId(expectedId);
		this.expectedLike.setCreationDate(expectedCreationDate);
		this.expectedLike.setType(expectedType);
		this.expectedLike.setLikeOfPerson(expectedLikeOfPerson);
		this.expectedLike.setLikeOfPost(expectedLikeOfPost);
		}
	
	@Test
	public void testLike() {
		// Assert
		Assert.assertNotNull(expectedLike);
	}
	
	@Test
	public void testGetId() {
		// Act
		final Long result = this.expectedLike.getId();
		// Assert
		Assert.assertEquals(expectedId, result);
	}
	
	@Test
	public void testSetId() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setId(expectedId);
		// Assert
		Assert.assertEquals(expectedId, Long.valueOf(like.getId()));
	}
	
	@Test
	public void testGetCreationDate() {
		// Act
		final Date result = this.expectedLike.getCreationDate();
		// Assert
		Assert.assertEquals(expectedCreationDate, result);
	}
	
	@Test
	public void testSetCreationDate() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setCreationDate(expectedCreationDate);
		// Assert
		Assert.assertEquals(expectedCreationDate, like.getCreationDate());
	}
	
	@Test
	public void testGetType() {
		// Act
		final LikeType result = this.expectedLike.getType();
		// Assert
		Assert.assertEquals(expectedType, result);
	}
	
	@Test
	public void testSetType() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setType(expectedType);
		// Assert
		Assert.assertEquals(expectedType, like.getType());
	}
	
	
	@Test
	public void testGetLikeOfPerson() {
		// Act
		final Person result = this.expectedLike.getLikeOfPerson();
		// Assert
		Assert.assertEquals(expectedLikeOfPerson, result);
	}
	
	@Test
	public void testSetLikeOfPerson() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setLikeOfPerson(expectedLikeOfPerson);
		// Assert
		Assert.assertEquals(expectedLikeOfPerson, like.getLikeOfPerson());
	}
	
	@Test
	public void testGetLikeOfPost() {
		// Act
		final Post result = this.expectedLike.getLikeOfPost();
		// Assert
		Assert.assertEquals(expectedLikeOfPost, result);
	}
	
	@Test
	public void testSetLikeOfPost() {
		// Arrange
		final Like like = new Like();
		// Act
		like.setLikeOfPost(expectedLikeOfPost);
		// Assert
		Assert.assertEquals(expectedLikeOfPost, like.getLikeOfPost());
	}
	
}
