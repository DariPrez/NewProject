package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import lombok.Getter;
import lombok.Setter;

public class Person implements FNEntity {

	@Getter
	@Setter
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
