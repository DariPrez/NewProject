package com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

public interface PersonDAO {

	public Person relatePersons(Person person, Iterable<Person> persons);
	
}
