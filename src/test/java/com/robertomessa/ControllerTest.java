package com.robertomessa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class ControllerTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate template;

	@Test
	void findAll() {

		var url = "http://localhost:" + port + "/contactmanager/contacts";
		var str = "[]";

		assertThat(this.template.getForObject(url, String.class)).isEqualTo(str);

	}

}
