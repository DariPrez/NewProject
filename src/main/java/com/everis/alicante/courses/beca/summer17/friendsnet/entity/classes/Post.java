package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;


import java.util.Date;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.PostType;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Post")
public class Post implements FNEntity{

	private static final long serialVersionUID = -8798014172601422856L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;
	
	@Lob
	@Column(nullable = false, length = 255)
	private String text;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, length = 255)
	private Date creationDate;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private PostType type;
	
	@Lob
	@Column(nullable = true)
	private byte[] picture;
	
	@OneToOne(mappedBy = "likeOfPerson", fetch = FetchType.EAGER)
	@JsonIgnore
	private Like postOfLike;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "post_id", nullable = true)
	@JsonIgnore
	private Person postWritter;

	@ManyToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "event_id", nullable = true)
	@JsonIgnore
	private Event postInEvent;
	
}
