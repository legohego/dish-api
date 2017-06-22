package io.dishapp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.dishapp.models.Dish;
import io.dishapp.respository.DishRepository;
import io.dishapp.services.DishService;

public class DishServiceImpl implements DishService {
	
	private DishRepository dishRepository;
	@Autowired
	public DishServiceImpl(DishRepository dishRepository){
		this.dishRepository = dishRepository;
	}
		
	public List<Dish> getDishes(){
		return (List<Dish>) dishRepository.findAll();
	}
	public Dish getDish(String id){
	
		return dishRepository.findOne(id);
	}
	
	public Dish getFilteredDishes(String filter, String location, String dish){
		return null;
	}
	public void createDish(Dish dish) {
     dishRepository.save(dish);	
	}
	@Override
	public void updateDish(Dish dish) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteDish(Dish dish) {
		// TODO Auto-generated method stub
		
	}
}
