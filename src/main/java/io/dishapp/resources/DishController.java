package io.dishapp.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.dishapp.models.Dish;
import io.dishapp.services.DishService;

@RestController
public class DishController {
	@Autowired
	public DishService dishService;
	@RequestMapping("/dishes")
	@ResponseBody
	public List<Dish> getDishes() {
		return dishService.getDishes();
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/dish/{filter}/{location}/{dish}")
	public Dish getFilteredDishes(@PathVariable String filter, @PathVariable String location, @PathVariable String dish) {
		return null; // dishService.getFilteredDishes(filter, location, dish);
	}
	
	@RequestMapping(method=RequestMethod.GET, value = "/dish/{id}")
	public Dish getDishes(@PathVariable String id) {
		return dishService.getDish(id);
	}
	@RequestMapping(method=RequestMethod.POST, value = "/dish/")
	public void setDish(@RequestBody Dish dish){
		dishService.addDish(dish);
	}
}
