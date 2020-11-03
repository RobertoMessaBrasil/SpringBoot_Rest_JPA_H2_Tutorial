package com.robertomessa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RequestMapping(path = "/contactmanager")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@CrossOrigin
	@PostMapping(path = "/contacts")
	public Contact createContact(@RequestBody Contact contact) {

		return contactService.create(contact.getName(), contact.getDescription());
	}

	@CrossOrigin
	@PutMapping(path = "/contacts/{id}")
	public void updateContact(@PathVariable Integer id, @RequestBody Contact contact) {

		contactService.update(id, contact.getName(), contact.getDescription());

	}

	@CrossOrigin
	@DeleteMapping(path = "/contacts/{id}")
	public void deleteContact(@PathVariable Integer id) {

		contactService.delete(id);

	}

	@CrossOrigin
	@GetMapping(path = "/contacts")
	public List<Contact> findAll() {

		return contactService.retrieveAll();

	}

	@CrossOrigin
	@GetMapping(path = "/contacts/{id}")
	public Contact findById(@PathVariable Integer id) {

		return contactService.retrieveById(id);

	}

}
