package io.dishapp.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.dishapp.models.Dish;
import io.dishapp.respository.DishRepository;
@Service
public interface DishService {
	public List<Dish> getDishes();
	public Dish getDish(String id);
	public Dish getFilteredDishes(String filter, String location, String dish);
	public void createDish(Dish dish);
	public void updateDish(Dish dish);
	public void deleteDish(Dish dish);
}
