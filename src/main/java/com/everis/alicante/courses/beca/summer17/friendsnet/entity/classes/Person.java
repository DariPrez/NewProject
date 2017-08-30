package com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.everis.alicante.courses.beca.summer17.friendsnet.entity.FNEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Person")
public class Person implements FNEntity {

	private static final long serialVersionUID = 6927031832679769122L;
	
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
	@Column(nullable = true)
	private byte[] picture;
	
	@OneToMany(mappedBy = "personInGroup", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Group> groups = new HashSet<>();

	@OneToMany(mappedBy = "friends", fetch = FetchType.LAZY)
	@JsonIgnore
	private Set<Person> friends = new HashSet<>();

	@OneToOne(mappedBy = "likeOfPerson", fetch = FetchType.EAGER)
	@JsonIgnore
	private Like liker;

	@OneToOne(mappedBy = "postWritter", fetch = FetchType.EAGER)
	@JsonIgnore
	private Post postWritter;

	@OneToMany(mappedBy = "personInEvent", fetch = FetchType.EAGER)
	@JsonIgnore
	private Set<Event> events = new HashSet<>();
	
	public Set<Person> getFriends() {
	if (this.friends == null) {
		this.friends = new HashSet<Person>();
	}
	return this.friends;
}

}
