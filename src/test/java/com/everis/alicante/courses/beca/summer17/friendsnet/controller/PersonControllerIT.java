package com.everis.alicante.courses.beca.summer17.friendsnet.controller;

import org.json.JSONException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.springtestdbunit.annotation.DatabaseSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PersonControllerIT {

    @LocalServerPort
    private int port;

    TestRestTemplate restTemplate = new TestRestTemplate();

    HttpHeaders headers = new HttpHeaders();

    private ObjectMapper mapper;

    @Before
    public void setup() {
        this.mapper = new ObjectMapper();
    }

    @Test
    @DatabaseSetup("classpath:db/empty-group.xml")
    public void testFindAllNoContent() throws JSONException {
        //Arrange
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/group"),
                HttpMethod.GET, null, String.class);

        // Assert
        JSONAssert.assertEquals("[]", response.getBody(), false);
    }
    

    @Test
    @DatabaseSetup("classpath:db/initial-person.xml")
    public void testFindAllWithContent() throws JSONException {
        //Arrange
        HttpEntity<String> entity = new HttpEntity<String>(null, headers);

        // Act
        ResponseEntity<String> response = restTemplate.exchange(
                createURLWithPort("/person"),
                HttpMethod.GET, null, String.class);

        // Assert
        JSONAssert.assertEquals("[{'id': 1, 'name':'Maria', 'surname':'Lopez'}, {'id': 2, 'name':'Daria', 'surname':'Perez'}]", response.getBody(), false);
    }

    private String createURLWithPort(String uri) {
        return "http://localhost:" + port + uri;
    }
}
