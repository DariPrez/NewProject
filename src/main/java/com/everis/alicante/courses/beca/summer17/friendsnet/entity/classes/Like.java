package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
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
@Table(name = "PersonLike")
public class Like implements FNEntity {

	private static final long serialVersionUID = -2157126812263371942L;

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
	@Column(nullable = true)
	private byte[] picture;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "post_id", nullable = false)
	private Post likeOfPost;

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "person_id", nullable = false)
	private Person likeOfPerson;
	
}
