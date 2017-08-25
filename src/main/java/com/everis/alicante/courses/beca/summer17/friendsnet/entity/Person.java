package com.everis.alicante.courses.beca.summer17.friendsnet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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

//	@OneToMany(mappedBy = "Group", fetch = FetchType.EAGER)
//	private Iterable<Group> groups;
//
//	@OneToMany(mappedBy = "Person", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//	private Set<Person> friends;
//
//	public Set<Person> getFriends() {
//		if (this.friends == null) {
//			this.friends = new HashSet();
//		}
//		return this.friends;
//	}

}
