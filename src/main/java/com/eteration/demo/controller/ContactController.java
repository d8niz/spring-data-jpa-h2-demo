package com.eteration.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/getContact")
	public ModelAndView getContact(@RequestParam int cid) {
		
		ModelAndView mv = new ModelAndView("displayContact.jsp");
		
		
		System.out.println("\n\n\t" +  repo.findByAddress("Ankara"));
		System.out.println("\n\n\t" +  repo.findByCidGreaterThan(115));
		System.out.println("\n\n\t" +  repo.findByCidLessThan(105));
		System.out.println("\n\n\t" +  repo.findByAddressSorted("Ankara"));
		
		Contact contact = repo.findById(cid).orElse(new Contact());
		mv.addObject(contact);
		return mv;
	}
	
	@RequestMapping("/search")
	public String search() {
		return "search.jsp";
	}
	
}
