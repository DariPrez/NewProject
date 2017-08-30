package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import com.everis.alicante.courses.beca.summer17.friendsnet.dao.interfaces.PersonDAO;
import com.everis.alicante.courses.beca.summer17.friendsnet.entity.classes.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.springtestdbunit.annotation.DatabaseSetup;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonControllerIT {

    @LocalServerPort
    private int port;

    @Autowired
    private PersonDAO dao;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    private ObjectMapper mapper;

    @Before
    public void setup() {

        this.mapper = new ObjectMapper();
    }


    @Test
	@DatabaseSetup("classpath:/initial-person.xml")
	public void testFindAll() throws JSONException {
		// Act
		ResponseEntity<String> response = restTemplate.exchange(createURLWithPort("/person"), HttpMethod.GET, null,
				String.class);
		// Assert
		JSONAssert.assertEquals(
				"[{'id':1, 'name':'Antonio', 'picture':[null], 'surname':'Sanchez'},"
				+ "{'id'=2, 'name'='Fran', 'picture':[null], 'surname':'Periago'}]",
				response.getBody(), false);
	}

    @Test
    public void testFindAllWithContent() throws JSONException {
        //Arrange
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        Person person1 = new Person();
        person1.setName("Pepe");
        person1.setName("Gomez");
        person1.setPicture(null);
        dao.save(person1);


        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/person"),
                HttpMethod.GET, null, String.class);

        // Assert
        JSONAssert.assertEquals("[{ 'name':'Pepe', 'surname':'Gomez'}]", response.getBody(), false);
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}
