package com.eteration.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact {

	@Id
	private int cid;
	private String name;
	private String phone;
	private String address;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}

}
