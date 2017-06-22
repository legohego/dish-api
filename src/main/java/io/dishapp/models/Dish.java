package io.dishapp.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Dish {
	@Id
    private String id;
	private String name;
	private String restrauntId;
	private String description;
	
    
    public Dish() {
    	
    }
    public Dish(String id , String name, String Description, String RestrauntId) {
    	this.id = id;
    	this.name = name;
    	this.description = description;
    	this.restrauntId = restrauntId;
    }
    public Dish(String name, String Description, String RestrauntId) {
    	this.name = name;
    	this.description = description;
    	this.restrauntId = restrauntId;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRestrauntId() {
		return restrauntId;
	}
	public void setRestrauntId(String restrauntId) {
		this.restrauntId = restrauntId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
