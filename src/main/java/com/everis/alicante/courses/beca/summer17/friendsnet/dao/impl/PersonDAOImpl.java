package com.everis.alicante.courses.beca.summer17.friendsnet.dao.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.AbstractDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;

@Service
public class PersonDAOImpl extends AbstractDAO<Person, Long> implements PersonDAO{

}
