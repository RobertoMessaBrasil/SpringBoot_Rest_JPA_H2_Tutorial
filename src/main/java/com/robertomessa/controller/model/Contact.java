package com.robertomessa.controller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cont_contact")
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String description;

	public Integer getId() {
		return id;
	}

	public Contact setId(Integer id) {
		this.id = id;

		return this;
	}

	public String getName() {
		return name;
	}

	public Contact setName(String name) {
		this.name = name;

		return this;
	}

	public String getDescription() {
		return description;
	}

	public Contact setDescription(String email) {
		this.description = email;

		return this;

	}
}