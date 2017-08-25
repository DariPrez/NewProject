package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Person implements FNEntity {

	@Getter
	@Setter
	@Id
	private Long id;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private String surname;
	@Getter
	@Setter
	private byte[] picture;
	
}
