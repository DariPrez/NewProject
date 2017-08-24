package com.everis.alicante.courses.beca.summer17.friendsnet.manager.interfaces;

import java.util.List;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.Person;

public interface PersonManager extends Manager<Person, Long> {

	Person relatePersons(Long id, List<Long> persons);

}
