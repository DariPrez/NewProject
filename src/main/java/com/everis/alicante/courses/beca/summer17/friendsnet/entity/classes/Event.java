package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.EventType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Event")
public class Event implements FNEntity{

	private static final long serialVersionUID = 872229731665564306L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;
	@Lob
	@Column(nullable = false, length = 255)
	private String name;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, length = 255)
	private Date startingDate;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, length = 255)
	private Date endingDate;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private EventType type;
	
	@Lob
	@Column(nullable = true)
	private byte[] picture;

	@OneToMany(mappedBy = "postInEvent", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Post> posts = new HashSet<>();

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "person_id", nullable = true)
	@JsonIgnore
	private Person personInEvent;
	

}
