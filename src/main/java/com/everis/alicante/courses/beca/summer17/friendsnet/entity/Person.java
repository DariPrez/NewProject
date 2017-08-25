package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "Person")
public class Person implements FNEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;
	@Lob
	@Column(nullable = false, length = 255)
	private String name;
	@Lob
	@Column(nullable = false, length = 255)
	private String surname;
	@Lob
	@Column(nullable = false)
	private byte[] picture;
	
	@OneToMany(mappedBy = "Group", fetch = FetchType.EAGER)
	private Iterable<Group> groups;
	
	@OneToMany(mappedBy = "Person", fetch = FetchType.EAGER)
	private Iterable<Person> persons;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public byte[] getPicture() {
		return picture;
	}
	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
}
