package com.music.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@XmlRootElement(name="album")
public class Album {

	
	
	private long id;		
	private String name;
	
	@Id
	@XmlAttribute(name="album_id")
	public long getId() {
		return id;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column
	@XmlElement(name="album_name")
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
