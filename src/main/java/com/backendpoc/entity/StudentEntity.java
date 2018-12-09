package com.backendpoc.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
	@Id
	@Column(name="id")
	private Integer id;

	@Column(name="name")
	private String name;
	
	@Column(name="branch")
	private String branch;
	
	@Column(name="photo")
<<<<<<< HEAD
	private int photo;//
=======
	private Integer photo;//
>>>>>>> branch 'master' of https://github.com/srikanth-sripati/BackEndPOC.git
	
	@Column(name="premium_basic")
	private Boolean premium_basic;
	
	@Column(name="ispeps")
	private Boolean ispeps;

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

<<<<<<< HEAD
	public int getPhoto() {
=======
	public Integer getPhoto() {
>>>>>>> branch 'master' of https://github.com/srikanth-sripati/BackEndPOC.git
		return photo;
	}

<<<<<<< HEAD
	public void setPhoto(int photo) {
=======
	public void setPhoto(Integer photo) {
>>>>>>> branch 'master' of https://github.com/srikanth-sripati/BackEndPOC.git
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
