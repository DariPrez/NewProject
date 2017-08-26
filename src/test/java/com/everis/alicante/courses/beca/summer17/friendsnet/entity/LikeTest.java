package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.PostType;


public class LikeTest {

	private Post expectedPost;
	private Long expectedId = (long) 123;
	private String expectedText = "";
	private Date expectedCreationDate = null;
	private PostType expectedType = PostType.BIOGRAPHY;
	private byte[] expectedPicture = null;
	
	@Before
	public void init() {
		this.expectedPost = new Post();
		this.expectedPost.setId(expectedId);
		this.expectedPost.setText(expectedText);
		this.expectedPost.setCreationDate(expectedCreationDate);
		this.expectedPost.setType(expectedType);
		this.expectedPost.setPicture(expectedPicture);
		}
	
	@Test
	public void testPost() {
		// Assert
		Assert.assertNotNull(expectedPost);
	}
	
	@Test
	public void testGetId() {
		// Act
		final Long result = this.expectedPost.getId();
		// Assert
		Assert.assertEquals(expectedId, result);
	}
	
	@Test
	public void testSetId() {
		// Arrange
		final Post post = new Post();
		// Act
		post.setId(expectedId);
		// Assert
		Assert.assertEquals(expectedId, Long.valueOf(post.getId()));
	}
	
	@Test
	public void testGetText() {
		// Act
		final String result = this.expectedPost.getText();
		// Assert
		Assert.assertEquals(expectedText, result);
	}
	
	@Test
	public void testSetText() {
		// Arrange
		final Post post = new Post();
		// Act
		post.setText(expectedText);
		// Assert
		Assert.assertEquals(expectedText, post.getText());
	}
	
	@Test
	public void testGetCreationDate() {
		// Act
		final Date result = this.expectedPost.getCreationDate();
		// Assert
		Assert.assertEquals(expectedCreationDate, result);
	}
	
	@Test
	public void testSetCreationDate() {
		// Arrange
		final Post post = new Post();
		// Act
		post.setCreationDate(expectedCreationDate);
		// Assert
		Assert.assertEquals(expectedCreationDate, post.getCreationDate());
	}
	
	@Test
	public void testGetType() {
		// Act
		final PostType result = this.expectedPost.getType();
		// Assert
		Assert.assertEquals(expectedType, result);
	}
	
	@Test
	public void testSetType() {
		// Arrange
		final Post post = new Post();
		// Act
		post.setType(expectedType);
		// Assert
		Assert.assertEquals(expectedType, post.getType());
	}
	
	@Test
	public void testGetPicture() {
		// Act
		final byte[] result = this.expectedPost.getPicture();
		// Assert
		Assert.assertEquals(expectedPicture, result);
	}
	
	@Test
	public void testSetPicture() {
		// Arrange
		final Post post = new Post();
		// Act
		post.setPicture(expectedPicture);
		// Assert
		Assert.assertEquals(expectedPicture, post.getPicture());
	}
	
}
