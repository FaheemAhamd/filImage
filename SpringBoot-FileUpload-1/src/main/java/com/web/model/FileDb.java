package com.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FILE")
public class FileDb {
@Id
    private long id;
	private String name;
	private byte[] conten;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public byte[] getConten() {
		return conten;
	}
	public void setConten(byte[] conten) {
		this.conten = conten;
	}
	public FileDb(long id, String name, byte[] conten) {
		super();
		this.id = id;
		this.name = name;
		this.conten = conten;
	}
	public FileDb(String fileName, String contentType, byte[] bytes) {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
