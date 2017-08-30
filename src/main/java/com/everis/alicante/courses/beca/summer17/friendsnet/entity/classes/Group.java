package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;


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

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PersonGroup")
public class Group implements FNEntity{

	private static final long serialVersionUID = -1471396161177406387L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;
	@Lob
	@Column(nullable = false, length = 255)
	private String name;
	@Lob
	@Column(nullable = true)
	private byte[] picture;

	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "person_id", nullable = true)
	@JsonIgnore
	private Person personInGroup;

}
