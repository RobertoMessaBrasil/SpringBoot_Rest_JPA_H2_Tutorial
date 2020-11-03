package com.robertomessa;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.robertomessa.controller.model.ContactRepository;

@SpringBootTest
public class ModelTest {

	@Autowired
	ContactRepository repository;

	@Test
	void findAll() {

		assertThat(this.repository.findAll()).isNotNull();

	}

}
