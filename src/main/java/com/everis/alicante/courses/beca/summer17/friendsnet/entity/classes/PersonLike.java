package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.enums.LikeType;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "Like")
public class PersonLike implements FNEntity{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(unique = true, nullable = false)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false, length = 255)
	private Date creationDate;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private LikeType type;
	
	@Lob
	@Column(nullable = false)
	private byte[] picture;


}
