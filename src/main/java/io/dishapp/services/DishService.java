package io.dishapp.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.dishapp.models.Dish;
import io.dishapp.respository.DishRepository;
@Service
public class DishService {
	@Autowired
	private DishRepository dishRepository;
		
	public List<Dish> getDishes(){
		return (List<Dish>) dishRepository.findAll();
	}
	public Dish getDish(String id){
	
		return dishRepository.findOne(id);
	}
	
	//public Dish getFilteredDishes(String filter, String location, String dish){
		//return dishes.stream().filter(t -> t.getName().equals(filter)).findFirst().get();
	//}
	public void addDish(Dish dish) {
     dishRepository.save(dish);	
	}
}
