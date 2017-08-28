package com.everis.alicante.courses.beca.summer17.friendsnet.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PostDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Post;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces.PostManager;

@Service
public class PostManagerImpl implements PostManager {

	@Autowired
	private PostDAO postDao;

	@Override
	public Iterable<Post> findAll() {
		return postDao.findAll();
	}

	@Override
	public Post findById(Long id) {
		return postDao.findById(id);
	}

	@Override
	public Post save(Post e) {
		return postDao.save(e);
	}

	@Override
	public Iterable<Post> save(Iterable<Post> es) {
		return postDao.save(es);
	}

	@Override
	public Post update(Post e) {
		return postDao.update(e);
	}

	@Override
	public Iterable<Post> update(Iterable<Post> es) {
		return postDao.update(es);
	}

	@Override
	public void remove(Post e) {
		postDao.remove(e);
	}

	@Override
	public Post addLike() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Post> findByIds(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	


	

}
