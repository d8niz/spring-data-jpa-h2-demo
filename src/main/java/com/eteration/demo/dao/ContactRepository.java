package com.eteration.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.eteration.demo.model.Contact;

public interface ContactRepository extends CrudRepository<Contact, Integer> {
	
	List<Contact> findByAddress(String city);
	List<Contact> findByCidGreaterThan(int cid);
	List<Contact> findByCidLessThan(int cid);
	
	@Query("from Contact where address=?1 order by name")
	List<Contact> findByAddressSorted(String city);
	
	

}
