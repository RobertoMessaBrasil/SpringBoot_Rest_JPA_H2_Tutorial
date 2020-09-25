package com.robertomessa.controller.service;

import java.util.List;

import com.robertomessa.controller.model.Contact;

public interface ContactService {

	List<Contact> retrieveAll();

	Contact retrieveById(Integer id);

	Contact create(String name, String description);

	void update(Integer id, String name, String description);

	void delete(Integer id);

}
