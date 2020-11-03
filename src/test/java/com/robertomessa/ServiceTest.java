package com.robertomessa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.robertomessa.controller.service.ContactServiceImpl;

@SpringBootTest
public class ServiceTest {

	@Autowired
	ContactServiceImpl service;

	@Test
	void findAll() {

		assertThat(this.service.retrieveAll()).isNotNull();

	}

}
