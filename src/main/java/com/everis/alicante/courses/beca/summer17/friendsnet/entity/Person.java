package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Person implements FNEntity {

	@Id
	private Long id;
	private String name;
	private String surname;
	private byte[] picture;
	
}
