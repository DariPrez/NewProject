package com.everis.alicante.courses.beca.summer17.friendsnet.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;

@Entity
//@Table(name = "Group")
public class PersonGroup implements FNEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(unique = true, nullable = false)
	private Long id;
//	@Getter
//	@Lob
//	@Column(nullable = false, length = 255)
	private String name;
//	@Lob
//	@Column(nullable = false)
	private byte[] picture;

//	@ManyToOne(cascade = { CascadeType.MERGE })
//	@JoinColumn(name = "id", nullable = false)
//	private Person person;

	public Long getId() {
		return id;
	}

//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public byte[] getPicture() {
//		return picture;
//	}
//
//	public void setPicture(byte[] picture) {
//		this.picture = picture;
//	}
//	
	
}
