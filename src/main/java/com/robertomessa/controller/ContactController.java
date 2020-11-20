package com.robertomessa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.robertomessa.controller.model.Contact;
import com.robertomessa.controller.service.ContactService;

@RestController
@RequestMapping(path = "/contacts")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@PostMapping
	public Contact post(@RequestBody Contact contact) {

		return contactService.create(contact.getName(), contact.getDescription());
	}

	@PutMapping(path = "/{id}")
	public void put(@PathVariable Integer id, @RequestBody Contact contact) {

		contactService.update(id, contact.getName(), contact.getDescription());

	}

	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Integer id) {

		contactService.delete(id);

	}

	@GetMapping
	public List<Contact> get() {

		return contactService.retrieveAll();

	}

	@GetMapping(path = "/{id}")
	public Contact getById(@PathVariable Integer id) {

		return contactService.retrieveById(id);

	}

}
