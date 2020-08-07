package com.eteration.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.eteration.demo.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
