package com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.PersonGroup;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.Manager;

public interface GroupManager extends Manager<PersonGroup, Long> {

	PersonGroup addPersons(Iterable<Person> persons);

}
