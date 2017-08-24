package com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces;

import java.io.Serializable;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;

public interface EntityDAO<E extends FNEntity, ID extends Serializable> {

	public Iterable<E> findAll();
	
	public E findById(ID id);
	
	public void save(E e);
	
	public void save(Iterable<E> es);
	
	public void update(E e);
}
