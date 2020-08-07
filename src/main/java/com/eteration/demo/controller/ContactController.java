package com.eteration.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eteration.demo.dao.ContactRepository;
import com.eteration.demo.model.Contact;

@Controller
public class ContactController {
	
	@Autowired
	ContactRepository repo;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addContact")
	public String addContact(Contact contact) {
		repo.save(contact);
		return "home.jsp";
	}
	
}
