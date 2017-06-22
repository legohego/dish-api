package io.dishapp.services;

import java.util.List;

import io.dishapp.models.Dish;

public interface RestaurantService {

	List<Dish> getRestaurants();

	Dish getFilteredRestaurants(String filter, String location, String dish);

	Dish getRestaurants(String id);

	void addRestaurants(Dish dish);

}
