package com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.everis.alicante.courses.beca.summer17.friendsnet.manager.Manager;

public interface PersonManager extends Manager<Person, Long> {

	Person relatePersons(Long id, Iterable<Long> newFriendsIds);

}
