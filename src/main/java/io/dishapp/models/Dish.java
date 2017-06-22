package io.dishapp.models;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Dish {
	@Id
    private String id;

	
	private String name;
	
	private double location;
	
    private String rating;
    
    private ArrayList <String> allergens;
    
    public Dish() {
    	
    }
    public Dish(String id , String name, double location, String rating, String allergens) {
    	this.id = id;
    	this.name = name;
    	this.location = location;
    	this.rating = rating;
    	this.allergens = new ArrayList();
    	this.allergens.add(allergens);
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setAllergens(ArrayList<String> allergens) {
		this.allergens = allergens;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getLocation() {
		return location;
	}
	public void setLocation(double location) {
		this.location = location;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public ArrayList<String> getAllergens() {
		return allergens;
	}
	public void setAllergens(String allergens) {
    	this.allergens.add(allergens);
	}
}
