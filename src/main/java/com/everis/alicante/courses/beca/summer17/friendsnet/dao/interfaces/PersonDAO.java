package com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces;

import java.util.List;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.EntityDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;

public interface PersonDAO extends EntityDAO<Person, Long>{

	Person relatePerson(Long id, List<Person> persons);
	
}
