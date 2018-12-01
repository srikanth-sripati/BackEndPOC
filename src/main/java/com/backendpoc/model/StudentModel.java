package com.backendpoc.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class StudentModel {

	private Integer id;

	private String name;
	
	private String branch;
	
	private Object photo;//
	
	private Boolean premium_basic;
	
	private Boolean ispeps;

	public StudentModel(Integer id, String name, String branch, Object photo, Boolean premium_basic, Boolean ispeps) {
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.photo = photo;
		this.premium_basic = premium_basic;
		this.ispeps = ispeps;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Object getPhoto() {
		return photo;
	}

	public void setPhoto(Object photo) {
		this.photo = photo;
	}

	public Boolean getPremium_basic() {
		return premium_basic;
	}

	public void setPremium_basic(Boolean premium_basic) {
		this.premium_basic = premium_basic;
	}

	public Boolean getIspeps() {
		return ispeps;
	}

	public void setIspeps(Boolean ispeps) {
		this.ispeps = ispeps;
	}
	
}
