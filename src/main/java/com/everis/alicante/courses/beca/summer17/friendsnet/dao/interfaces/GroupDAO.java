package com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.PersonGroup;

public interface GroupDAO extends EntityDAO<PersonGroup, Long>{

	PersonGroup addPersons(Iterable<Person> persons);
}
