package com.robertomessa.controller.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robertomessa.controller.model.Contact;
import com.robertomessa.controller.model.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public List<Contact> retrieveAll() {

		List<Contact> contactList = new ArrayList<Contact>();

		contactRepository.findAll().forEach(costumer -> contactList.add(costumer));

		return contactList;

	}

	@Override
	public Contact retrieveById(Integer id) {

		return contactRepository.findById(id).orElseThrow();

	}

	@Override
	public Contact create(String name, String description) {

		return contactRepository.save(

				new Contact().setName(name).setDescription(description)

		);

	}

	@Override
	public void update(Integer id, String name, String description) {

		contactRepository.save(new Contact().setId(id).setName(name).setDescription(description));
	}

	@Override
	public void delete(Integer id) {

		contactRepository.deleteById(id);

	}

}
