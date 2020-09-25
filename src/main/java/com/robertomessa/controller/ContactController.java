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
import org.springframework.web.bind.annotation.CrossOrigin;

import com.robertomessa.controller.model.Contact;
import com.robertomessa.controller.service.ContactService;

@RestController
@RequestMapping(path = "/contactmanager")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@CrossOrigin	
	@PostMapping(path = "/createContact")
	public Contact createContact(@RequestBody Contact contact) {

		return contactService.create(contact.getName(), contact.getDescription());
	}

	@CrossOrigin
	@PutMapping(path = "/updateContact")
	public void updateContact(@RequestBody Contact contact) {

		contactService.update(contact.getId(), contact.getName(), contact.getDescription());

	}

	@CrossOrigin
	@DeleteMapping(path = "/deleteContact/{id}")
	public void deleteContact(@PathVariable Integer id) {

		contactService.delete(id);

	}

	@CrossOrigin
	@GetMapping(path = "/findAll")
	public List<Contact> findAll() {

		return contactService.retrieveAll();

	}

	@CrossOrigin	
	@GetMapping(path = "/findById/{id}")
	public Contact findById(@PathVariable Integer id) {

		return contactService.retrieveById(id);

	}

}
